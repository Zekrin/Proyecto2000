/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Ventanas;

/**
 *
 * @author Estudiante_2
 */
public class ventanaMenuVendedor extends javax.swing.JFrame {

    /**
     * Creates new form ventanaMenuArticulos
     */
    public ventanaMenuVendedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mnVendedor_overlay = new javax.swing.JPanel();
        mnVendedor_mnTienda = new javax.swing.JButton();
        mnVendedor_AñadirVerFacturas = new javax.swing.JButton();
        mnVendedor_ExportarFacturas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnVendedor_overlay.setBackground(new java.awt.Color(0, 0, 0));
        mnVendedor_overlay.setPreferredSize(new java.awt.Dimension(880, 610));
        mnVendedor_overlay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mnVendedor_mnTienda.setText("Volver al menu anterior");
        mnVendedor_mnTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVendedor_mnTiendaActionPerformed(evt);
            }
        });
        mnVendedor_overlay.add(mnVendedor_mnTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, -1, -1));

        mnVendedor_AñadirVerFacturas.setText("Añadir/ver Factura/s");
        mnVendedor_AñadirVerFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVendedor_AñadirVerFacturasActionPerformed(evt);
            }
        });
        mnVendedor_overlay.add(mnVendedor_AñadirVerFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 160, -1));

        mnVendedor_ExportarFacturas.setText("Exportar Facturas");
        mnVendedor_ExportarFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVendedor_ExportarFacturasActionPerformed(evt);
            }
        });
        mnVendedor_overlay.add(mnVendedor_ExportarFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mnVendedor_overlay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mnVendedor_overlay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnVendedor_mnTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVendedor_mnTiendaActionPerformed
        //ventanaMenuPrincipal mn = new ventanaMenuPrincipal(best);
        //mn.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_mnVendedor_mnTiendaActionPerformed

    private void mnVendedor_AñadirVerFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVendedor_AñadirVerFacturasActionPerformed

    }//GEN-LAST:event_mnVendedor_AñadirVerFacturasActionPerformed

    private void mnVendedor_ExportarFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVendedor_ExportarFacturasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnVendedor_ExportarFacturasActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton mnVendedor_AñadirVerFacturas;
    private javax.swing.JButton mnVendedor_ExportarFacturas;
    private javax.swing.JButton mnVendedor_mnTienda;
    private javax.swing.JPanel mnVendedor_overlay;
    // End of variables declaration//GEN-END:variables
}