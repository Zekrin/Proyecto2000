/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Ventanas;

import java.awt.Color;
import javax.swing.JOptionPane;
import proyecto.Empresa;
import proyecto.Gerente;
import proyecto.Tienda;

/**
 *
 * @author Estudiante_2
 */
public class ventanaMenuTienda_CambiarGerente extends javax.swing.JFrame {

    /**
     * Creates new form ventanaMenuTienda_CambiarGerente
     */
    private javax.swing.JComboBox<String> mnT_CG_ComboBox1;
    Empresa best;
    Tienda tienda;
    public ventanaMenuTienda_CambiarGerente(Empresa bestEmpresa,Tienda tienda1) {
        initComponents();
        best = bestEmpresa;
        tienda = tienda1;
        mnT_CG_overlay.setBackground(new Color(0,0,0,100));
        mnT_CG_ComboBox1 = new javax.swing.JComboBox<>();
        mnT_CG_ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(best.arrayGerentesParaComboBox()));
        mnT_CG_overlay.add(mnT_CG_ComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mnT_CG_overlay = new javax.swing.JPanel();
        mnT_CG_AñadirGerente = new javax.swing.JButton();
        mnArticulos_mnTienda = new javax.swing.JButton();
        mnT_CG_jList = new javax.swing.JScrollPane();
        mnAddGer_jList2 = new javax.swing.JList<>();
        pnl_IDTienda = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnT_CG_overlay.setBackground(new java.awt.Color(0, 0, 0));
        mnT_CG_overlay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mnT_CG_AñadirGerente.setText("Añadir Gerente");
        mnT_CG_AñadirGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnT_CG_AñadirGerenteActionPerformed(evt);
            }
        });
        mnT_CG_overlay.add(mnT_CG_AñadirGerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 200, -1));

        mnArticulos_mnTienda.setText("Volver al menu anterior");
        mnArticulos_mnTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnArticulos_mnTiendaActionPerformed(evt);
            }
        });
        mnT_CG_overlay.add(mnArticulos_mnTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, -1, -1));

        mnT_CG_jList.setViewportView(mnAddGer_jList2);

        mnT_CG_overlay.add(mnT_CG_jList, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 520, 340));

        pnl_IDTienda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Selecciona un Gerente disponible");
        pnl_IDTienda.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 170, 20));

        mnT_CG_overlay.add(pnl_IDTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 220, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mnT_CG_overlay, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mnT_CG_overlay, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnT_CG_AñadirGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnT_CG_AñadirGerenteActionPerformed
        String rutGer = mnT_CG_ComboBox1.getItemAt(mnT_CG_ComboBox1.getSelectedIndex());
        Gerente ger = best.buscarGerente(rutGer);
        if(rutGer.equals("00.000.000-0")|| rutGer == null){
            JOptionPane.showMessageDialog(null,"No hay gerentes registrados.\nRegistra uno en el menu principal.");
            return;
        }
        if(tienda.getGerente() != null){
            tienda.getGerente().setTiendaACargo(null);
            best.nullTiendaGerente(tienda.getGerente());
        }
        tienda.setGerente(ger);
        ger.setTiendaACargo(tienda.getID());
        JOptionPane.showMessageDialog(null,"Gerente cambiado exitosamente.");
    }//GEN-LAST:event_mnT_CG_AñadirGerenteActionPerformed

    private void mnArticulos_mnTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnArticulos_mnTiendaActionPerformed
        ventanaMenuTienda mn = new ventanaMenuTienda(best,tienda);
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnArticulos_mnTiendaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> mnAddGer_jList2;
    private javax.swing.JButton mnArticulos_mnTienda;
    private javax.swing.JButton mnT_CG_AñadirGerente;
    private javax.swing.JScrollPane mnT_CG_jList;
    private javax.swing.JPanel mnT_CG_overlay;
    private javax.swing.JPanel pnl_IDTienda;
    // End of variables declaration//GEN-END:variables
}