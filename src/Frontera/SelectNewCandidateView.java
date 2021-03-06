/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Entidad.CandidateEntity;
import javax.swing.JPanel;

/**
 *
 * @author Nicolas
 */
public class SelectNewCandidateView extends javax.swing.JPanel {
        
    private JPanel ParentPanel;
    /**
     * Creates new form nuevoCan
     */
    public SelectNewCandidateView(JPanel panel) {
        initComponents();
        ParentPanel = panel;
        mensaje.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        contactoTF = new javax.swing.JTextField();
        direccionTF = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        nombreTF = new javax.swing.JTextField();
        cedulaTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        guardarB = new javax.swing.JButton();
        cancelarB = new javax.swing.JButton();
        mensaje = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        nombretf = new javax.swing.JTextField();
        apellidoTF = new javax.swing.JTextField();
        NivelDeEstudiosCB = new javax.swing.JComboBox<>();
        CarreraCB = new javax.swing.JComboBox<>();
        UniversidadCB = new javax.swing.JComboBox<>();
        ExperienciaTF = new javax.swing.JTextField();

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Item 2", "Item 3", "Item 4" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Item 2", "Item 3", "Item 4" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Item 2", "Item 3", "Item 4" }));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Nombre Completo");

        jLabel4.setText("Nivel de Estudios");

        jLabel5.setText("Carrera");

        jLabel6.setText("Universidad");

        jLabel7.setText("ARL");

        jLabel8.setText("EPS");

        jLabel9.setText("AFP");

        jLabel10.setText("Contacto de Emergencia");

        jLabel11.setText("Dirección");

        jTextField4.setText("jTextField4");

        setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Datos del Candidato");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 64, 0, 0);
        add(jLabel1, gridBagConstraints);

        jLabel2.setText("Cédula");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 64, 0, 0);
        add(jLabel2, gridBagConstraints);

        guardarB.setText("Guardar");
        guardarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 16, 0, 0);
        add(guardarB, gridBagConstraints);

        cancelarB.setText("Cancelar");
        cancelarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 30, 0, 0);
        add(cancelarB, gridBagConstraints);

        mensaje.setText("Candidato Guardado Satisfactoriamente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 12, 7, 0);
        add(mensaje, gridBagConstraints);

        idTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTFActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 133;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 98, 0, 12);
        add(idTF, gridBagConstraints);

        jLabel12.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 64, 0, 0);
        add(jLabel12, gridBagConstraints);

        jLabel13.setText("Apellido");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 64, 0, 0);
        add(jLabel13, gridBagConstraints);

        jLabel14.setText("Nivel de Estudios");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 64, 0, 0);
        add(jLabel14, gridBagConstraints);

        jLabel15.setText("Carrera");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 64, 0, 0);
        add(jLabel15, gridBagConstraints);

        jLabel16.setText("Universidad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 64, 0, 0);
        add(jLabel16, gridBagConstraints);

        jLabel17.setText("Experiencia (años)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 64, 0, 0);
        add(jLabel17, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 133;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 98, 0, 12);
        add(nombretf, gridBagConstraints);

        apellidoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoTFActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 133;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 98, 0, 12);
        add(apellidoTF, gridBagConstraints);

        NivelDeEstudiosCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Bachiller", "Tecnico", "Profesional", "Maestria", "Doctorado" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 46;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 98, 0, 12);
        add(NivelDeEstudiosCB, gridBagConstraints);

        CarreraCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Psicologia", "Ingenieria", "Economia", "Estadistica", "Ninguna" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 46;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 98, 0, 12);
        add(CarreraCB, gridBagConstraints);

        UniversidadCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Nacinal", "Andes", "Extrangera", "otras" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 46;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 98, 0, 12);
        add(UniversidadCB, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 133;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 98, 0, 12);
        add(ExperienciaTF, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void guardarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBActionPerformed
       javax.swing.SwingUtilities.invokeLater(() -> {
           mensaje.setVisible(true);
           this.revalidate();
           this.repaint();
        });
       mensaje.setVisible(true);
       CandidateEntity candidato = new CandidateEntity();
       candidato.setId(idTF.getText());
       candidato.setNombre(nombretf.getText());
       candidato.setApellido(apellidoTF.getText());
       candidato.setNivelDeEstudios(NivelDeEstudiosCB.getItemAt(NivelDeEstudiosCB.getSelectedIndex()));
       candidato.setUniversidad(UniversidadCB.getItemAt(UniversidadCB.getSelectedIndex()));
       candidato.setProfesion(CarreraCB.getItemAt(CarreraCB.getSelectedIndex()));
       candidato.setExperiencia(Integer.parseInt(ExperienciaTF.getText()));
       
       
       //Hace falta hacer el método en el controlador que coloque esto, esto es por default
       candidato.setAptitud(90.9);
       //Este campo no está en la lista, toca añadirlo
       candidato.setSalario_proyectado(1000.0);
       
       PrincipalFrame.listaCandidatos.AñadirCandidato(candidato);       
       System.out.print(PrincipalFrame.listaCandidatos.getCandidato(idTF.getText()).toString());
       
             
    }//GEN-LAST:event_guardarBActionPerformed

    private void cancelarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBActionPerformed
        this.setVisible(false);
        this.removeAll();
    }//GEN-LAST:event_cancelarBActionPerformed

    private void idTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTFActionPerformed

    private void apellidoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoTFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CarreraCB;
    private javax.swing.JTextField ExperienciaTF;
    private javax.swing.JComboBox<String> NivelDeEstudiosCB;
    private javax.swing.JComboBox<String> UniversidadCB;
    private javax.swing.JTextField apellidoTF;
    private javax.swing.JButton cancelarB;
    private javax.swing.JTextField cedulaTF;
    private javax.swing.JTextField contactoTF;
    private javax.swing.JTextField direccionTF;
    private javax.swing.JButton guardarB;
    private javax.swing.JTextField idTF;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel mensaje;
    private javax.swing.JTextField nombreTF;
    private javax.swing.JTextField nombretf;
    // End of variables declaration//GEN-END:variables
}
