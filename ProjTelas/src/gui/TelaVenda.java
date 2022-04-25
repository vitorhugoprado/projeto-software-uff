package gui;

import dao.ClienteDAO;
import dao.ProdutoDAO;
import java.sql.Connection;
import connection.ConnectionFactory;
import dao.ItemDAO;
import dao.VendaDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Item;
import model.Produto;
import model.Venda;

public class TelaVenda extends javax.swing.JFrame {

  private Connection con;
  VendaDAO vdao = new VendaDAO();
  Venda v = new Venda();
  Produto p = new Produto();
  ProdutoDAO pdao = new ProdutoDAO();
  Item i = new Item();
  ItemDAO idao = new ItemDAO();
  int codI,codV;

    public TelaVenda() {
        initComponents();
        setSize(740,585);
       
        this.con = new ConnectionFactory().getConnection();
        this.populaCombo();
        this.populaCombo2();
    }
    
    public void populaCombo(){
          
        String sql = "select produto from estoque_de_podrutos";
        
        try{
            
            PreparedStatement pst = con.prepareStatement(sql);  
            ResultSet res = pst.executeQuery();
            
            while(res.next()){
                ComboProduto.addItem(res.getString("produto"));
                
            }
            
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Deu ruim");
        }
    }
    
    public void populaCombo2(){
          
        String sql = "select nome from cliente";
        
        try{
            
            PreparedStatement pst = con.prepareStatement(sql);  
            ResultSet res = pst.executeQuery();
            
            while(res.next()){
                ComboNome.addItem(res.getString("nome"));
                
            }
            
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Deu ruim");
        }
    }
    
//public void executaVenda(){
//     
//    String sql = "select nome from cliente";
//    
//    try{
//     PreparedStatement pst = con.prepareStatement(sql);  
//       pst.setString(1, (String) ComboProduto.getSelectedItem());
//    }catch (SQLException ex){
//        JOptionPane.showMessageDialog(null,"Deu erro, mané");
//    }
//}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        simbolo = new javax.swing.JLabel();
        FormDinheiro = new javax.swing.JRadioButton();
        FormCrd = new javax.swing.JRadioButton();
        FormDeb = new javax.swing.JRadioButton();
        FormVale = new javax.swing.JRadioButton();
        TextDataVenda = new javax.swing.JFormattedTextField();
        ComboNome = new javax.swing.JComboBox();
        ComboProduto = new javax.swing.JComboBox();
        TextQuant = new javax.swing.JTextField();
        AddVenda = new javax.swing.JButton();
        AdicionarVenda = new javax.swing.JButton();
        ConcVenda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(null);
        jInternalFrame1.getContentPane().add(simbolo);
        simbolo.setBounds(0, 0, 100, 100);

        FormDinheiro.setBackground(new java.awt.Color(255, 255, 255));
        Grupo1.add(FormDinheiro);
        FormDinheiro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        FormDinheiro.setForeground(new java.awt.Color(255, 255, 255));
        FormDinheiro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FormDinheiro.setContentAreaFilled(false);
        FormDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormDinheiroActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(FormDinheiro);
        FormDinheiro.setBounds(460, 360, 20, 20);

        FormCrd.setBackground(new java.awt.Color(255, 255, 255));
        Grupo1.add(FormCrd);
        FormCrd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        FormCrd.setForeground(new java.awt.Color(255, 255, 255));
        FormCrd.setContentAreaFilled(false);
        FormCrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormCrdActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(FormCrd);
        FormCrd.setBounds(300, 360, 30, 20);

        FormDeb.setBackground(new java.awt.Color(255, 255, 255));
        Grupo1.add(FormDeb);
        FormDeb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        FormDeb.setForeground(new java.awt.Color(255, 255, 255));
        FormDeb.setContentAreaFilled(false);
        jInternalFrame1.getContentPane().add(FormDeb);
        FormDeb.setBounds(380, 360, 30, 20);

        FormVale.setBackground(new java.awt.Color(255, 255, 255));
        Grupo1.add(FormVale);
        FormVale.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        FormVale.setForeground(new java.awt.Color(255, 255, 255));
        FormVale.setContentAreaFilled(false);
        jInternalFrame1.getContentPane().add(FormVale);
        FormVale.setBounds(550, 360, 21, 20);

        try {
            TextDataVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TextDataVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextDataVenda.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jInternalFrame1.getContentPane().add(TextDataVenda);
        TextDataVenda.setBounds(560, 80, 140, 40);

        ComboNome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ComboNome.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        ComboNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboNomeActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(ComboNome);
        ComboNome.setBounds(260, 170, 290, 23);

        ComboProduto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ComboProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        ComboProduto.setBorder(null);
        ComboProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboProdutoActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(ComboProduto);
        ComboProduto.setBounds(270, 250, 290, 20);

        TextQuant.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jInternalFrame1.getContentPane().add(TextQuant);
        TextQuant.setBounds(190, 300, 130, 30);

        AddVenda.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AddVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Adicionar.jpg"))); // NOI18N
        AddVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddVendaActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(AddVenda);
        AddVenda.setBounds(560, 400, 120, 40);

        AdicionarVenda.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        AdicionarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/AddVenda.jpg"))); // NOI18N
        AdicionarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarVendaActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(AdicionarVenda);
        AdicionarVenda.setBounds(570, 160, 130, 40);

        ConcVenda.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ConcVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Concluir.jpg"))); // NOI18N
        ConcVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConcVendaActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(ConcVenda);
        ConcVenda.setBounds(560, 450, 120, 40);

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código do Item", "Produto Comprado", "Quantidade", "Valor Unitário","Valor Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jInternalFrame1.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 400, 510, 90);

