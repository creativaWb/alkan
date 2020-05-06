/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lieferant;

import kunde.*;
import de.creativaweb.artikel.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
/**
 *
 * @author Nail
 */
public class lieferant extends javax.swing.JFrame {
    /**
     * Creates new form startSeite
     */
    public lieferant() {
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

        btn_artikel = new javax.swing.JButton();
        btn_kunde = new javax.swing.JButton();
        btn_lieferant = new javax.swing.JButton();
        btn_mitarbeiter = new javax.swing.JButton();
        btn_bestellungen = new javax.swing.JButton();
        btn_kundenAuftrag = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btn_neuerLieferant = new javax.swing.JButton();
        btn_artikelLieferant = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        field_lieferantSuchen = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_lieferant = new javax.swing.JTable();
        btn_suchen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(242, 242, 242));

        btn_artikel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btn_artikel.setText("Artikel");
        btn_artikel.setBorder(null);
        btn_artikel.setBorderPainted(false);
        btn_artikel.setContentAreaFilled(false);
        btn_artikel.setFocusable(false);
        btn_artikel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_artikel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btn_kunde.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btn_kunde.setText("Kunde");
        btn_kunde.setBorder(null);
        btn_kunde.setBorderPainted(false);
        btn_kunde.setContentAreaFilled(false);
        btn_kunde.setFocusable(false);
        btn_kunde.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_kunde.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btn_lieferant.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btn_lieferant.setText("Lieferant");
        btn_lieferant.setBorder(null);
        btn_lieferant.setBorderPainted(false);
        btn_lieferant.setContentAreaFilled(false);
        btn_lieferant.setFocusable(false);
        btn_lieferant.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_lieferant.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_lieferant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lieferantActionPerformed(evt);
            }
        });

        btn_mitarbeiter.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btn_mitarbeiter.setText("Mitarbeiter");
        btn_mitarbeiter.setBorder(null);
        btn_mitarbeiter.setBorderPainted(false);
        btn_mitarbeiter.setContentAreaFilled(false);
        btn_mitarbeiter.setFocusable(false);
        btn_mitarbeiter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_mitarbeiter.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btn_bestellungen.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btn_bestellungen.setText("Bestellungen");
        btn_bestellungen.setBorder(null);
        btn_bestellungen.setBorderPainted(false);
        btn_bestellungen.setContentAreaFilled(false);
        btn_bestellungen.setFocusable(false);
        btn_bestellungen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_bestellungen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btn_kundenAuftrag.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btn_kundenAuftrag.setText("Kunden Auftrag");
        btn_kundenAuftrag.setBorder(null);
        btn_kundenAuftrag.setBorderPainted(false);
        btn_kundenAuftrag.setContentAreaFilled(false);
        btn_kundenAuftrag.setFocusable(false);
        btn_kundenAuftrag.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_kundenAuftrag.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        btn_neuerLieferant.setBackground(new java.awt.Color(170, 170, 170));
        btn_neuerLieferant.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btn_neuerLieferant.setForeground(new java.awt.Color(255, 255, 255));
        btn_neuerLieferant.setText("Neuer Lieferant");
        btn_neuerLieferant.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn_neuerLieferant.setMaximumSize(new java.awt.Dimension(142, 41));
        btn_neuerLieferant.setOpaque(true);
        btn_neuerLieferant.setSize(new java.awt.Dimension(142, 41));
        btn_neuerLieferant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_neuerLieferantMouseClicked(evt);
            }
        });

        btn_artikelLieferant.setBackground(new java.awt.Color(170, 170, 170));
        btn_artikelLieferant.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btn_artikelLieferant.setForeground(new java.awt.Color(255, 255, 255));
        btn_artikelLieferant.setText("Artikel Lieferant");
        btn_artikelLieferant.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn_artikelLieferant.setOpaque(true);
        btn_artikelLieferant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_artikelLieferantMouseClicked(evt);
            }
        });

        jLabel1.setText("Lieferant suchen");

        field_lieferantSuchen.setSize(new java.awt.Dimension(300, 25));

        table_lieferant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "LieferantenNr", "Name", "Adresse", "PLZ", "Ort", "Telefon", "Handy", ""
            }
        ));
        table_lieferant.setRowHeight(31);
        table_lieferant.setShowGrid(false);
        table_lieferant.setShowVerticalLines(true);
        jScrollPane1.setViewportView(table_lieferant);

        btn_suchen.setText("suchen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_artikel)
                        .addGap(33, 33, 33)
                        .addComponent(btn_kunde)
                        .addGap(33, 33, 33)
                        .addComponent(btn_mitarbeiter)
                        .addGap(33, 33, 33)
                        .addComponent(btn_lieferant)
                        .addGap(33, 33, 33)
                        .addComponent(btn_bestellungen)
                        .addGap(33, 33, 33)
                        .addComponent(btn_kundenAuftrag))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(field_lieferantSuchen, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_suchen))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_neuerLieferant, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_artikelLieferant, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_artikel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kunde, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_bestellungen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mitarbeiter, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kundenAuftrag, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_lieferant, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_neuerLieferant, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_artikelLieferant, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field_lieferantSuchen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btn_suchen))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_lieferantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lieferantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_lieferantActionPerformed

    private void btn_artikelLieferantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_artikelLieferantMouseClicked
        // TODO add your handling code here:
        artikelLieferantFrame.setVisible(true);
    }//GEN-LAST:event_btn_artikelLieferantMouseClicked

    private void btn_neuerLieferantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_neuerLieferantMouseClicked
        neuerLieferantFrame.setVisible(true);
    }//GEN-LAST:event_btn_neuerLieferantMouseClicked

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
            java.util.logging.Logger.getLogger(lieferant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lieferant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lieferant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lieferant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lieferant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_artikel;
    private javax.swing.JButton btn_artikelLieferant;
    private javax.swing.JButton btn_bestellungen;
    private javax.swing.JButton btn_kunde;
    private javax.swing.JButton btn_kundenAuftrag;
    private javax.swing.JButton btn_lieferant;
    private javax.swing.JButton btn_mitarbeiter;
    private javax.swing.JButton btn_neuerLieferant;
    private javax.swing.JButton btn_suchen;
    private javax.swing.JTextField field_lieferantSuchen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable table_lieferant;
    // End of variables declaration//GEN-END:variables
    private final neuerLieferant neuerLieferantFrame = new neuerLieferant();
    private final artikelLieferant artikelLieferantFrame = new artikelLieferant();

}
