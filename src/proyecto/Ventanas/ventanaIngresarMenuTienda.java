/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Ventanas;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import proyecto.Empresa;
import proyecto.Tienda;

/**
 *
 * @author Zekro
 */
public class ventanaIngresarMenuTienda extends javax.swing.JFrame {

    /**
     * Creates new form ventanaIngresarMenuTienda
     */
    Empresa best;
    public ventanaIngresarMenuTienda(Empresa bestEmpresa) {
        initComponents();
        imn_overlay.setBackground(new Color(0,0,0,100));
        best = bestEmpresa;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imn_overlay = new javax.swing.JPanel();
        imn_volverMnPrincipal = new javax.swing.JButton();
        imn_ComboBox = new javax.swing.JComboBox<>();
        imn_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(880, 610));
        setMinimumSize(new java.awt.Dimension(880, 610));
        setPreferredSize(new java.awt.Dimension(880, 610));
        setResizable(false);
        setSize(new java.awt.Dimension(880, 610));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imn_overlay.setBackground(new java.awt.Color(0, 0, 0));
        imn_overlay.setPreferredSize(new java.awt.Dimension(880, 610));
        imn_overlay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imn_volverMnPrincipal.setText("Volver al menu principal");
        imn_volverMnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imn_volverMnPrincipalActionPerformed(evt);
            }
        });
        imn_overlay.add(imn_volverMnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, -1, -1));

        imn_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        imn_overlay.add(imn_ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 180, -1));

        getContentPane().add(imn_overlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 610));

        imn_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/348529-japan-wallpaper-3840x2160-ipad-retina.jpg"))); // NOI18N
        imn_bg.setText("x");
        getContentPane().add(imn_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1730, 0, 2610, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imn_volverMnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imn_volverMnPrincipalActionPerformed
        ventanaMenuPrincipal mn = new ventanaMenuPrincipal(best);
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_imn_volverMnPrincipalActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> imn_ComboBox;
    private javax.swing.JLabel imn_bg;
    private javax.swing.JPanel imn_overlay;
    private javax.swing.JButton imn_volverMnPrincipal;
    // End of variables declaration//GEN-END:variables
}
