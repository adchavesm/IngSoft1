/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Entidad.EmployeeEntity;
import Entidad.CandidatesList;
import Entidad.EmployeesList;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author Nicolas
 */
public class PrincipalFrame extends javax.swing.JFrame {

    public static EmployeesList listaEmpleados = new EmployeesList();
    public static CandidatesList listaCandidatos = new CandidatesList();

    public PrincipalFrame() {
        initComponents();
    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        novedadesB = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        contratacionB = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        retirarB = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        listarB = new javax.swing.JButton();
        panelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HR System");
        setSize(new java.awt.Dimension(500, 1000));

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setBorder(null);
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setMargin(new java.awt.Insets(10, 10, 10, 10));

        novedadesB.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        novedadesB.setText("Novedades");
        novedadesB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        novedadesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novedadesBActionPerformed(evt);
            }
        });
        jToolBar1.add(novedadesB);
        jToolBar1.add(jSeparator1);

        contratacionB.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        contratacionB.setText("Contratacion");
        contratacionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratacionBActionPerformed(evt);
            }
        });
        jToolBar1.add(contratacionB);
        jToolBar1.add(jSeparator2);

        retirarB.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        retirarB.setText("Retirar Empleado");
        retirarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarBActionPerformed(evt);
            }
        });
        jToolBar1.add(retirarB);
        jToolBar1.add(jSeparator3);

        listarB.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        listarB.setText("Listar Empleados");
        listarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarBActionPerformed(evt);
            }
        });
        jToolBar1.add(listarB);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelPrincipal.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Método para actualizar el contenido del panelPrincipal
    private void ActualizarGUI(JComponent component1, JComponent component2) {
        component1.removeAll();
        component1.add(component2);
        cleanButtonStyles();
        component1.revalidate();
        component1.repaint();
    }

    private void paintButtonActive(JButton button) {
        button.requestFocus();
        button.setFont(new Font("SansSerif", Font.BOLD, 14));
    }

    private void cleanButtonStyles() {
        for (int i = 0; i < 7; i++) {
            Component comp = jToolBar1.getComponent(i);
            if (comp instanceof JButton) {
                JButton button = (JButton) comp;
                button.setFont(new Font("SansSerif", Font.PLAIN, 14));
            }
        }
    }

    private void novedadesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novedadesBActionPerformed
        NoveltySearchView buscarN = new NoveltySearchView();
        javax.swing.SwingUtilities.invokeLater(() -> {
            ActualizarGUI(panelPrincipal, buscarN);
            paintButtonActive(novedadesB);
        });

    }//GEN-LAST:event_novedadesBActionPerformed

    private void retirarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarBActionPerformed
        RemoveView retirar = new RemoveView();
        javax.swing.SwingUtilities.invokeLater(() -> {
            ActualizarGUI(panelPrincipal, retirar);
            paintButtonActive(retirarB);
        });
    }//GEN-LAST:event_retirarBActionPerformed

    private void listarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarBActionPerformed
        RosterView nomina = new RosterView();
        javax.swing.SwingUtilities.invokeLater(() -> {
            ActualizarGUI(panelPrincipal, nomina);
            paintButtonActive(listarB);
        });
    }//GEN-LAST:event_listarBActionPerformed

    private void contratacionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratacionBActionPerformed
        //Acá el constructor de la vista está modificado para propagar el panel principal a todos los nodos hijos. Esto podría ser fácilmente evitable
        //usando interfaces, sin embargo, Swing es una shit y no conozco muy bien su AST como para meterle mano
        SelectView elegircargo = new SelectView(panelPrincipal);
        javax.swing.SwingUtilities.invokeLater(() -> {
            ActualizarGUI(panelPrincipal, elegircargo);
            paintButtonActive(contratacionB);
        });
    }//GEN-LAST:event_contratacionBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                inicializar();
                new PrincipalFrame().setVisible(true);
            }
        });
    }

    public static void inicializar() {

        EmployeeEntity uno = new EmployeeEntity();
        EmployeeEntity dos = new EmployeeEntity();
        EmployeeEntity tres = new EmployeeEntity();
        EmployeeEntity cuatro = new EmployeeEntity();
        EmployeeEntity cinco = new EmployeeEntity();

        uno.setARL("1020");
        uno.setActivo(true);
        uno.setApellido("CHAVES");
        uno.setCesantias(23);
        uno.setContactoDeEmergencia(305612321);
        uno.setDireccion("Avenida calle 22#15-69");
        uno.setEPS("SaludCoop");
        uno.setEdad(21);
        uno.setId("1030685411");
        uno.setNombre("ANDRES");
        uno.setPensiones(900000);

        dos.setARL("1030");
        dos.setActivo(true);
        dos.setApellido("CASTAÑEDA");
        dos.setCesantias(24);
        dos.setContactoDeEmergencia(306798545);
        dos.setDireccion("AVENIDA LAS FERIAS#70-05");
        dos.setEPS("SALUDTOTAL");
        dos.setEdad(19);
        dos.setId("1019146963");
        dos.setNombre("SEBASTIAN");
        dos.setPensiones(900000);

        tres.setARL("1040");
        tres.setActivo(true);
        tres.setApellido("CARO");
        tres.setCesantias(25);
        tres.setContactoDeEmergencia(10232131);
        tres.setDireccion("AV.PRIMERADEMAYO#70-22");
        tres.setEPS("VIVASALUD");
        tres.setEdad(25);
        tres.setId("1013647467");
        tres.setNombre("NICOLAS");
        tres.setPensiones(1200000);

        listaEmpleados.AñadirEmpleado(uno);
        listaEmpleados.AñadirEmpleado(dos);
        listaEmpleados.AñadirEmpleado(tres);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton contratacionB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton listarB;
    private javax.swing.JButton novedadesB;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JButton retirarB;
    // End of variables declaration//GEN-END:variables
}