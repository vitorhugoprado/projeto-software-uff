package dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.RelatoCaixa;

public class RelatDAO {
  
  RelatoCaixa r = new RelatoCaixa();
  private Connection con;

    
   public JTable MontaLista(String query, JTable jTable2) {
        this.con=new ConnectionFactory().getConnection();
        
        String status = "";
        try {
            Statement st = con.createStatement();
            DefaultTableModel aModel = (DefaultTableModel) jTable2.getModel();
            aModel.setRowCount(0);//posiciona na linha zero
            aModel.setColumnCount(0); //posiciona na coluna zero
            jTable2.setRowHeight(20);//coloca tamanho das colunas em 30
            
            ResultSet rs = st.executeQuery(query);
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
            jTable2.setModel(aModel);//associa o objeto virtual a model a tabela real

        } catch (SQLException e) {
            status = e.getMessage();
            System.out.println(status);
        }
        return jTable2;

    }
   public int pegaQuant(String data1, String data2, String prod){
       int quant=0;
       String query = "select i.quant_item from item_venda i, venda v where v.cod_venda=i.cod_venda and\n" +
" i.prod_comprado='"+prod+"' and (substring(v.dt_venda from 1 for 2) between substring('"+data1+"' from 1 for 2) \n" +
" and substring('"+data2+"' from 1 for 2) )and (substring(v.dt_venda from 4 for 2)\n" +
" between substring('"+data1+"' from 4 for 2) and substring('"+data2+"' from 4 for 2) )and \n" +
" (substring(v.dt_venda from 7 for 4) between substring('"+data1+"' from 7 for 4) \n" +
" and substring('"+data2+"' from 7 for 4) ) order by v.dt_venda;";
        String status="";
        try{
                    this.con=new ConnectionFactory().getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                int q = rs.getInt(1);
                quant=quant+q; 
            }

        }catch(SQLException e) {
            status = e.getMessage();
            System.out.println(status);
        }
        return quant;
   }
    
    
}
