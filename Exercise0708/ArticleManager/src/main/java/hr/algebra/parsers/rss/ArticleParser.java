package hr.algebra.parsers.rss;

import hr.algebra.factory.ParserFactory;
import hr.algebra.factory.UrlConnectionFactory;
import hr.algebra.model.Article;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class ArticleParser {

    private enum TagType {
        ITEM("item"),
        TITLE("title"),
        LINK("link"),
        DESCRIPTION("description"),
        ENCLOSURE("enclosure"),
        PUB_DATE("pubDate");

        private final String name;

        private TagType(String name) {
            this.name = name;
        }

        private static Optional<TagType> from(String name) {
            for (TagType value : values()) {
                if (value.name.equals(name)) {
                    return Optional.of(value);
                }
            }
            return Optional.empty();
        }

    }

    private static final String RSS_URL = "https://slobodnadalmacija.hr/feed";
    private static final String ATTRIBUTE_URL = "url";
    private static final String EXT = ".jpg";
    private static final String DIR = "assets";

    public static List<Article> parse() throws IOException, XMLStreamException {

        List<Article> articles = new ArrayList<>();

        HttpURLConnection con = UrlConnectionFactory.getHttpUrlConnection(RSS_URL);

        try (InputStream is = con.getInputStream()) {
            XMLEventReader reader = ParserFactory.createStaxParser(is);

            Optional<TagType> tagType = Optional.empty();
            Article article = null;
            StartElement startElement = null;

            while (reader.hasNext()) {
                XMLEvent event = reader.nextEvent();
                switch (event.getEventType()) {
                    case XMLStreamConstants.START_ELEMENT:
                        startElement = event.asStartElement();
                        String qName = startElement.getName().getLocalPart();
                        //System.out.println(qName);
                        tagType = TagType.from(qName);
                        if (tagType.isPresent() && tagType.get().equals(TagType.ITEM)) {
                            article = new Article();
                            articles.add(article);
                        }
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        String data = event.asCharacters().getData();
                        if (tagType.isPresent() && article != null) {
                            switch (tagType.get()) {
                                case TITLE:
                                    if (!data.isBlank()) {
                                        article.setTitle(data);
                                    }
                                    break;
                                case LINK:
                                    if (!data.isBlank()) {
                                        article.setLink(data);
                                    }
                                    break;
                                case DESCRIPTION:
                                    if (!data.isBlank()) {
                                        article.setDescription(data);
                                    }
                                    break;
                                case ENCLOSURE:
                                    break;
                                case PUB_DATE:
                                    if (!data.isBlank()) {
                                        article.setPublishedDate(
                                                LocalDateTime.parse(data, DateTimeFormatter.RFC_1123_DATE_TIME)
                                        );
                                    }
                                    break;
                            }
                        }
                        break;
                }
            }
        }
        return articles;
    }

    private ArticleParser() {
    }

}
