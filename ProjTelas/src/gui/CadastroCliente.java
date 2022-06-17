package gui;

import dao.ClienteDAO;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import model.Cliente;
import javax.sql.*;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeString.substr;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class CadastroCliente extends javax.swing.JFrame {
   Cliente c= new Cliente();
    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
        setSize(425, 614);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame2 = new javax.swing.JInternalFrame();
        Simbolo = new javax.swing.JLabel();
        Cadastrar = new javax.swing.JButton();
        TextNome = new javax.swing.JTextField();
        TextEmail = new javax.swing.JTextField();
        TextDt_Nasc = new javax.swing.JFormattedTextField();
        TextTel = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame2.setVisible(true);
        jInternalFrame2.getContentPane().setLayout(null);

        Simbolo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Simbolo.png"))); // NOI18N
        jInternalFrame2.getContentPane().add(Simbolo);
        Simbolo.setBounds(0, 10, 100, 100);

        Cadastrar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/cadastrar.png"))); // NOI18N
        Cadastrar.setActionCommand("Próximo");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(Cadastrar);
        Cadastrar.setBounds(130, 500, 140, 40);

        TextNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNomeActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(TextNome);
        TextNome.setBounds(140, 160, 250, 40);

        TextEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEmailActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(TextEmail);
        TextEmail.setBounds(130, 250, 250, 40);

        try {
            TextDt_Nasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TextDt_Nasc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextDt_Nasc.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        TextDt_Nasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextDt_NascActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(TextDt_Nasc);
        TextDt_Nasc.setBounds(210, 360, 190, 40);

        try {
            TextTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TextTel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextTel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        TextTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextTelActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(TextTel);
        TextTel.setBounds(170, 440, 220, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Tela Cadastro CLIENTE.jpg"))); // NOI18N
        jInternalFrame2.getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 410, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame2, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNomeActionPerformed

    private void TextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEmailActionPerformed
    
    }//GEN-LAST:event_TextEmailActionPerformed

    private void TextDt_NascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextDt_NascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextDt_NascActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
       
        ClienteDAO dao =  new ClienteDAO();
      c.setNome(TextNome.getText());
      c.setTelefone(TextTel.getText());
      c.setEmail(TextEmail.getText());
      c.setDt_nasc(TextDt_Nasc.getText());

//      dao.adiciona(c);
        //JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");
    
    CadastroCliente2 proximo = new CadastroCliente2(c);
   
proximo.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_CadastrarActionPerformed

    private void TextTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextTelActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JLabel Simbolo;
    private javax.swing.JFormattedTextField TextDt_Nasc;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JTextField TextNome;
    private javax.swing.JFormattedTextField TextTel;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
