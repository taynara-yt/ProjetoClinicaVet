package DAO;

import modelo.Consulta;
import JDBC.ConexaoBD;
import modelo.Animal;
import modelo.Veterinario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ConsultaDAO {

    private Connection conecta;

    public ConsultaDAO() {
        this.conecta = new ConexaoBD().conexao();
    }

    //Método registrar consulta
    public void registrar(Consulta con) {
        try {

            String sql = "INSERT INTO consulta (sintomas, data_consulta, id_veterinario,id_animal, diagnostico,turno) VALUES (?,?,?,?,?,?)";

            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, con.getSintomas());
            stmt.setDate(2, new java.sql.Date(con.getDatacon().getTime()));
            stmt.setInt(3, con.getVet().getId_vet());
            stmt.setInt(4, con.getAnimal().getId_animal());
            stmt.setString(5, con.getDiagnostico());
            stmt.setString(6, con.getTurno());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Consulta cadastrada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar!" + ex);
        }
    }

    public List<Consulta> listarConsulta() {
        try {
            List<Consulta> lista = new ArrayList<>();

            String sql = "SELECT * FROM consulta";

            PreparedStatement stmt = conecta.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Consulta c = new Consulta();

                c.setId_consulta(rs.getInt("id_consulta"));
                c.setSintomas(rs.getString("sintomas"));
                c.setTurno(rs.getString("turno"));
                c.setDatacon(rs.getDate("data_consulta"));
                c.setVet((Veterinario) rs.getObject("id_veterinario"));
                c.setAnimal((Animal) rs.getObject("id_animal"));

                lista.add(c);
            }
            return lista;

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro: " + ex);
            return null;
        }
    }

}
