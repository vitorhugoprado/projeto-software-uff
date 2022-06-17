package dao;
import java.sql.*;
import javax.swing.*;
import connection.ConnectionFactory;
import model.Cliente;
import javax.swing.JOptionPane;

public class ClienteDAO {
    
  private Connection con;  

    public ClienteDAO(){
        
        this.con = new ConnectionFactory().getConnection();
    }

     public void adiciona(Cliente c){
        String sql = "INSERT INTO cliente(nome,telefone,email,cep, logadouro,"
                + " numero, dt_nasc, bairro, cidade, estado) VALUES(?,?,?,?,?,?,?,?,?,?)";
 
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getTelefone());
            stmt.setString(3, c.getEmail());
            stmt.setString(4, c.getCep());
            stmt.setString(5, c.getLogradouro());
            stmt.setInt(6, c.getNumero());
            stmt.setString(7,c.getDt_nasc() );
            stmt.setString(8, c.getBairro());
            stmt.setString(9,c.getCidade());
            stmt.setString(10,c.getEstado());
            
            stmt.executeUpdate();
            stmt.close();
            } catch (SQLException u) {
                throw new RuntimeException(u);
        }
    }

      public void editarClienteNome(String cod_cliente, String nome){
        this.con = new ConnectionFactory().getConnection();
        
        String sql="";
       PreparedStatement ps;
       String status="";
        nome=JOptionPane.showInputDialog(null,"Digite o novo Nome:");
        try{
            ps= con.prepareStatement("update cliente set nome=? where cod_cliente=?");
            
            ps.setString(1,nome);
            ps.setString(2,cod_cliente);
            
            int i = ps.executeUpdate();
            if(i!=0){
                status="Nome alterado com sucesso!";
                JOptionPane.showMessageDialog(null, status);
            }else{
                status="Não foi possível alterar o nome...";
                JOptionPane.showMessageDialog(null, status);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void editarClienteDtNasc(String cod_cliente, String dt_nasc){
        this.con = new ConnectionFactory().getConnection();
                
        String sql="";
       PreparedStatement ps;
       String status="";
        dt_nasc=JOptionPane.showInputDialog(null,"Digite a nova data de nascimento:");
        try{
            ps= con.prepareStatement("update cliente set dt_nasc=? where cod_cliente=?");
            
            ps.setString(1,dt_nasc);
            ps.setString(2,cod_cliente);
            
            int i = ps.executeUpdate();
            if(i!=0){
                status="Data alterada com sucesso!";
                JOptionPane.showMessageDialog(null, status);
            }else{
                status="Não foi possível alterar a data...";
                JOptionPane.showMessageDialog(null, status);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void editarClienteTel(String cod_cliente, String telefone){
        this.con = new ConnectionFactory().getConnection();
                
        String sql="";
       PreparedStatement ps;
       String status="";
        telefone=JOptionPane.showInputDialog(null,"Digite o novo número de telefone:");
        try{
            ps= con.prepareStatement("update cliente set telefone=? where cod_cliente=?");
            
            ps.setString(1,telefone);
            ps.setString(2,cod_cliente);
            
            int i = ps.executeUpdate();
            if(i!=0){
                status="Número de telefone alterado com sucesso!";
                JOptionPane.showMessageDialog(null, status);
            }else{
                status="Não foi possível alterar o número de telefone...";
                JOptionPane.showMessageDialog(null, status);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void editarClienteEmail(String cod_cliente, String email){
        this.con = new ConnectionFactory().getConnection();
                
        String sql="";
       PreparedStatement ps;
       String status="";
        email=JOptionPane.showInputDialog(null,"Digite o novo endereço de email:");
        try{
            ps= con.prepareStatement("update cliente set email=? where cod_cliente=?");
            
            ps.setString(1,email);
            ps.setString(2,cod_cliente);
            
            int i = ps.executeUpdate();
            if(i!=0){
                status="Email alterado com sucesso!";
                JOptionPane.showMessageDialog(null, status);
            }else{
                status="Não foi possível alterar o email...";
                JOptionPane.showMessageDialog(null, status);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void editarClienteLogradouro(String cod_cliente, String logradouro){
        this.con = new ConnectionFactory().getConnection();
                
        String sql="";
       PreparedStatement ps;
       String status="";
        logradouro=JOptionPane.showInputDialog(null,"Digite o novo logradouro do cliente:");
        try{
            ps= con.prepareStatement("update cliente set logadouro=? where cod_cliente=?");
            
            ps.setString(1,logradouro);
            ps.setString(2,cod_cliente);
            
            int i = ps.executeUpdate();
            if(i!=0){
                status="Logradouro alterado com sucesso!";
                JOptionPane.showMessageDialog(null, status);
            }else{
                status="Não foi possível alterar o logradouro...";
                JOptionPane.showMessageDialog(null, status);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void editarClienteCep(String cod_cliente, String cep){
        this.con = new ConnectionFactory().getConnection();
                
        String sql="";
       PreparedStatement ps;
       String status="";
        cep=JOptionPane.showInputDialog(null,"Digite o novo cep do cliente:");
        try{
            ps= con.prepareStatement("update cliente set cep=? where cod_cliente=?");
            
            ps.setString(1,cep);
            ps.setString(2,cod_cliente);
            
            int i = ps.executeUpdate();
            if(i!=0){
                status="CEP alterado com sucesso!";
                JOptionPane.showMessageDialog(null, status);
            }else{
                status="Não foi possível alterar o CEP...";
                JOptionPane.showMessageDialog(null, status);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void editarClienteNum(String cod_cliente, int num){
        this.con = new ConnectionFactory().getConnection();
                
        String sql="";
       PreparedStatement ps;
       String status="";
        num=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o novo número do cliente:"));
        try{
            ps= con.prepareStatement("update cliente set numero=? where cod_cliente=?");
            
            ps.setInt(1,num);
            ps.setString(2,cod_cliente);
            
            int i = ps.executeUpdate();
            if(i!=0){
                status="Número alterado com sucesso!";
                JOptionPane.showMessageDialog(null, status);
            }else{
                status="Não foi possível alterar o número...";
                JOptionPane.showMessageDialog(null, status);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void editarClienteBairro(String cod_cliente, String bairro){
        this.con = new ConnectionFactory().getConnection();
                
        String sql="";
       PreparedStatement ps;
       String status="";
        bairro=JOptionPane.showInputDialog(null,"Digite o novo bairro do cliente:");
        try{
            ps= con.prepareStatement("update cliente set bairro=? where cod_cliente=?");
            
            ps.setString(1,bairro);
            ps.setString(2,cod_cliente);
            
            int i = ps.executeUpdate();
            if(i!=0){
                status="Bairro alterado com sucesso!";
                JOptionPane.showMessageDialog(null, status);
            }else{
                status="Não foi possível alterar o bairro...";
                JOptionPane.showMessageDialog(null, status);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void editarClienteCidade(String cod_cliente, String cidade){
        this.con = new ConnectionFactory().getConnection();
                
        String sql="";
       PreparedStatement ps;
       String status="";
        cidade=JOptionPane.showInputDialog(null,"Digite o novo cidade do cliente:");
        try{
            ps= con.prepareStatement("update cliente set cidade=? where cod_cliente=?");
            
            ps.setString(1,cidade);
            ps.setString(2,cod_cliente);
            
            int i = ps.executeUpdate();
            if(i!=0){
                status="Cidade alterada com sucesso!";
                JOptionPane.showMessageDialog(null, status);
            }else{
                status="Não foi possível alterar a cidade...";
                JOptionPane.showMessageDialog(null, status);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void editarClienteEstado(String cod_cliente, String estado){
        this.con = new ConnectionFactory().getConnection();
                
        String sql="";
       PreparedStatement ps;
       String status="";
        estado=JOptionPane.showInputDialog(null,"Digite a nova Unidade da Federação do cliente: \nExemplo: Rio de Janeiro->RJ.");
        try{
            ps= con.prepareStatement("update cliente set estado=? where cod_cliente=?");
            
            ps.setString(1,estado);
            ps.setString(2,cod_cliente);
            
            int i = ps.executeUpdate();
            if(i!=0){
                status="estado alterado com sucesso!";
                JOptionPane.showMessageDialog(null, status);
            }else{
                status="Não foi possível alterar o estado...";
                JOptionPane.showMessageDialog(null, status);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     
     
    public void buscarCliente (String id){
    this.con = new ConnectionFactory().getConnection();
    String sql ="";
    
    sql="select * from cliente where cod_cliente='"+id+"'";
    
    try{
        PreparedStatement stm = con.prepareStatement(sql);
        ResultSet res = stm.executeQuery();
        while (res.next()){
            
            String nome = (res.getString(2));
            String dtnasc = (res.getString(3));
            String tel = (res.getString(4));
            String email = (res.getString(5));
            String cep = (res.getString(6));
            String logradouro = (res.getString(7));
            int numero = (res.getInt(8));
            String bairro = (res.getString(9));
            String cidade = (res.getString(10));
            String uf = (res.getString(11));
            
            
            JOptionPane.showMessageDialog(null,"Informações do cliente:\nNome do cliente: "+nome+""
                    + "\nData de Nascimento: "+dtnasc+"\nTelefone do cliente:"
                            + " "+tel+"\nEmail do cliente: "+email+"\nCEP do Cliente: "+cep+"\nLogradouro do Cliente: "+logradouro+""
                                    + "\nNúmero da casa do Cliente: "+numero+"\nBairro do Cliente: "+bairro+"\nCidade do Cliente: "+cidade+
                    "\nEstado do Cliente: "+uf);
            
    }
}catch (SQLException e){
    e.printStackTrace();
}
    
}
      public String deletarCliente(String cod_cliente){
        this.con= new ConnectionFactory().getConnection();
              PreparedStatement ps;
String status = "";
try {
            ps = con.prepareStatement("delete from cliente where cod_cliente=?");
            ps.setString(1, cod_cliente);
            int i = ps.executeUpdate();
            if (i != 0) {
                status = "Usuario deletado do database";
                JOptionPane.showMessageDialog(null,status,"Deleção de Usuário",JOptionPane.INFORMATION_MESSAGE);
            } else {
                status = "Usuario não deletado do database";
                JOptionPane.showMessageDialog(null,status,"Deleção de Usuário",JOptionPane.ERROR_MESSAGE);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
return status;
     }
 
}
