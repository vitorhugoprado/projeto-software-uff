package dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Item;
import model.NF;
public class NFDAO {
    private Connection con;
    Item i = new Item();
    
public void add(NF nf, int codV2){
String sql = "SELECT v.valor_total,v.dt_venda,v.pagamento,c.nome FROM venda v,"
        + "cliente c WHERE cod_venda="+codV2+" AND v.cod_cliente=c.cod_cliente";

try{
    this.con=new ConnectionFactory().getConnection();
     PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet res = stmt.executeQuery();
            
            
           if(res.next()){
            nf.setValTot(Integer.parseInt(res.getString(1)));
            nf.setDt_venda(res.getString(2));
            nf.setPagamento(res.getString(3));
            nf.setNome(res.getString(4));
            nf.setCodV(codV2);
}            
            
}catch (SQLException u) {
        throw new RuntimeException(u);
        }
}
 public JTable MontaLista(String sql, JTable jTable1) {
        this.con=new ConnectionFactory().getConnection();
        
        String status = "";
        try {
            Statement st = con.createStatement();
            DefaultTableModel aModel = (DefaultTableModel) jTable1.getModel();
            aModel.setRowCount(0);//posiciona na linha zero
            aModel.setColumnCount(0); //posiciona na coluna zero
            jTable1.setRowHeight(15);//coloca tamanho das colunas em 30
            ResultSet rs = st.executeQuery(sql);
            // manipula o dado resultante do sql
            ResultSetMetaData rsmd = rs.getMetaData();
            // pega a caracteristicas dos campos
            int colno = rsmd.getColumnCount();
            // pega a quantidade de colunas resultante do sql

            String nome = "";
            for (int j = 1; j <= colno; j++) {
                nome = rsmd.getColumnName(j);//pega o nome da coluna
                aModel.addColumn(nome.toUpperCase());
            }

            while (rs.next()) {
                Object[] object = new Object[colno];
                for (int i = 0; i < colno; i++) {
                    object[i] = rs.getObject(i + 1);
                }
                aModel.addRow(object);
            }
            jTable1.setModel(aModel);//associa o objeto virtual a model a tabela real

        } catch (SQLException e) {
            status = e.getMessage();
            System.out.println(status);
        }
        return jTable1;

    }
}
