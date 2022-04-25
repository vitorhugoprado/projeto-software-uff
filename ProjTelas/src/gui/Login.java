package gui;

import dao.ClienteDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Login extends javax.swing.JFrame {
ClienteDAO cdao = new ClienteDAO();
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        setSize(710,448);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        Sair = new javax.swing.JButton();
        Entrar = new javax.swing.JButton();
        doisPontos = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        CSenha = new javax.swing.JPasswordField();
        CTextLogin = new javax.swing.JTextField();
        Senha = new javax.swing.JLabel();
        doisPontos2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(null);

        Sair.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/SAIRDANADA.png"))); // NOI18N
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(Sair);
        Sair.setBounds(390, 330, 130, 40);

        Entrar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/ENTRAAAAAAR.png"))); // NOI18N
        Entrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Entrar.setIconTextGap(0);
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(Entrar);
        Entrar.setBounds(160, 330, 130, 40);

        doisPontos.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        doisPontos.setForeground(new java.awt.Color(255, 204, 102));
        doisPontos.setText(":");
        jInternalFrame1.getContentPane().add(doisPontos);
        doisPontos.setBounds(110, 220, 10, 40);

        Usuario.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
        Usuario.setForeground(new java.awt.Color(235, 201, 119));
        Usuario.setText("Login");
        Usuario.setToolTipText("");
        jInternalFrame1.getContentPane().add(Usuario);
        Usuario.setBounds(40, 210, 120, 60);

        CSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSenhaActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(CSenha);
        CSenha.setBounds(130, 290, 480, 30);
        jInternalFrame1.getContentPane().add(CTextLogin);
        CTextLogin.setBounds(130, 230, 480, 30);

        Senha.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
        Senha.setForeground(new java.awt.Color(255, 204, 102));
        Senha.setText("Senha");
        jInternalFrame1.getContentPane().add(Senha);
        Senha.setBounds(30, 280, 90, 40);

        doisPontos2.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        doisPontos2.setForeground(new java.awt.Color(255, 204, 102));
        doisPontos2.setText(":");
        jInternalFrame1.getContentPane().add(doisPontos2);
        doisPontos2.setBounds(110, 280, 10, 40);

        jPanel1.setLayout(null);

        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(360, 110, 40, 20);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Tela_Principal (fh) (2).jpg"))); // NOI18N
        jPanel1.add(fundo);
        fundo.setBounds(0, 0, 660, 390);

        jInternalFrame1.getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 691, 400);

        jButton1.setText("jButton1");
        jInternalFrame1.getContentPane().add(jButton1);
        jButton1.setBounds(470, 160, 76, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CSenhaActionPerformed

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed

              try{
                String senha = new String (CSenha.getPassword());
                String login = CTextLogin.getText();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancozilla", "root", "");
            String sql = "select * from autentica where login=? and senha=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, login);
            stm.setString(2, senha);
            ResultSet rs = stm.executeQuery();
            if (rs.next()){
               if(login.equals("gerente")){
                   
                    JOptionPane.showMessageDialog(null, "Logado com sucesso!");
                    TelaGerente usuarioTela = new TelaGerente();                    
                    usuarioTela.setVisible(true);
                    this.dispose();
            }
            
            if(login.equals("atendente")){
                    JOptionPane.showMessageDialog(null, "Logado com sucesso!");
                    TelaAtendente tela = new TelaAtendente();
                    tela.setVisible(true);
                    this.dispose();
                    
            }

            } else {   
                   JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!!");
            }
            
                    
                
}catch(Exception CommunicationsException){            
                  JOptionPane.showMessageDialog(null, "Erro ao se comunicar com o banco de dados");
}
               // TODO add your handling code here:
    }//GEN-LAST:event_EntrarActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
      this.dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        relatorio tela = new relatorio();
                    tela.setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CSenha;
    private javax.swing.JTextField CTextLogin;
    private javax.swing.JButton Entrar;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel Senha;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel doisPontos;
    private javax.swing.JLabel doisPontos2;
    private javax.swing.JLabel fundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
