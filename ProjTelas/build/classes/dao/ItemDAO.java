package dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Cliente;
import model.Item;
public class ItemDAO {
private Connection con;

     public void InsereItem(Item i){
          this.con=new ConnectionFactory().getConnection(); 
          
         String sql = "INSERT INTO item_venda (cod_venda, cod_item, cod_prod, "
                + "valor_unitario, prod_comprado,quant_item) VALUES(?,?,?,?,?,?)";
 
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, i.getCod_venda());
            stmt.setInt(2, i.getCod_item());
            stmt.setInt(3, i.getCod_prod());
            stmt.setFloat(4, i.getValor_unitario());
            stmt.setString(5, i.getProd_comprado());
            stmt.setInt(6, i.getQuant_item());
            
            stmt.executeUpdate();
            stmt.close();
            } catch (SQLException u) {
                throw new RuntimeException(u);
        }
     }
}
