package dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Item;
import model.Produto;
import model.Venda;

public class VendaDAO {
 private Connection con;
  Item i = new Item(); 
   
    
    public void VendaDAO(){
        
//     this.con=new ConnectionFactory().getConnection();   
    }
    
     public int ProcuraCodCliente (Venda v,String nome) {
        int cod=111;
       
        String query = "select cod_cliente from cliente where nome=?";
           this.con=new ConnectionFactory().getConnection();   
	try {
           
            PreparedStatement pst;
            pst = con.prepareStatement(query);
            
            pst.setString(1,nome);
//            pst.setInt(1,cod);
              ResultSet res = pst.executeQuery();	
	if (res.next()) {
           
            v.setCod_cliente(Integer.parseInt(res.getString(1)));
            int codC=v.getCod_cliente();
            
            con.close();
            cod=0;
        }
            
        }catch (SQLException ex) {
            ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Deu ruim");
        }
       
        return cod;
     }	

      public String IncluirVenda(Venda v) {
        String status="";
        String qry;

           qry = "insert into venda(cod_venda,cod_cliente,valor_total,dt_venda,pagamento) values(?,?,?,?,?)";

           try{
             
             this.con=new ConnectionFactory().getConnection();   
          PreparedStatement pst = con.prepareStatement(qry);
       
          
           pst.setInt(1,v.getCod_venda());
           pst.setInt(2, v.getCod_cliente());
           pst.setFloat(3,v.getValor_total());
           pst.setString(4,v.getDt_venda());
           pst.setString(5,v.getForm());
           
          
            pst.execute();
            
            status = "Incluido com sucesso!";
            int codV=v.getCod_venda();
            i.setCod_venda(codV);
            
        }catch(SQLException e){
          status = e.getMessage();
             System.out.println(status+"Deu ruim depois");
    }
                return status;
                
        }
       public int procuraCodProd(Produto p, String prod){
    int cod=111;
       
        String query = "select cod_prod from produto where produto=?";
           this.con=new ConnectionFactory().getConnection();   
	try {
           
            PreparedStatement pst;
            pst = con.prepareStatement(query);
            
            pst.setString(1,prod);

              ResultSet res = pst.executeQuery();	
	if (res.next()) {
            p.setCod_prod(Integer.parseInt(res.getString(1)));
            con.close();
            cod=p.getCod_prod();
        }
            
        }catch (SQLException ex) {
            ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Deu ruim");
        }
       
        return cod;
     }	
      
      public float procuraValorU(Produto p, int codProd){
    float cod=111;
       
        String query = "select preco from produto where cod_prod=?";
           this.con=new ConnectionFactory().getConnection();   
	try {
           
            PreparedStatement pst;
            pst = con.prepareStatement(query);
            
            pst.setInt(1,codProd);
            
              ResultSet res = pst.executeQuery();
	if (res.next()) {
            p.setPreco(Integer.parseInt(res.getString(1)));
            JOptionPane.showMessageDialog(null, p.getPreco());
            con.close();
            cod=p.getPreco();
        }
            
        }catch (SQLException ex) {
            ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Deu ruim no preco");
        }
       
        return cod;
     }	
      
       public int ProcuraCodVenda () {
        int cod=111;
        String query = "select cod_venda from venda order by cod_venda desc limit 1";
           this.con=new ConnectionFactory().getConnection();   
	try {
           
            PreparedStatement pst;
            pst = con.prepareStatement(query);
            
              ResultSet res = pst.executeQuery();	
	if (res.next()) {
           
           cod=(Integer.parseInt(res.getString(1)));
            con.close();
           
        }
            
        }catch (SQLException ex) {
            ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Deu ruim");
        }
       
        return cod;
     }	
       
       public void Atualiza(Venda v, float tot, int codV, String form){
       this.con = new ConnectionFactory().getConnection();
        //Connection con;
        PreparedStatement ps;
        String status = "";
        try {
            ps = con.prepareStatement("update venda set valor_total=?, pagamento=? where cod_venda=?") ;
            
            JOptionPane.showMessageDialog(null,"Cod "+codV);
            
            ps.setFloat(1,tot);
            ps.setString(2,form);
            ps.setInt(3,codV);
           
            int i = ps.executeUpdate();
           
            if (i != 0) {
                status = "Atualizada";
                JOptionPane.showMessageDialog(null,status);
              
                
           } else {
                status = "Não atualizada";
                JOptionPane.showMessageDialog(null,status);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
           // status=e.getMessage();
        }
        
        

    }
       }




