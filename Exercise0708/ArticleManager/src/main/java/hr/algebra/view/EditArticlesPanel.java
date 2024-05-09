/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hr.algebra.view;

import hr.algebra.dal.Repository;
import hr.algebra.dal.RepositoryFactory;
import hr.algebra.model.Article;
import hr.algebra.utilities.FileUtils;
import hr.algebra.utilities.IconUtils;
import hr.algebra.utilities.MessageUtils;
import hr.algebra.view.model.ArticleTableModel;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import javax.swing.text.JTextComponent;

/**
 *
 * @author lecturerf6
 */
public class EditArticlesPanel extends javax.swing.JPanel {

    /**
     * Creates new form EditArticlesPanel
     */
    public EditArticlesPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbArticles = new javax.swing.JTable();
        lbIcon = new javax.swing.JLabel();
        tfPicturePath = new javax.swing.JTextField();
        btnChoose = new javax.swing.JButton();
        lbPicturePathError = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfTitle = new javax.swing.JTextField();
        lbTitleError = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfLink = new javax.swing.JTextField();
        lbLinkError = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbDescError = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDesc = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        tfPublishedDate = new javax.swing.JTextField();
        lbPublishedDateError = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        tbArticles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbArticles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbArticlesMouseClicked(evt);
            }
        });
        tbArticles.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbArticlesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbArticles);

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/no_image.png"))); // NOI18N

        tfPicturePath.setEditable(false);

        btnChoose.setText("Choose");
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });

        lbPicturePathError.setForeground(new java.awt.Color(255, 0, 0));
        lbPicturePathError.setText("X");

        jLabel2.setText("Title");

        lbTitleError.setForeground(new java.awt.Color(255, 0, 0));
        lbTitleError.setText("X");

        jLabel4.setText("Link");

        lbLinkError.setForeground(new java.awt.Color(255, 0, 0));
        lbLinkError.setText("X");

        jLabel6.setText("Description");

        lbDescError.setForeground(new java.awt.Color(255, 0, 0));
        lbDescError.setText("X");

        taDesc.setColumns(20);
        taDesc.setLineWrap(true);
        taDesc.setRows(5);
        jScrollPane2.setViewportView(taDesc);

        jLabel8.setText("Date");

        tfPublishedDate.setName("Date"); // NOI18N

        lbPublishedDateError.setForeground(new java.awt.Color(255, 0, 0));
        lbPublishedDateError.setText("X");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfTitle)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbTitleError, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfLink, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbLinkError, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfPublishedDate, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbPublishedDateError, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(86, 86, 86)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane2))
                        .addGap(18, 18, 18)
                        .addComponent(lbDescError, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfPicturePath, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(lbPicturePathError, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnChoose)))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPicturePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChoose)
                            .addComponent(lbPicturePathError, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTitleError, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbLinkError, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDescError, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPublishedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPublishedDateError, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(btnDelete)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private static final String DIR = "assets";
    private List<JTextComponent> validationFields;
    private List<JLabel> errorLabels;

    private Repository repository;
    private ArticleTableModel model;

    private Article selectedArticle;

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        File file = FileUtils.uploadFile("Images", "jpg", "jpeg", "png");
        if (file == null) {
            return;
        }
        tfPicturePath.setText(file.getAbsolutePath());
        setIcon(lbIcon, file);
    }//GEN-LAST:event_btnChooseActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        init();
    }//GEN-LAST:event_formComponentShown

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        if (!formValid()) {
            return;
        }

        try {

            String localPath = uploadPicture();

            Article article = new Article(
                    tfTitle.getText().trim(),
                    tfLink.getText().trim(),
                    taDesc.getText().trim(),
                    localPath,
                    LocalDateTime.parse(
                            tfPublishedDate.getText().trim(),
                            Article.DATE_FORMATTER
                    ));

            repository.createArticle(article);

            model.setArticles(repository.selectArticles());

            clearForm();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void tbArticlesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbArticlesKeyReleased
        showArticle();
    }//GEN-LAST:event_tbArticlesKeyReleased

    private void tbArticlesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbArticlesMouseClicked
        showArticle();
    }//GEN-LAST:event_tbArticlesMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (selectedArticle == null) {
            MessageUtils.showInformationMessage("Info", "Select article");
            return;
        }

        if (!formValid()) {
            return;
        }

        try {

            if (tfPicturePath.getText().trim().equals(selectedArticle.getPicturePath())) {

                if (selectedArticle.getPicturePath() != null) {
                    Files.deleteIfExists(Paths.get(selectedArticle.getPicturePath()));
                }

                String localPath = uploadPicture();
                selectedArticle.setPicturePath(localPath);
            }

            selectedArticle.setTitle(tfTitle.getText().trim());
            selectedArticle.setLink(tfLink.getText().trim());
            selectedArticle.setDescription(taDesc.getText().trim());
            selectedArticle.setPublishedDate(LocalDateTime.parse(
                    tfPublishedDate.getText().trim(),
                    Article.DATE_FORMATTER));

            repository.updateArticle(selectedArticle.getId(), selectedArticle);

            model.setArticles(repository.selectArticles());

            clearForm();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (selectedArticle == null) {
            MessageUtils.showInformationMessage("Info", "Select article");
            return;
        }

        try {

            if (selectedArticle.getPicturePath() != null) {
                Files.deleteIfExists(Paths.get(selectedArticle.getPicturePath()));
            }

            repository.deleteArticle(selectedArticle.getId());

            model.setArticles(repository.selectArticles());

            clearForm();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void init() {
        try {
            initValidation();
            hideErrors();
            initRepository();
            initTable();
        } catch (Exception ex) {
            Logger.getLogger(EditArticlesPanel.class.getName()).log(Level.SEVERE, null, ex);
            MessageUtils.showErrorMessage("Unrecoverable error", "Cannot initiate the form");
            System.exit(1);
        }
    }

    private void initValidation() {
        validationFields = Arrays.asList(
                tfTitle,
                tfLink,
                taDesc,
                tfPublishedDate,
                tfPicturePath
        );
        errorLabels = Arrays.asList(
                lbTitleError,
                lbLinkError,
                lbDescError,
                lbPublishedDateError,
                lbPicturePathError
        );
    }

    private void hideErrors() {
        errorLabels.forEach(e -> e.setVisible(false));
    }

    private boolean formValid() {
        hideErrors();
        boolean ok = true;

        for (int i = 0; i < validationFields.size(); i++) {
            ok &= !validationFields.get(i).getText().trim().isEmpty();
            errorLabels.get(i).setVisible(validationFields.get(i).getText().trim().isEmpty());

            if ("Date".equals(validationFields.get(i).getName())) {
                try {
                    LocalDateTime.parse(
                            tfPublishedDate.getText().trim(),
                            Article.DATE_FORMATTER
                    );
                } catch (Exception e) {
                    ok = false;
                    errorLabels.get(i).setVisible(true);
                }
            }

        }
        return ok;
    }

    private void clearForm() {
        hideErrors();
        validationFields.forEach(e -> e.setText(""));
        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/no_image.png")));
        selectedArticle = null;
    }

    private void setIcon(JLabel label, File file) {
        try {
            label.setIcon(IconUtils.createIcon(file, label.getWidth(), label.getHeight()));
        } catch (IOException ex) {
            Logger.getLogger(EditArticlesPanel.class.getName()).log(Level.SEVERE, null, ex);
            MessageUtils.showErrorMessage("Error", "Unable to set icon!");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnChoose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbDescError;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbLinkError;
    private javax.swing.JLabel lbPicturePathError;
    private javax.swing.JLabel lbPublishedDateError;
    private javax.swing.JLabel lbTitleError;
    private javax.swing.JTextArea taDesc;
    private javax.swing.JTable tbArticles;
    private javax.swing.JTextField tfLink;
    private javax.swing.JTextField tfPicturePath;
    private javax.swing.JTextField tfPublishedDate;
    private javax.swing.JTextField tfTitle;
    // End of variables declaration//GEN-END:variables

    private void initRepository() {
        repository = RepositoryFactory.getInstance();
    }

    private void initTable() throws Exception {

        tbArticles.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tbArticles.setRowHeight(25);
        tbArticles.setAutoCreateRowSorter(true);

        model = new ArticleTableModel(repository.selectArticles());
        tbArticles.setModel(model);

    }

    private String uploadPicture() throws IOException {

        String path = tfPicturePath.getText();
        String ext = path.substring(path.lastIndexOf("."));

        String name = UUID.randomUUID() + ext;

        String localPath = DIR + File.separator + name;

        FileUtils.copy(path, localPath);

        return localPath;

    }

    private void showArticle() {
        int selectedRow = tbArticles.getSelectedRow();
        int rowIndex = tbArticles.convertRowIndexToModel(selectedRow);

        try {
            int id = (int) model.getValueAt(rowIndex, 0);
            Optional<Article> opt = repository.selectArticle(id);
            if (opt.isPresent()) {
                selectedArticle = opt.get();
                feelCollins(selectedArticle);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void feelCollins(Article article) {
        tfTitle.setText(article.getTitle());
        tfLink.setText(article.getLink());
        taDesc.setText(article.getDescription());
        tfPublishedDate.setText(article.getPublishedDate().format(Article.DATE_FORMATTER));

        if (article.getPicturePath() != null && Files.exists(Paths.get(article.getPicturePath()))) {
            tfPicturePath.setText(article.getPicturePath());
            setIcon(lbIcon, new File(article.getPicturePath()));
        }

    }
}
