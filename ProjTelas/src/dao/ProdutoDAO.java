package dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Produto;

public class ProdutoDAO{
    private Connection con;
    
    public ProdutoDAO(){
        this.con=new ConnectionFactory().getConnection();
}
public void adiciona (Produto p){
    String sql = "INSERT INTO produto(produto, quantidade, preco, estMin)"
            + "VALUES (?,?,?,?)";
    try{
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, p.getProduto());
        stmt.setInt(2, p.getQuantidade());
        stmt.setFloat(3, p.getPreco());
        stmt.setInt(4, p.getEstMin());
        
        stmt.executeUpdate();
        stmt.close();
}catch (SQLException u){
    JOptionPane.showMessageDialog(null,"Deu erro na hora de inserir");
    throw new RuntimeException(u);
}
}

public int ProcuraQuant(int codProd){
    int quant=0;
    String sql= "SELECT quantidade FROM produto WHERE cod_prod="+codProd;
    try{
      PreparedStatement stmt= con.prepareStatement(sql);
      ResultSet rs=stmt.executeQuery();
      
      if (rs.next()){
          quant=(rs.getInt(1));
      }
    }catch (SQLException m){
        String Status = m.getMessage();
        System.out.println(Status);
    }
    return quant;
}

    public void buscarProduto(String id){
    this.con = new ConnectionFactory().getConnection();
    String sql ="";
    
    sql="select * from produto where cod_prod='"+id+"'";
    
    try{
        PreparedStatement stm = con.prepareStatement(sql);
        ResultSet res = stm.executeQuery();
        while (res.next()){
            
            String produto = (res.getString(2));
            int quantidade = (res.getInt(3));
            float preco = (res.getFloat(4));
            int estMin = (res.getInt(5));
           
            
            JOptionPane.showMessageDialog(null,"Informações do Produto:\nNome do produto: "+produto+""
                    + "\nquantidade em estoque: "+quantidade+"\npreço do produto: "
                            + " "+preco+"\nEstoque Mínimo do Produto: "+estMin);
            
    }
}catch (SQLException e){
    e.printStackTrace();
}
    
}
    public void editarProdutoNome(String cod_prod, String produto){
        this.con = new ConnectionFactory().getConnection();
        
        String sql="";
       PreparedStatement ps;
       String status="";
        produto=JOptionPane.showInputDialog(null,"Digite o novo nome do produto:");
        try{
            ps= con.prepareStatement("update produto set produto=? where cod_prod=?");
            
            ps.setString(1,produto);
            ps.setString(2,cod_prod);
            
            int i = ps.executeUpdate();
            if(i!=0){
                status="Nome do produto alterado com sucesso!";
                JOptionPane.showMessageDialog(null, status);
            }else{
                status="Não foi possível alterar o nome do produto...";
                JOptionPane.showMessageDialog(null, status);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void editarProdutoDesc(String cod_prod, String desc){
        this.con = new ConnectionFactory().getConnection();
        
        String sql="";
       PreparedStatement ps;
       String status="";
        desc=JOptionPane.showInputDialog(null,"Digite a nova descrição:");
        try{
            ps= con.prepareStatement("update produto set descricao=? where cod_prod=?");
            
            ps.setString(1,desc);
            ps.setString(2,cod_prod);
            
            int i = ps.executeUpdate();
            if(i!=0){
                status="Descrição alterada com sucesso!";
                JOptionPane.showMessageDialog(null, status);
            }else{
                status="Não foi possível alterar a descrição...";
                JOptionPane.showMessageDialog(null, status);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void editarProdutoQuant(String cod_prod, int quantidade){
        this.con = new ConnectionFactory().getConnection();
        
        String sql="";
       PreparedStatement ps;
       String status="";
        quantidade=Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade"));
        try{
            ps= con.prepareStatement("update produto set quantidade=? where cod_prod=?");
            
            ps.setInt(1,quantidade);
            ps.setString(2,cod_prod);
            
            int i = ps.executeUpdate();
            if(i!=0){
                status="Quantidade alterada com sucesso!";
                JOptionPane.showMessageDialog(null, status);
            }else{
                status="Não foi possível alterar a quantidade...";
                JOptionPane.showMessageDialog(null, status);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void editarProdutoPreco(String cod_prod, float preco){
        this.con = new ConnectionFactory().getConnection();
        
        String sql="";
       PreparedStatement ps;
       String status="";
        preco=Float.parseFloat(JOptionPane.showInputDialog("Digite o novo preço do produto: "));
        try{
            ps= con.prepareStatement("update produto set preco=? where cod_prod=?");
            
            ps.setFloat(1,preco);
            ps.setString(2,cod_prod);
            
            int i = ps.executeUpdate();
            if(i!=0){
                status="Preço alterado com sucesso!";
                JOptionPane.showMessageDialog(null, status);
            }else{
                status="Não foi possível alterar o preço...";
                JOptionPane.showMessageDialog(null, status);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void editarEstoqueMinimo(String cod_prod, int estMin){
        this.con = new ConnectionFactory().getConnection();
        
        String sql="";
       PreparedStatement ps;
       String status="";
        estMin=Integer.parseInt(JOptionPane.showInputDialog("Digite o novo estoque mínimo do produto: "));
        try{
            ps= con.prepareStatement("update produto set estMin=? where cod_prod=?");
            
            ps.setInt(1,estMin);
            ps.setString(2,cod_prod);
            
            int i = ps.executeUpdate();
            if(i!=0){
                status="Estoque alterado com sucesso!";
                JOptionPane.showMessageDialog(null, status);
            }else{
                status="Não foi possível alterar o estoque...";
                JOptionPane.showMessageDialog(null, status);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void excluirProduto(String cod_prod){
         this.con= new ConnectionFactory().getConnection();
              PreparedStatement ps;
String status = "";
try {
            ps = con.prepareStatement("delete from produto where cod_prod=?");
            ps.setString(1, cod_prod);
            int i = ps.executeUpdate();
            if (i != 0) {
                status = "Produto deletado do database";
                JOptionPane.showMessageDialog(null,status,"Deleção de Produto",JOptionPane.INFORMATION_MESSAGE);
            } else {
                status = "Produto não deletado do database";
                JOptionPane.showMessageDialog(null,status,"Deleção de Produto",JOptionPane.ERROR_MESSAGE);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

 public int buscaEstMin(int codProd){
    int estMin=0;
    String sql= "SELECT estMin FROM produto WHERE cod_prod="+codProd;
    try{
      PreparedStatement stmt= con.prepareStatement(sql);
      ResultSet rs=stmt.executeQuery();
      
      if (rs.next()){
          estMin=(rs.getInt(1));
      }
    }catch (SQLException m){
        String Status = m.getMessage();
        System.out.println(Status);
    }
    return estMin;
}
    
public void updateQuant(int codProd, int quant){
    String sql = "UPDATE produto SET quantidade=? where cod_prod=?";
    try{
        PreparedStatement stmt= con.prepareStatement(sql);
        stmt.setInt(1,quant);
        stmt.setInt(2,codProd);
        
        stmt.executeUpdate();
    }catch(SQLException n){
        System.out.println(n.getMessage());
    }
    
}
}