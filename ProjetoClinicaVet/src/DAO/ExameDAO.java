package DAO;

import JDBC.ConexaoBD;
import modelo.Consulta;
import modelo.Exame;
import modelo.Veterinario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ExameDAO {

    private Connection conecta;

    public ExameDAO() {
        this.conecta = new ConexaoBD().conexao();

    }

    public void marcarExame(Exame exa) {
        try {

            String sql = "INSERT INTO exame (nome, id_veterinario, id_consulta) VALUES (?,?,?)";

            PreparedStatement stmt = conecta.prepareStatement(sql);
            
            stmt.setString(1, exa.getExame());
            stmt.setInt(2, exa.getVeterinario().getId_vet());
            stmt.setInt(3, exa.getC().getId_consulta());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Marcado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro marcar exame!" + ex);
        }

    }

    public List<Exame> listarExame() {
        try {
            List<Exame> lista = new ArrayList<>();

            String sql = "SELECT * FROM exame";

            PreparedStatement stmt = conecta.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Exame exe = new Exame();

                exe.setId_exame(rs.getInt("id_exame"));
                exe.setExame(rs.getString("nome"));

                lista.add(exe);
            }
            return lista;

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro: " + ex);
            return null;
        }
    }

    public void addExame(String ex, Veterinario v, Consulta c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
