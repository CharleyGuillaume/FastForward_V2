/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package packageView;

/**
 *
 * @author Charley
 */
public class Insertion extends javax.swing.JFrame {

    /**
     * Creates new form Insertion
     */
    public Insertion() {
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

        insertionLab = new javax.swing.JLabel();
        jSeparatorIns = new javax.swing.JSeparator();
        libelleLab = new javax.swing.JLabel();
        poidsLab = new javax.swing.JLabel();
        jCheckBoxFrag = new javax.swing.JCheckBox();
        dimensionLab = new javax.swing.JLabel();
        hauteurLab = new javax.swing.JLabel();
        largeurLab = new javax.swing.JLabel();
        profondeurLab = new javax.swing.JLabel();
        jCheckBoxEnlRef = new javax.swing.JCheckBox();
        libelle = new javax.swing.JTextField();
        poids = new javax.swing.JTextField();
        hauteur = new javax.swing.JTextField();
        largeur = new javax.swing.JTextField();
        profondeur = new javax.swing.JTextField();
        raisRefLab = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaRaisRef = new javax.swing.JTextArea();
        jButtonInsert = new javax.swing.JButton();
        dateperempLab = new javax.swing.JLabel();
        datePerempSpin = new javax.swing.JSpinner();
        jMenuBar1 = new javax.swing.JMenuBar();
        insertion = new javax.swing.JMenu();
        modification = new javax.swing.JMenu();
        suppression = new javax.swing.JMenu();
        listing = new javax.swing.JMenu();
        recherche = new javax.swing.JMenu();
        destinataire = new javax.swing.JMenuItem();
        livraison = new javax.swing.JMenuItem();
        livraisondate = new javax.swing.JMenuItem();
        quitter = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 100, 0, 0));
        setFocusTraversalPolicyProvider(true);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setResizable(false);

        insertionLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        insertionLab.setText("Insertion");
        insertionLab.setMaximumSize(new java.awt.Dimension(200, 50));
        insertionLab.setMinimumSize(new java.awt.Dimension(200, 50));
        insertionLab.setPreferredSize(new java.awt.Dimension(200, 50));

        libelleLab.setText("Libelle :");

        poidsLab.setText("Poids :");

        jCheckBoxFrag.setText("Fragile");

        dimensionLab.setText("Dimension:");

        hauteurLab.setText("Hauteur :");

        largeurLab.setText("Largeur :");

        profondeurLab.setText("Profondeur :");

        jCheckBoxEnlRef.setText("Enlèvement  Refusé");
        jCheckBoxEnlRef.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxEnlRefItemStateChanged(evt);
            }
        });

        raisRefLab.setText("Raison du refus: ");

        jTextAreaRaisRef.setColumns(20);
        jTextAreaRaisRef.setRows(5);
        jTextAreaRaisRef.setEnabled(false);
        jScrollPane1.setViewportView(jTextAreaRaisRef);

        jButtonInsert.setText("Ajouter!");

        dateperempLab.setText("Date de péremption: ");

        datePerempSpin.setModel(new javax.swing.SpinnerDateModel());
        javax.swing.JSpinner.DateEditor editor= new javax.swing.JSpinner.DateEditor(datePerempSpin,"dd-MM-yyyy");
        datePerempSpin.setEditor(editor);

        insertion.setText("Insertion");
        insertion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                insertionMousePressed(evt);
            }
        });
        jMenuBar1.add(insertion);

        modification.setText("Modification");
        modification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                modificationMousePressed(evt);
            }
        });
        jMenuBar1.add(modification);

        suppression.setText("Suppression");
        suppression.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                suppressionMousePressed(evt);
            }
        });
        jMenuBar1.add(suppression);

        listing.setText("Listing");
        listing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listingMousePressed(evt);
            }
        });
        jMenuBar1.add(listing);

        recherche.setText("Recherche");

        destinataire.setText("Destinataire");
        destinataire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                destinataireMousePressed(evt);
            }
        });
        recherche.add(destinataire);

        livraison.setText("Livraison");
        livraison.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                livraisonMousePressed(evt);
            }
        });
        recherche.add(livraison);

        livraisondate.setText("Livraison par date");
        livraisondate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                livraisondateMousePressed(evt);
            }
        });
        recherche.add(livraisondate);

        jMenuBar1.add(recherche);

        quitter.setText("Quitter");
        quitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                quitterMousePressed(evt);
            }
        });
        jMenuBar1.add(quitter);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addComponent(insertionLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
            .addComponent(jSeparatorIns, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dateperempLab)
                        .addGap(18, 18, 18)
                        .addComponent(datePerempSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonInsert)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(poidsLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBoxFrag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(libelleLab, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(libelle)
                                .addComponent(poids, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(82, 82, 82)
                            .addComponent(dimensionLab)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(profondeurLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hauteurLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(largeurLab, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(profondeur)
                                .addComponent(hauteur)
                                .addComponent(largeur, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jCheckBoxEnlRef)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(raisRefLab)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insertionLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(libelleLab)
                            .addComponent(libelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(poidsLab, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poids, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxFrag))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dimensionLab)
                            .addComponent(hauteurLab)
                            .addComponent(hauteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(largeurLab)
                            .addComponent(largeur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(profondeurLab)
                            .addComponent(profondeur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateperempLab)
                    .addComponent(datePerempSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(raisRefLab)
                        .addComponent(jCheckBoxEnlRef)))
                .addGap(23, 23, 23)
                .addComponent(jButtonInsert)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertionMousePressed
        new Insertion().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_insertionMousePressed

    private void modificationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificationMousePressed
        new Modification().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_modificationMousePressed

    private void suppressionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppressionMousePressed
        new Suppression().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_suppressionMousePressed

    private void listingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listingMousePressed
        new Listing().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_listingMousePressed

    private void destinataireMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_destinataireMousePressed
        new Destinataire().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_destinataireMousePressed

    private void livraisonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_livraisonMousePressed
        new Livraison().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_livraisonMousePressed

    private void livraisondateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_livraisondateMousePressed
        new LivraisonDate().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_livraisondateMousePressed

    private void quitterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitterMousePressed
        System.exit(0);
    }//GEN-LAST:event_quitterMousePressed

    private void jCheckBoxEnlRefItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxEnlRefItemStateChanged
        if(evt.getStateChange()==java.awt.event.ItemEvent.SELECTED)
        {
            raisRefLab.setEnabled(true);
            jTextAreaRaisRef.setEnabled(true);
        }
        else
             if(evt.getStateChange()==java.awt.event.ItemEvent.DESELECTED)
        {
            raisRefLab.setEnabled(false);
            jTextAreaRaisRef.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBoxEnlRefItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Insertion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insertion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insertion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insertion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insertion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner datePerempSpin;
    private javax.swing.JLabel dateperempLab;
    private javax.swing.JMenuItem destinataire;
    private javax.swing.JLabel dimensionLab;
    private javax.swing.JTextField hauteur;
    private javax.swing.JLabel hauteurLab;
    private javax.swing.JMenu insertion;
    private javax.swing.JLabel insertionLab;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JCheckBox jCheckBoxEnlRef;
    private javax.swing.JCheckBox jCheckBoxFrag;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparatorIns;
    private javax.swing.JTextArea jTextAreaRaisRef;
    private javax.swing.JTextField largeur;
    private javax.swing.JLabel largeurLab;
    private javax.swing.JTextField libelle;
    private javax.swing.JLabel libelleLab;
    private javax.swing.JMenu listing;
    private javax.swing.JMenuItem livraison;
    private javax.swing.JMenuItem livraisondate;
    private javax.swing.JMenu modification;
    private javax.swing.JTextField poids;
    private javax.swing.JLabel poidsLab;
    private javax.swing.JTextField profondeur;
    private javax.swing.JLabel profondeurLab;
    private javax.swing.JMenu quitter;
    private javax.swing.JLabel raisRefLab;
    private javax.swing.JMenu recherche;
    private javax.swing.JMenu suppression;
    // End of variables declaration//GEN-END:variables
}