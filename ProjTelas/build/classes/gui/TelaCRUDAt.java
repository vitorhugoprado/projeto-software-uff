package gui;

import connection.ConnectionFactory;
import dao.ClienteDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cliente;

public class TelaCRUDAt extends javax.swing.JFrame {
private Connection con;
ClienteDAO cdao = new ClienteDAO();
    /**
     * Creates new form TelaCRUD
     */
    public TelaCRUDAt() {
        initComponents();
        setSize(387,452);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        Simbolo = new javax.swing.JLabel();
       
        IncluirCliente = new javax.swing.JButton();
        ConsultarCliente = new javax.swing.JButton();
        AlterarCliente = new javax.swing.JButton();
        DeletarCliente = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        Fundo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(null);
        jInternalFrame1.getContentPane().add(Simbolo);
        Simbolo.setBounds(0, 10, 100, 100);

      
        IncluirCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        IncluirCliente.setText("<html>Incluir Informações<p> do Cliente</html>");
        IncluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncluirClienteActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(IncluirCliente);
        IncluirCliente.setBounds(100, 50, 180, 50);

        ConsultarCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ConsultarCliente.setText("<html>Ler Informações do Cliente</html>");
        ConsultarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarClienteActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(ConsultarCliente);
        ConsultarCliente.setBounds(100, 120, 180, 50);

        AlterarCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AlterarCliente.setText("<html>Alterar Informações<p> do Cliente</html>");
        AlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarClienteActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(AlterarCliente);
        AlterarCliente.setBounds(100, 190, 180, 50);

        DeletarCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DeletarCliente.setText("<html>Deletar Informações<p>do Cliente</html>");
        DeletarCliente.setToolTipText("");
        DeletarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarClienteActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(DeletarCliente);
        DeletarCliente.setBounds(100, 260, 180, 50);

        Sair.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(Sair);
        Sair.setBounds(190, 320, 120, 40);

        Voltar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(Voltar);
        Voltar.setBounds(60, 320, 120, 40);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/TelaCRUD.jpg"))); // NOI18N
        jInternalFrame1.getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 370, 400);

        jPanel1.setLayout(null);
        jInternalFrame1.getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 360, 400);

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(0, 0, 380, 430);

        pack();
    }// </editor-fold>                        

    private void IncluirClienteActionPerformed(java.awt.event.ActionEvent evt) {                                               
       CadastroClienteAt cadastro = new CadastroClienteAt();
       cadastro.setVisible(true);
       this.dispose();
    }                                              

    private void ConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                 
  
       
  String id;
  id=JOptionPane.showInputDialog("Buscar código do cliente:");
  
  cdao.buscarCliente(id);
        
    }                                                

    private void AlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {                                               
       String escolha;
       String cod_cliente;
       String nome=null;
       String dt_nasc=null;
       String telefone=null;
       String email=null;
       String logradouro=null;
       String cep=null;
       int num=0;
       String bairro=null;
       String cidade=null;
       String estado=null;
       
       String resposta="";
      
//        resposta=JOptionPane.showInputDialog("Deseja alterar algo?");
       
        while (!resposta.equals("não")){
            resposta=JOptionPane.showInputDialog("Deseja alterar algo?\n(sim/não)");
            if(resposta.equals("não")){
                JOptionPane.showMessageDialog(null,"OK, nada será alterado, então...");
                break;
            }
            cod_cliente=JOptionPane.showInputDialog("Qual o Código do cliente que você deseja alterar?  ");
            escolha=JOptionPane.showInputDialog("O que você deseja alterar?\nOpções: nome, data de nascimento, telefone\nemail"
                    + ", logradouro, CEP, número\n bairro, cidade, estado");
                switch (escolha){
                    case "nome":
                       cdao.editarClienteNome(cod_cliente,nome);
                       break;
                    case "data de nascimento":
                       cdao.editarClienteDtNasc(cod_cliente,dt_nasc);
                       break;
                    case "telefone":
                       cdao.editarClienteTel(cod_cliente,telefone);
                       break;
                    case "email":
                       cdao.editarClienteEmail(cod_cliente,email);
                       break;
                    case "logradouro":
                       cdao.editarClienteLogradouro(cod_cliente, logradouro);
                       break;
                    case "CEP":
                        cdao.editarClienteCep(cod_cliente, cep);
                        break;
                    case "numero":
                        cdao.editarClienteNum(cod_cliente, num);
                        break;
                    case "bairro":
                        cdao.editarClienteBairro(cod_cliente, bairro);
                        break;
                    case "cidade":
                        cdao.editarClienteCidade(cod_cliente, cidade);
                        break;
                    case "estado":
                        cdao.editarClienteEstado(cod_cliente, estado);
                        break;
                    
                        
                        
                       default:
                           JOptionPane.showMessageDialog(null, "Erro");

            }
//           resposta=JOptionPane.showInputDialog("Deseja Continuar?");   
       }
    
//AlterarCliente alt = new AlterarCliente();
//alt.setVisible(true);
//this.dispose();
    }                                              

    private void DeletarClienteActionPerformed(java.awt.event.ActionEvent evt) {                                               
       
        String cod_cliente;
      cod_cliente=JOptionPane.showInputDialog("Diga qual o código do cliente que deseja excluir:");
      
      cdao.deletarCliente(cod_cliente);
    }                                              

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {     
        JOptionPane.showMessageDialog(null, "Obrigado por usar o programa! Volte sempre!");
this.dispose();        // TODO add your handling code here:
    }                                    

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {                                       
  TelaAtendente volta = new TelaAtendente();
  volta.setVisible(true);
  this.dispose();
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
            java.util.logging.Logger.getLogger(TelaCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCRUDAt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton AlterarCliente;
    private javax.swing.JButton ConsultarCliente;
    private javax.swing.JButton DeletarCliente;
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton IncluirCliente;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel Simbolo;
    private javax.swing.JButton Voltar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
