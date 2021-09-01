package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoBD {

    public Connection conexao() {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/bd_vet", "postgres", "1234"); //url, user, password
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public static void desconexao(Connection con){
        try{
            if(con != null){
                con.close();
                 JOptionPane.showMessageDialog(null,"Desconectado com sucesso!");

            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao desconectar!\n Erro: "+ ex.getMessage());
        }
        
    }
    
    
}
