package DAO;

import JDBC.ConexaoBD;

import modelo.Veterinario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VeterinarioDAO {
    
    private Connection conecta;
    
    public VeterinarioDAO(){
         this.conecta = new ConexaoBD().conexao();
    }
     public List<Veterinario> listarVeterinario(){
       try{
           List<Veterinario> lista = new ArrayList<>();
           
          String sql = "SELECT * FROM veterinario";
          
           PreparedStatement stmt = conecta.prepareStatement(sql);
           
           ResultSet rs = stmt.executeQuery();
           
            while (rs.next()){
               
               Veterinario vet = new Veterinario();
               
               vet.setId_vet(rs.getInt("id_veterinario"));
               vet.setCrmv(rs.getString("crmv"));
               vet.setId(rs.getInt("id_funcionario"));
               
              
               
               lista.add(vet);
           }
           return lista;
           
       }catch(SQLException ex){
          
           JOptionPane.showMessageDialog(null,"Erro: "+ ex);
           return null;
       }
}
     
}
