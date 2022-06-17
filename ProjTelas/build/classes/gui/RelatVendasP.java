package gui;

import dao.RelatDAO;
import javax.swing.*;

public class RelatVendasP extends javax.swing.JFrame {
    RelatDAO rdao = new RelatDAO();
    public RelatVendasP() {
        initComponents();
        setSize(877, 470);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        data2 = new javax.swing.JFormattedTextField();
        busca = new javax.swing.JButton();
        CampoVenda = new javax.swing.JTextField();
        data1 = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(null);

        try {
            data2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        data2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        data2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        data2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data2ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(data2);
        data2.setBounds(460, 150, 150, 30);

        busca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/buscar2.jpg"))); // NOI18N
        busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(busca);
        busca.setBounds(680, 140, 90, 40);

        CampoVenda.setEditable(false);
        jInternalFrame1.getContentPane().add(CampoVenda);
        CampoVenda.setBounds(270, 210, 90, 30);

        try {
            data1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        data1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        data1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jInternalFrame1.getContentPane().add(data1);
        data1.setBounds(100, 150, 150, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Venda", "Cod Cliente", "Nome do Cliente", "Total Pago", "Data Venda","Forma de Pagamento"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jInternalFrame1.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 300, 822, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Tela relat VENDA.jpg"))); // NOI18N
        jInternalFrame1.getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 860, 400);

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(0, 0, 860, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void data2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_data2ActionPerformed

    private void buscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaActionPerformed
        String Data1= data1.getText();
        String Data2= data2.getText();

        String query="select v.cod_venda, v.cod_cliente, c.nome , v.valor_total,"
        + "v.dt_venda,v.pagamento from venda v, cliente c where(substring"
        + "(v.dt_venda from 1 for 2) between substring('"+Data1+"' from 1 for 2)"
        + " and substring('"+Data2+"' from 1 for 2) )and (substring"
        + "(v.dt_venda from 4 for 2) between substring('"+Data1+"' from 4 for 2) and "
        + "substring('"+Data2+"' from 4 for 2) )and(substring(v.dt_venda from 7 for 4) "
        + "between substring('"+Data1+"' from 7 for 4)and substring"
        + "('"+Data2+"' from 7 for 4) ) and c.cod_cliente = v.cod_cliente"
        + " order by v.cod_venda;\n";

        jTable1=rdao.MontaLista(query,jTable1);
        int tot=0;
        for(int i=0;i<jTable1.getRowCount();i++){
            tot=tot+1;
        }
        CampoVenda.setText(String.valueOf(tot));

    }//GEN-LAST:event_buscaActionPerformed

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
            java.util.logging.Logger.getLogger(RelatVendasP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatVendasP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatVendasP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatVendasP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatVendasP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoVenda;
    private javax.swing.JButton busca;
    private javax.swing.JFormattedTextField data1;
    private javax.swing.JFormattedTextField data2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
