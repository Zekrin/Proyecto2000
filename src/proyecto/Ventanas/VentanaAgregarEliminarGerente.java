/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Ventanas;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import proyecto.Empresa;

/**
 *
 * @author Zekro
 */
public class VentanaAgregarEliminarGerente extends javax.swing.JFrame {

    /**
     * Creates new form VentanaAgregarEliminarGerente
     */
    Empresa best;
    public VentanaAgregarEliminarGerente(Empresa bestEmpresa) {
        initComponents();
        best = bestEmpresa;
        mnAddGer_overlay.setBackground(new Color(0,0,0,100));
        DefaultListModel<String> mdl = best.crearMdlGerentes();
        mnAddGer_jList2.setModel(mdl);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mnAddGer_overlay = new javax.swing.JPanel();
        mnAddGer_sueldoGer = new javax.swing.JTextField();
        mnAddGer_rutGer = new javax.swing.JTextField();
        mnAddGer_nombreGer = new javax.swing.JTextField();
        pnl_msgID2 = new javax.swing.JPanel();
        jlabel_sueldoger = new javax.swing.JLabel();
        pnl_msgID1 = new javax.swing.JPanel();
        jlabel_rutger = new javax.swing.JLabel();
        pnl_msgID = new javax.swing.JPanel();
        jlabel_nombreger = new javax.swing.JLabel();
        mnAddGer_jB_agregarGerente = new javax.swing.JButton();
        mnAddGer_mnPrincipal = new javax.swing.JButton();
        mnAddGer_jB_EliminarGerente = new javax.swing.JButton();
        mnAddGer_jList = new javax.swing.JScrollPane();
        mnAddGer_jList2 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mnAddGer_overlay.setBackground(new java.awt.Color(0, 0, 0));
        mnAddGer_overlay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mnAddGer_overlay.add(mnAddGer_sueldoGer, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 220, -1));
        mnAddGer_overlay.add(mnAddGer_rutGer, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 220, -1));
        mnAddGer_overlay.add(mnAddGer_nombreGer, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 220, -1));

        pnl_msgID2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabel_sueldoger.setText("Ingresa el sueldo del gerente");
        pnl_msgID2.add(jlabel_sueldoger, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 20));

        mnAddGer_overlay.add(pnl_msgID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 220, 40));

        pnl_msgID1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabel_rutger.setText("Ingresa el RUT del gerente");
        pnl_msgID1.add(jlabel_rutger, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 20));

        mnAddGer_overlay.add(pnl_msgID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 220, 40));

        pnl_msgID.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabel_nombreger.setText("Ingresa el nombre del gerente");
        pnl_msgID.add(jlabel_nombreger, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 20));

        mnAddGer_overlay.add(pnl_msgID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 220, 40));

        mnAddGer_jB_agregarGerente.setText("Agregar Gerente");
        mnAddGer_jB_agregarGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAddGer_jB_agregarGerenteActionPerformed(evt);
            }
        });
        mnAddGer_overlay.add(mnAddGer_jB_agregarGerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        mnAddGer_mnPrincipal.setText("Volver Menu principal");
        mnAddGer_mnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAddGer_mnPrincipalActionPerformed(evt);
            }
        });
        mnAddGer_overlay.add(mnAddGer_mnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, -1, -1));

        mnAddGer_jB_EliminarGerente.setText("Eliminar Gerente");
        mnAddGer_jB_EliminarGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAddGer_jB_EliminarGerenteActionPerformed(evt);
            }
        });
        mnAddGer_overlay.add(mnAddGer_jB_EliminarGerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, -1));

        mnAddGer_jList.setViewportView(mnAddGer_jList2);

        mnAddGer_overlay.add(mnAddGer_jList, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 520, 340));

        getContentPane().add(mnAddGer_overlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnAddGer_jB_agregarGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAddGer_jB_agregarGerenteActionPerformed
        String nombre = mnAddGer_nombreGer.getText();
        String rut = mnAddGer_rutGer.getText();
        String sueldo = mnAddGer_sueldoGer.getText();
        
        if(nombre.isEmpty()||rut.isEmpty()||sueldo.isEmpty()){
            JOptionPane.showMessageDialog(null,"No es posible crear un Gerente con algun campo vacio.");
            return;
        }
        
        if(best.agregarGerente(nombre, rut, sueldo) == -1){
            JOptionPane.showMessageDialog(null,"Ya esta registrado un gerente con ese rut.");
            return;
        }
        
        JOptionPane.showMessageDialog(null,"Gerente Agregado Exitosamente.");
        
    }//GEN-LAST:event_mnAddGer_jB_agregarGerenteActionPerformed

    private void mnAddGer_mnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAddGer_mnPrincipalActionPerformed
        ventanaMenuPrincipal mnprn = new ventanaMenuPrincipal(best);
        mnprn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnAddGer_mnPrincipalActionPerformed

    private void mnAddGer_jB_EliminarGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAddGer_jB_EliminarGerenteActionPerformed
        String rut = mnAddGer_rutGer.getText();
        if(rut.isEmpty()){
            JOptionPane.showMessageDialog(null,"Para eliminar un Gerente se necesita su RUT.");
            return;
        }
        if(best.eliminarGerente(rut) == -1){
            JOptionPane.showMessageDialog(null,"El Gerente no existe.");
            return;
        }
        
        JOptionPane.showMessageDialog(null,"Gerente Eliminado Exitosamente.");
    }//GEN-LAST:event_mnAddGer_jB_EliminarGerenteActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlabel_nombreger;
    private javax.swing.JLabel jlabel_rutger;
    private javax.swing.JLabel jlabel_sueldoger;
    private javax.swing.JButton mnAddGer_jB_EliminarGerente;
    private javax.swing.JButton mnAddGer_jB_agregarGerente;
    private javax.swing.JScrollPane mnAddGer_jList;
    private javax.swing.JList<String> mnAddGer_jList2;
    private javax.swing.JButton mnAddGer_mnPrincipal;
    private javax.swing.JTextField mnAddGer_nombreGer;
    private javax.swing.JPanel mnAddGer_overlay;
    private javax.swing.JTextField mnAddGer_rutGer;
    private javax.swing.JTextField mnAddGer_sueldoGer;
    private javax.swing.JPanel pnl_msgID;
    private javax.swing.JPanel pnl_msgID1;
    private javax.swing.JPanel pnl_msgID2;
    // End of variables declaration//GEN-END:variables
}