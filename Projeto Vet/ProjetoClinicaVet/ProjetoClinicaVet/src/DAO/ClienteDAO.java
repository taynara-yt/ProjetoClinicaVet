
package DAO;

import JDBC.ConexaoBD;
import modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteDAO {
    
   private Connection conecta;
   
   public ClienteDAO(){
       this.conecta = new ConexaoBD().conexao();
   }
    
   public List<Cliente> listarClientes(){
       try{
           List<Cliente> lista = new ArrayList<>();
           
          String sql = "SELECT * FROM cliente";
          
           PreparedStatement stmt = conecta.prepareStatement(sql);
           
           ResultSet rs = stmt.executeQuery();
           
           while (rs.next()){
               
               Cliente nc = new Cliente();
               
               nc.setId(rs.getInt("id_cliente"));
               nc.setNome(rs.getString("nome_cliente"));
               nc.setRua(rs.getString("rua_cliente"));
               nc.setCPF(rs.getString("cpf_cliente"));
               nc.setTel(rs.getString("tel_cliente"));
               nc.setBairro(rs.getString("bairro_cliente"));
               nc.setCidade(rs.getString("cidade_cliente"));
               nc.setNumero(rs.getString("numero_cliente"));
               
               lista.add(nc);
           }
           return lista;
           
       }catch(SQLException ex){
          
           JOptionPane.showMessageDialog(null,"Erro: "+ ex);
           return null;
       }
   }
   
}
