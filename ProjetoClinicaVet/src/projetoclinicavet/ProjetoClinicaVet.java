package projetoclinicavet;

import JDBC.ConexaoBD;
import view.TelaInicio;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class ProjetoClinicaVet {
    public static void main(String[] args) {
        TelaInicio frm =  new TelaInicio();
       frm.setVisible(true);
    
      try{
        
          Connection conecta = new ConexaoBD().conexao();
         // JOptionPane.showMessageDialog(null, "Conectado!");
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null, "Erro!"+ex);
      }
    }
    
}
