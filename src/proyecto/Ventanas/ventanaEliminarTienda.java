/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Ventanas;

import proyecto.Ventanas.ventanaMenuPrincipal;
import java.awt.Color;
import java.util.ListIterator;
import javax.swing.*;
import proyecto.Empresa;

/**
 *
 * @author Zekro
 */
public class ventanaEliminarTienda extends javax.swing.JFrame {

    /**
     * Creates new form ventanaEliminarTienda
     */
    Empresa best;
    public ventanaEliminarTienda(Empresa bestEmpresa) {
        initComponents();
        best = bestEmpresa;
        mnElim_overlay.setBackground(new Color(0,0,0,100));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mnElim_overlay = new javax.swing.JPanel();
        mnElim_txtID = new javax.swing.JTextField();
        mnElim_pnlMsgBorrar = new javax.swing.JPanel();
        mnElim_msgBorrar = new javax.swing.JLabel();
        mn_jB_elimTienda = new javax.swing.JButton();
        mn_jB_menuPrincipal = new javax.swing.JButton();
        mnElim_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(880, 610));
        setPreferredSize(new java.awt.Dimension(880, 610));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mnElim_overlay.setBackground(new java.awt.Color(0, 0, 0));
        mnElim_overlay.setMaximumSize(new java.awt.Dimension(880, 610));
        mnElim_overlay.setMinimumSize(new java.awt.Dimension(880, 610));
        mnElim_overlay.setPreferredSize(new java.awt.Dimension(880, 610));
        mnElim_overlay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mnElim_overlay.add(mnElim_txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 170, -1));

        mnElim_pnlMsgBorrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mnElim_msgBorrar.setText("  Ingresa la ID de la tienda a Borrar");
        mnElim_pnlMsgBorrar.add(mnElim_msgBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 10));

        mnElim_overlay.add(mnElim_pnlMsgBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 170, 30));

        mn_jB_elimTienda.setText("Eliminar Tienda");
        mn_jB_elimTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_jB_elimTiendaActionPerformed(evt);
            }
        });
        mnElim_overlay.add(mn_jB_elimTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, -1, -1));

        mn_jB_menuPrincipal.setText("Volver Menu principal");
        mn_jB_menuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_jB_menuPrincipalActionPerformed(evt);
            }
        });
        mnElim_overlay.add(mn_jB_menuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, -1, -1));

        getContentPane().add(mnElim_overlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 610));

        mnElim_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/854703-5-centimeters-per-second-japan-makoto-shinkai-shop-streets.jpg"))); // NOI18N
        mnElim_bg.setPreferredSize(new java.awt.Dimension(880, 610));
        getContentPane().add(mnElim_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-610, 0, 1510, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mn_jB_elimTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_jB_elimTiendaActionPerformed
        String id = mnElim_txtID.getText();
        if(id.isEmpty()){
            JOptionPane.showMessageDialog(null,"Debes ingresar una ID.");
            return;
        }
        if(best.buscarTienda(id) == null){
            JOptionPane.showMessageDialog(null,"No existe tienda asociada a tal ID.");
            return;
        }
        
        if (JOptionPane.showConfirmDialog(null, "¿Estas seguro?", "Cuidado",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if(best.eliminarTienda(id) == -1){
                JOptionPane.showMessageDialog(null,"Hubo un error con el borrado de la Tienda. Intentar denuevo.");
                return;
            }
            JOptionPane.showMessageDialog(null,"Tienda eliminada exitosamente.");            
        }
        
    }//GEN-LAST:event_mn_jB_elimTiendaActionPerformed

    private void mn_jB_menuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_jB_menuPrincipalActionPerformed
        ventanaMenuPrincipal mnprn = new ventanaMenuPrincipal(best);
        mnprn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mn_jB_menuPrincipalActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel mnElim_bg;
    private javax.swing.JLabel mnElim_msgBorrar;
    private javax.swing.JPanel mnElim_overlay;
    private javax.swing.JPanel mnElim_pnlMsgBorrar;
    private javax.swing.JTextField mnElim_txtID;
    private javax.swing.JButton mn_jB_elimTienda;
    private javax.swing.JButton mn_jB_menuPrincipal;
    // End of variables declaration//GEN-END:variables
}
