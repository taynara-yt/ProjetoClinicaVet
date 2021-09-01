package DAO;

import JDBC.ConexaoBD;
import modelo.Animal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AnimalDAO {

    private Connection conecta;

    //constrtutor
    public AnimalDAO() {
        this.conecta = new ConexaoBD().conexao();
    }

    public List<Animal> listarAnimal(){
        try{
           List<Animal> lista = new ArrayList<>();
           
          String sql = "SELECT * FROM animal";
          
           PreparedStatement stmt = conecta.prepareStatement(sql);
           
           ResultSet rs = stmt.executeQuery();
           
           while (rs.next()){
                Animal ani = new Animal();
               
               ani.setId_animal(rs.getInt("id_animal"));
               ani.setNome(rs.getString("nome_animal"));
               ani.setRaca(rs.getString("raca"));
               ani.setPorte(rs.getString("porte"));
               ani.setSexo(rs.getString("sexo"));
               ani.setPeso(rs.getString("peso"));
               
               lista.add(ani);
           }
           return lista;
           
       }catch(SQLException ex){
          
           JOptionPane.showMessageDialog(null,"Erro: "+ ex);
           return null;
       }
           }
       
    // Cadastrar Animal
    public void cadastrarAni(Animal ani) {
        try {

            String comandosql = "INSERT INTO animal (nome_animal, raca, porte, sexo, peso, id_cliente) VALUES (?,?,?,?,?,?)";

            PreparedStatement stmt = conecta.prepareStatement(comandosql);
            
            stmt.setString(1, ani.getNome());
            stmt.setString(2, ani.getRaca());
            stmt.setString(3, ani.getPorte());
            stmt.setString(4, ani.getSexo());
            stmt.setString(5, ani.getPeso());
            stmt.setInt(6,ani.getDono().getId());
            stmt.execute();

            stmt.close();

            JOptionPane.showMessageDialog(null,"Animal cadastrado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar!"+ex);

        }
    }

}

