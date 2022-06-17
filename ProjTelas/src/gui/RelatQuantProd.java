
package gui;

import connection.ConnectionFactory;
import dao.RelatDAO;
import dao.VendaDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Produto;



public class RelatQuantProd extends javax.swing.JFrame {
    private Connection con;

    VendaDAO vdao = new VendaDAO();
    Produto p = new Produto();
    RelatDAO rdao = new RelatDAO();
    
    public RelatQuantProd() {
        initComponents();
        this.con = new ConnectionFactory().getConnection();
        this.populaCombo();
        setSize(507, 347);
    }
      public void populaCombo(){
          
        String sql = "select produto from produto";
       
        try{
            
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet res = pst.executeQuery();
            
            while(res.next()){
                ComboProd.addItem(res.getString("produto"));
                
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Deu ruim");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        ComboProd = new javax.swing.JComboBox<>();
        busc = new javax.swing.JButton();
        CampoQuant = new javax.swing.JTextField();
        Data2 = new javax.swing.JFormattedTextField();
        Data1 = new javax.swing.JFormattedTextField();
        produdo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(null);

        ComboProd.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ComboProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jInternalFrame1.getContentPane().add(ComboProd);
        ComboProd.setBounds(370, 80, 100, 20);

        busc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Buscar.jpg"))); // NOI18N
        busc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(busc);
        busc.setBounds(190, 130, 80, 30);

        CampoQuant.setEditable(false);
        CampoQuant.setBackground(new java.awt.Color(255, 255, 255));
        CampoQuant.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jInternalFrame1.getContentPane().add(CampoQuant);
        CampoQuant.setBounds(180, 170, 121, 23);

        try {
            Data2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Data2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jInternalFrame1.getContentPane().add(Data2);
        Data2.setBounds(250, 80, 105, 30);

        try {
            Data1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Data1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jInternalFrame1.getContentPane().add(Data1);
        Data1.setBounds(80, 80, 95, 30);
        jInternalFrame1.getContentPane().add(produdo);
        produdo.setBounds(280, 169, 0, 0);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Tela relat PROD.jpg"))); // NOI18N
        jInternalFrame1.getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 480, 280);

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(0, 0, 490, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscActionPerformed

        String data1 = Data1.getText();
        String data2 = Data2.getText();
        String prod = (String)ComboProd.getSelectedItem();
        int quant=rdao.pegaQuant(data1,data2,prod);
        
        CampoQuant.setText(String.valueOf(quant));
     produdo.setText(prod+"s");
      
        
    }//GEN-LAST:event_buscActionPerformed

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
            java.util.logging.Logger.getLogger(RelatQuantProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatQuantProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatQuantProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatQuantProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new RelatQuantProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoQuant;
    private javax.swing.JComboBox<Object> ComboProd;
    private javax.swing.JFormattedTextField Data1;
    private javax.swing.JFormattedTextField Data2;
    private javax.swing.JButton busc;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel produdo;
    // End of variables declaration//GEN-END:variables
}
