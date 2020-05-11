/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestellung;

import lieferant.*;
import kunde.*;
import de.creativaweb.artikel.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
/**
 *
 * @author Nail
 */
public class bestellung extends javax.swing.JFrame {
    /**
     * Creates new form startSeite
     */
    public bestellung() {
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

        btn_artikel = new JButton();
        btn_kunde = new JButton();
        btn_lieferant = new JButton();
        btn_mitarbeiter = new JButton();
        btn_bestellungen = new JButton();
        btn_kundenAuftrag = new JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btn_senden = new JButton();
        lable_lieferantenNr = new javax.swing.JLabel();
        field_lieferantenNr = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_bestellung = new javax.swing.JTable();
        btn_suchen = new JButton();
        lable_lieferantenName = new javax.swing.JLabel();
        field_lieferantenName = new javax.swing.JTextField();
        lable_nettowarenbetrag = new javax.swing.JLabel();
        field_nettowarenbetrag = new javax.swing.JTextField();
        lable_bruttowarenbetrag = new javax.swing.JLabel();
        field_bruttowarenbetrag = new javax.swing.JTextField();
        lable_nettopfandbetrag = new javax.swing.JLabel();
        field_nettopfandbetrag = new javax.swing.JTextField();
        lable_bruttopfandbetrag = new javax.swing.JLabel();
        field_bruttopfandbetrag = new javax.swing.JTextField();
        field_gesamtbetrag = new javax.swing.JTextField();
        field_gesamtnetto = new javax.swing.JTextField();
        lable_gesamtnetto = new javax.swing.JLabel();
        lable_gesamtbetrag = new javax.swing.JLabel();

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

        btn_senden.setBackground(new java.awt.Color(170, 170, 170));
        btn_senden.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btn_senden.setForeground(new java.awt.Color(255, 255, 255));
        btn_senden.setText("SENDEN");
        btn_senden.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn_senden.setMaximumSize(new java.awt.Dimension(142, 41));
        btn_senden.setOpaque(true);
        btn_senden.setSize(new java.awt.Dimension(142, 41));

        lable_lieferantenNr.setText("Lieferanten Nr.");

        field_lieferantenNr.setSize(new java.awt.Dimension(300, 25));

        table_bestellung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Artikel Nr", "Artikel Name", "Menge Einkauf", "EK Preis", "Regal"
            }
        ));
        table_bestellung.setRowHeight(31);
        table_bestellung.setShowGrid(false);
        table_bestellung.setShowVerticalLines(true);
        jScrollPane1.setViewportView(table_bestellung);

        btn_suchen.setText("suchen");

        lable_lieferantenName.setText("Lieferanten Name");

        field_lieferantenName.setSize(new java.awt.Dimension(300, 25));

        lable_nettowarenbetrag.setText("Nettowarenbetrag");

        field_nettowarenbetrag.setSize(new java.awt.Dimension(300, 25));

        lable_bruttowarenbetrag.setText("Bruttowarenbetrag");

        field_bruttowarenbetrag.setSize(new java.awt.Dimension(300, 25));

        lable_nettopfandbetrag.setText("Nettopfandbetrag");

        field_nettopfandbetrag.setSize(new java.awt.Dimension(300, 25));

        lable_bruttopfandbetrag.setText("Bruttopfandbetrag");

        field_bruttopfandbetrag.setSize(new java.awt.Dimension(300, 25));

        field_gesamtbetrag.setSize(new java.awt.Dimension(300, 25));

        field_gesamtnetto.setSize(new java.awt.Dimension(300, 25));

        lable_gesamtnetto.setText("Gesamtnetto");

        lable_gesamtbetrag.setText("Gesamtbetrag");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_senden, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lable_nettowarenbetrag)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(field_nettowarenbetrag, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lable_bruttowarenbetrag)
                                        .addGap(18, 18, 18)
                                        .addComponent(field_bruttowarenbetrag, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lable_nettopfandbetrag)
                                            .addComponent(lable_gesamtnetto))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(field_gesamtnetto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lable_gesamtbetrag)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(field_gesamtbetrag, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(field_nettopfandbetrag, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lable_bruttopfandbetrag)
                                                .addGap(18, 18, 18)
                                                .addComponent(field_bruttopfandbetrag, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lable_lieferantenNr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(field_lieferantenNr, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lable_lieferantenName)
                                .addGap(18, 18, 18)
                                .addComponent(field_lieferantenName, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_suchen)))))
                .addContainerGap(46, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lable_lieferantenNr)
                    .addComponent(field_lieferantenNr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lable_lieferantenName)
                    .addComponent(field_lieferantenName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_suchen))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lable_nettowarenbetrag)
                    .addComponent(field_nettowarenbetrag, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lable_bruttowarenbetrag)
                    .addComponent(field_bruttowarenbetrag, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lable_nettopfandbetrag)
                            .addComponent(field_nettopfandbetrag, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lable_bruttopfandbetrag)
                            .addComponent(field_bruttopfandbetrag, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lable_gesamtnetto)
                            .addComponent(field_gesamtnetto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lable_gesamtbetrag)
                            .addComponent(field_gesamtbetrag, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(btn_senden, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_lieferantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lieferantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_lieferantActionPerformed

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
            java.util.logging.Logger.getLogger(bestellung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bestellung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bestellung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bestellung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new bestellung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_artikel;
    private javax.swing.JButton btn_bestellungen;
    private javax.swing.JButton btn_kunde;
    private javax.swing.JButton btn_kundenAuftrag;
    private javax.swing.JButton btn_lieferant;
    private javax.swing.JButton btn_mitarbeiter;
    private javax.swing.JButton btn_senden;
    private javax.swing.JButton btn_suchen;
    private javax.swing.JTextField field_bruttopfandbetrag;
    private javax.swing.JTextField field_bruttowarenbetrag;
    private javax.swing.JTextField field_gesamtbetrag;
    private javax.swing.JTextField field_gesamtnetto;
    private javax.swing.JTextField field_lieferantenName;
    private javax.swing.JTextField field_lieferantenNr;
    private javax.swing.JTextField field_nettopfandbetrag;
    private javax.swing.JTextField field_nettowarenbetrag;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lable_bruttopfandbetrag;
    private javax.swing.JLabel lable_bruttowarenbetrag;
    private javax.swing.JLabel lable_gesamtbetrag;
    private javax.swing.JLabel lable_gesamtnetto;
    private javax.swing.JLabel lable_lieferantenName;
    private javax.swing.JLabel lable_lieferantenNr;
    private javax.swing.JLabel lable_nettopfandbetrag;
    private javax.swing.JLabel lable_nettowarenbetrag;
    private javax.swing.JTable table_bestellung;
    // End of variables declaration//GEN-END:variables
    

}