        jPanel1.setLayout(null);
        jInternalFrame1.getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 0, 0);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/tela venda.jpg"))); // NOI18N
        jInternalFrame1.getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 710, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FormDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormDinheiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormDinheiroActionPerformed

    private void AddVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddVendaActionPerformed

        
        String produto=(String) ComboProduto.getSelectedItem();
        
        int codI=i.getCod_item();
        codI=codI+1;
        
        
             codV=vdao.ProcuraCodVenda();
        
        int quantidade = Integer.parseInt(TextQuant.getText().toString());
        int codProd = vdao.procuraCodProd(p, produto);
        float ValorU = vdao.procuraValorU(p, codProd );
        float ValorTot = ValorU*quantidade;
        
        i.setCod_venda(codV);
        i.setCod_item(codI);
        i.setCod_prod(codProd);
        i.setValor_unitario(ValorU);
        i.setProd_comprado(produto);
        i.setQuant_item(quantidade);
        
       
        
//        JOptionPane.showMessageDialog(null,"CodVenda: "+i.getCod_venda()+
//                "\nCodItem: "+i.getCod_item()+"\nCod Prod: "+i.getCod_prod()+
//                "\nValor Unitário: "+i.getValor_unitario()+"\nProduto: "+i.getProd_comprado()
//        +"\nQuantidade: "+i.getQuant_item());
        
       
        
        
        DefaultTableModel table1 = (DefaultTableModel)jTable1.getModel();
        
        
        int estMin=pdao.buscaEstMin(codProd);

       int quant=pdao.ProcuraQuant(codProd);
       int quantFinal=quant-quantidade;
        if (quantidade>quant){
            JOptionPane.showMessageDialog(null,"Quantidade no estoque pequena demais para realizar a compra.");
            TextQuant.setText("");
            
       return;
        }
         if (quantFinal<0){
              JOptionPane.showMessageDialog(null,"'"+produto+"' está zerado! Reponha com urgência no estoque");  
              TextQuant.setText("");
              return;
              
       }
        if ( quantFinal>=0 & quantFinal<=estMin){  
           JOptionPane.showMessageDialog(null,"'"+produto+"' está em estoque mínimo! Com apenas "+quantFinal+" produto(s) no estoque. Reposição necessária.");
           
          table1.addRow(new Object[]{codI, produto,quantidade, ValorU, ValorTot});
           idao.InsereItem(i);
        quant= quant-quantidade;      
       pdao.updateQuant(codProd,quant);
       TextQuant.setText("");
       ComboProduto.setSelectedItem("Selecione");
       return; 
       
         }else{
            
        table1.addRow(new Object[]{codI, produto,quantidade, ValorU, ValorTot});
         idao.InsereItem(i);
        quant= quant-quantidade;
        TextQuant.setText("");
               ComboProduto.setSelectedItem("Selecione");
       pdao.updateQuant(codProd,quant);
       
        }
        
       
        
    }//GEN-LAST:event_AddVendaActionPerformed

    private void ComboProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboProdutoActionPerformed

        


        
    }//GEN-LAST:event_ComboProdutoActionPerformed

    private void ComboNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboNomeActionPerformed

    private void AdicionarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarVendaActionPerformed
    VendaDAO dv = new VendaDAO();
    Venda v = new Venda();
    String resp="Não foi";
       
    
        int cod = dv.ProcuraCodCliente(v,ComboNome.getSelectedItem().toString());
        int codC=v.getCod_cliente();
        codV=i.getCod_venda();
        codI=0;
         if (cod==0){  
           
          v.setDt_venda(TextDataVenda.getText());
          
           dv.IncluirVenda(v);
            JOptionPane.showMessageDialog(null, "Venda cadastrada ");
            
         }else   
            System.out.println(resp);
         codI=0;
         
    }//GEN-LAST:event_AdicionarVendaActionPerformed

    private void ConcVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConcVendaActionPerformed
 DefaultTableModel table1 = (DefaultTableModel)jTable1.getModel();

       float tot=0;
       for (int i=0;i<=table1.getRowCount()-1;i++){   
           tot+=Double.parseDouble(table1.getValueAt(i, 4).toString());
           
       }

        for(int i=0;i<table1.getRowCount();){
        table1.removeRow(i); 
        }
        
        String form="";
         
         if(FormDinheiro.isSelected()){
             form="Dinheiro";
             v.setForm(form);         
         }
         if(FormDeb.isSelected()){
             form="Débito";
             v.setForm(form);         
         }
         if(FormCrd.isSelected()){
             form="Crédito";
             v.setForm(form);         
         }
         if(FormVale.isSelected()){
             form="Vale Alimentação";
             v.setForm(form);         
         }
         
         vdao.Atualiza(v, tot, codV, form);
         
         NotaFiscal nf =  new NotaFiscal(codV);
         nf.setVisible(true);
        
    }//GEN-LAST:event_ConcVendaActionPerformed

    private void FormCrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormCrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormCrdActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddVenda;
    private javax.swing.JButton AdicionarVenda;
    private javax.swing.JComboBox ComboNome;
    private javax.swing.JComboBox ComboProduto;
    private javax.swing.JButton ConcVenda;
    private javax.swing.JRadioButton FormCrd;
    private javax.swing.JRadioButton FormDeb;
    private javax.swing.JRadioButton FormDinheiro;
    private javax.swing.JRadioButton FormVale;
    private javax.swing.ButtonGroup Grupo1;
    private javax.swing.JFormattedTextField TextDataVenda;
    private javax.swing.JTextField TextQuant;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel simbolo;
    // End of variables declaration//GEN-END:variables
}
