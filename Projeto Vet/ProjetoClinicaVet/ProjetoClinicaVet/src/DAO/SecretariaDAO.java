package DAO;

import JDBC.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Secretaria;

public class SecretariaDAO {

    private Connection conecta;

    public SecretariaDAO() {
        this.conecta = new ConexaoBD().conexao();
    }

    public Secretaria sec(int id_secretaria) {
        try {

            String comandosql = "SELECT * FROM secretaria WHERE id_secretaria =" + id_secretaria;

            PreparedStatement stmt = conecta.prepareStatement(comandosql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Secretaria s = new Secretaria();
                s.setId_secretaria(rs.getInt("id_secretaria"));
                s.setNome(rs.getString("nome"));
                s.setCPF(rs.getString("cpf"));
                s.setCidade(rs.getString("cidade"));
                s.setBairro(rs.getString("bairro"));
                s.setNumero(rs.getString("numero"));
                s.setRua(rs.getString("rua"));
                s.setTel(rs.getString("numero"));

                return s;

            }
            return null;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro: "+ ex);
           return null;
        }

    }

}
