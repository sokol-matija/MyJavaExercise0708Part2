package hr.algebra.factory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class UrlConnectionFactory {

    private static final int TIMEOUT = 10000;
    private static final String REQUEST_METHOD = "GET";
    private static final String USER_AGENT = "User-Agent";
    private static final String MOZILLA = "Mozilla/5.0";

    public static HttpURLConnection getHttpUrlConnection(String path) throws MalformedURLException, IOException {
        URL url = URI.create(path).toURL();
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setConnectTimeout(TIMEOUT);
        con.setReadTimeout(TIMEOUT);
        con.setRequestMethod(REQUEST_METHOD);
        con.setRequestProperty(USER_AGENT, MOZILLA);
        return con;
    }

    private UrlConnectionFactory() {

    }

}
