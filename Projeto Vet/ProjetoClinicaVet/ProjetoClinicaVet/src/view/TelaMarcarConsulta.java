/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.AnimalDAO;
import DAO.ConsultaDAO;
import DAO.ExameDAO;
import DAO.VeterinarioDAO;
import modelo.Animal;
import modelo.Consulta;
import modelo.Veterinario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;

public class TelaMarcarConsulta extends javax.swing.JFrame {

   private final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    
    public TelaMarcarConsulta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelAni = new javax.swing.JLabel();
        jComboBoxVet = new javax.swing.JComboBox();
        jLabelSintomas = new javax.swing.JLabel();
        jTextFieldSintomas = new javax.swing.JTextField();
        jLabelVet = new javax.swing.JLabel();
        jComboBoxAni = new javax.swing.JComboBox();
        jButtonMarcar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxTurno = new javax.swing.JComboBox();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Marcar nova consulta");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Marcar Consulta");

        jLabelData.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelData.setText("Data:");

        jLabelAni.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelAni.setText("Animal:");

        jComboBoxVet.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione Médico-Veterinário" }));
        jComboBoxVet.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBoxVetAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jComboBoxVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVetActionPerformed(evt);
            }
        });

        jLabelSintomas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelSintomas.setText("Sintomas:");

        jLabelVet.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelVet.setText("Veterinário:");

        jComboBoxAni.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione paciente" }));
        jComboBoxAni.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBoxAniAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jComboBoxAni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAniActionPerformed(evt);
            }
        });

        jButtonMarcar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMarcar.setText("Finalizar");
        jButtonMarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMarcarActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Big Shoes - Walking the Dog (1).png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Turno:");

        jComboBoxTurno.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBoxTurnoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jComboBoxTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTurnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAni)
                            .addComponent(jComboBoxAni, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSintomas)
                            .addComponent(jTextFieldSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelData)
                            .addComponent(jDayChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabelVet)
                                    .addComponent(jComboBoxVet, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButtonMarcar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelVet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxVet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelAni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxAni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSintomas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabelData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDayChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButtonMarcar)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxVetAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComboBoxVetAncestorAdded

        VeterinarioDAO v = new VeterinarioDAO();
        List<Veterinario> lista = v.listarVeterinario();
        
        jComboBoxVet.removeAll();
        
        for(Veterinario vt : lista){
           jComboBoxVet.addItem(vt);
        }
    }//GEN-LAST:event_jComboBoxVetAncestorAdded

    private void jButtonMarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMarcarActionPerformed
        // botton cadastrar consulta
        
        Consulta c = new Consulta();
        Veterinario v = new Veterinario();
        Animal a = new Animal();
       
        c.setSintomas(jTextFieldSintomas.getText());
        c.setTurno(jComboBoxTurno.getSelectedItem().toString());
    
        v = (Veterinario)jComboBoxVet.getSelectedItem();
        c.setVet(v);
        
        a = (Animal)jComboBoxAni.getSelectedItem();
        c.setAnimal(a);
        
        c.setDatacon(Jcalendar.getDate());
        
        
       
        ConsultaDAO dao = new ConsultaDAO();
        dao.registrar(c);
    }//GEN-LAST:event_jButtonMarcarActionPerformed

    private void jComboBoxAniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAniActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBoxAniActionPerformed

    private void jComboBoxVetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVetActionPerformed

    private void jComboBoxAniAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComboBoxAniAncestorAdded
        // TODO add your handling code here:
         AnimalDAO a = new AnimalDAO();
        List<Animal> lista = a.listarAnimal();
        
        jComboBoxAni.removeAll();
        
        for(Animal ani : lista){
           jComboBoxAni.addItem(ani);
        }
    }//GEN-LAST:event_jComboBoxAniAncestorAdded

    private void jComboBoxTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTurnoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBoxTurnoActionPerformed

    private void jComboBoxTurnoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComboBoxTurnoAncestorAdded
        // TODO add your handling code here:
        jComboBoxTurno.addItem("Matutino");
        jComboBoxTurno.addItem("Vespertino");
        jComboBoxTurno.addItem("Noturno");
    }//GEN-LAST:event_jComboBoxTurnoAncestorAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //String [] exames = {"Ultrassonografia","Raio x","Oftalmológico","Eletrocardiograma","Exame de sangue","Exame Odontológico"};
       // String  n = (String) JOptionPane.showMessageDialog(null,"Deseja marcar exames ?");
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMarcarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMarcarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMarcarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMarcarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMarcarConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMarcar;
    private javax.swing.JComboBox jComboBoxAni;
    private javax.swing.JComboBox jComboBoxTurno;
    private javax.swing.JComboBox jComboBoxVet;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAni;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelSintomas;
    private javax.swing.JLabel jLabelVet;
    private javax.swing.JTextField jTextFieldSintomas;
    // End of variables declaration//GEN-END:variables
}
