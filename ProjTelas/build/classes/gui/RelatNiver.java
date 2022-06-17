/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.RelatDAO;
import javax.swing.JOptionPane;

public class RelatNiver extends javax.swing.JFrame {
RelatDAO rdao = new RelatDAO();
    public RelatNiver() {
        initComponents();
        setSize(476, 367);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        data2 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        data1 = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(null);

        try {
            data2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        data2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jInternalFrame1.getContentPane().add(data2);
        data2.setBounds(230, 80, 120, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Buscar.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButton1);
        jButton1.setBounds(360, 80, 80, 30);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Data de aniversário"
            }
        ));
        jScrollPane2.setViewportView(jTable3);

        jInternalFrame1.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 190, 420, 90);

        try {
            data1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        data1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        data1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(data1);
        data1.setBounds(80, 80, 100, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Tela relat NIVER.jpg"))); // NOI18N
        jInternalFrame1.getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 450, 300);

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(0, 0, 460, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String Data1 = data1.getText();
       String Data2= data2.getText();
       
        
       String query = "select nome, dt_nasc from cliente where (substring(dt_nasc from 1 for 2) between substring('"+Data1+"' from 1 for 2)and substring('"+Data2+"' from 1 for 2) )\n" +
"and (substring(dt_nasc from 4 for 2) between substring('"+Data1+"' from 4 for 2) and substring('"+Data2+"' from 4 for 2) )\n" +
"order by dt_nasc";
       
       jTable3=rdao.MontaLista(query, jTable3);
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void data1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_data1ActionPerformed

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
            java.util.logging.Logger.getLogger(RelatNiver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatNiver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatNiver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatNiver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatNiver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField data1;
    private javax.swing.JFormattedTextField data2;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
