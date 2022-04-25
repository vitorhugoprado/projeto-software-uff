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
public class CadastroClienteAt extends javax.swing.JFrame {
   Cliente c= new Cliente();
   ClienteDAO dao =  new ClienteDAO();
        
    public CadastroClienteAt() {
        initComponents();
        setSize(408,550);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jInternalFrame2 = new javax.swing.JInternalFrame();
        Simbolo = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Dt_Nasc = new javax.swing.JLabel();
        Tel = new javax.swing.JLabel();
        Cadastrar = new javax.swing.JButton();
        TextoCadastro1 = new javax.swing.JLabel();
        TextNome = new javax.swing.JTextField();
        TextEmail = new javax.swing.JTextField();
        TextDt_Nasc = new javax.swing.JFormattedTextField();
        TextTel = new javax.swing.JFormattedTextField();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame2.setVisible(true);
        jInternalFrame2.getContentPane().setLayout(null);

        Simbolo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Simbolo.png"))); // NOI18N
        jInternalFrame2.getContentPane().add(Simbolo);
        Simbolo.setBounds(0, 0, 100, 100);

        Nome.setBackground(new java.awt.Color(204, 102, 0));
        Nome.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        Nome.setForeground(new java.awt.Color(255, 204, 102));
        Nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nome.setText("Nome:");
        jInternalFrame2.getContentPane().add(Nome);
        Nome.setBounds(30, 120, 90, 40);

        Email.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 204, 102));
        Email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Email.setText("Email:");
        jInternalFrame2.getContentPane().add(Email);
        Email.setBounds(30, 220, 90, 30);

        Dt_Nasc.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        Dt_Nasc.setForeground(new java.awt.Color(255, 204, 102));
        Dt_Nasc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dt_Nasc.setText("<html>\n Data de<p> \nNascimento:\n</html>");
        jInternalFrame2.getContentPane().add(Dt_Nasc);
        Dt_Nasc.setBounds(10, 270, 150, 80);

        Tel.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        Tel.setForeground(new java.awt.Color(255, 204, 102));
        Tel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tel.setText("Telefone:");
        jInternalFrame2.getContentPane().add(Tel);
        Tel.setBounds(20, 380, 120, 50);

        Cadastrar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Cadastrar.setText("Cadastrar");
        Cadastrar.setActionCommand("Próximo");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(Cadastrar);
        Cadastrar.setBounds(120, 430, 140, 40);

        TextoCadastro1.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        TextoCadastro1.setForeground(new java.awt.Color(255, 204, 102));
        TextoCadastro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoCadastro1.setText("Cadastro do Cliente:");
        jInternalFrame2.getContentPane().add(TextoCadastro1);
        TextoCadastro1.setBounds(100, 20, 250, 20);

        TextNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNomeActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(TextNome);
        TextNome.setBounds(120, 120, 250, 40);

        TextEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEmailActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(TextEmail);
        TextEmail.setBounds(120, 210, 250, 40);

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
        TextDt_Nasc.setBounds(160, 310, 210, 40);

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
        TextTel.setBounds(150, 380, 220, 40);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Fundo cadastro.jpg"))); // NOI18N
        jInternalFrame2.getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 380, 484);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void TextNomeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void TextEmailActionPerformed(java.awt.event.ActionEvent evt) {                                          
    
    }                                         

    private void TextDt_NascActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {                                          
       

      c.setNome(TextNome.getText());
      c.setTelefone(TextTel.getText());
      c.setEmail(TextEmail.getText());
      c.setDt_nasc(TextDt_Nasc.getText());

//      dao.adiciona(c);
        //JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");
    
    CadastroCliente2At proximo = new CadastroCliente2At(c);
   
proximo.setVisible(true);
     this.dispose();
    }                                         

    private void TextTelActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

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

    // Variables declaration - do not modify                     
    private javax.swing.JButton Cadastrar;
    private javax.swing.JLabel Dt_Nasc;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Simbolo;
    private javax.swing.JLabel Tel;
    private javax.swing.JFormattedTextField TextDt_Nasc;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JTextField TextNome;
    private javax.swing.JFormattedTextField TextTel;
    private javax.swing.JLabel TextoCadastro1;
    private javax.swing.JInternalFrame jInternalFrame2;
    // End of variables declaration                   
}
