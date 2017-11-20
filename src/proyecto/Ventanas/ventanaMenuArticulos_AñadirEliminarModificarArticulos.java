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
import proyecto.Tienda;

/**
 *
 * @author Estudiante_2
 */
public class ventanaMenuArticulos_AñadirEliminarModificarArticulos extends javax.swing.JFrame {

    /**
     * Creates new form ventanaMenuArticulos_AñadirEliminarModificarArticulos
     */
    Empresa best;
    Tienda tienda;
    public ventanaMenuArticulos_AñadirEliminarModificarArticulos(Empresa bestEmpresa,Tienda tienda1) {
        initComponents();
        tienda = tienda1;
        best = bestEmpresa;
        mnA_AEMA_overlay.setBackground(new Color(0,0,0,100));
        DefaultListModel<String> mdl = tienda.modelVentanaArticulo();
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

        mnA_AEMA_overlay = new javax.swing.JPanel();
        mnArticulos_mnTienda = new javax.swing.JButton();
        pnl_msgID3 = new javax.swing.JPanel();
        jlabel_nombre1 = new javax.swing.JLabel();
        pnl_msgID = new javax.swing.JPanel();
        jlabel_nombre = new javax.swing.JLabel();
        mnAddGer_codigo = new javax.swing.JTextField();
        pnl_msgID1 = new javax.swing.JPanel();
        jlabel_rut = new javax.swing.JLabel();
        mnAddGer_precioVenta = new javax.swing.JTextField();
        pnl_msgID2 = new javax.swing.JPanel();
        jlabel_sueldoger = new javax.swing.JLabel();
        mnAddGer_nombre = new javax.swing.JTextField();
        mnAddGer_jB_modificar = new javax.swing.JButton();
        mnAddGer_jB_Eliminar = new javax.swing.JButton();
        mnAddGer_jList = new javax.swing.JScrollPane();
        mnAddGer_jList2 = new javax.swing.JList<>();
        mnAddGer_jB_agregar = new javax.swing.JButton();
        mnAddGer_precioCosto = new javax.swing.JTextField();
        mnAddGer_desct = new javax.swing.JTextField();
        pnl_msgID4 = new javax.swing.JPanel();
        jlabel_nombre2 = new javax.swing.JLabel();
        pnl_msgID5 = new javax.swing.JPanel();
        jlabel_nombre3 = new javax.swing.JLabel();
        mnAddGer_stock = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnA_AEMA_overlay.setBackground(new java.awt.Color(0, 0, 0));
        mnA_AEMA_overlay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mnArticulos_mnTienda.setText("Volver al menu anterior");
        mnArticulos_mnTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnArticulos_mnTiendaActionPerformed(evt);
            }
        });
        mnA_AEMA_overlay.add(mnArticulos_mnTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, -1, -1));

        pnl_msgID3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabel_nombre1.setText("Ingresa el PrecioVenta");
        pnl_msgID3.add(jlabel_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 20));

        mnA_AEMA_overlay.add(pnl_msgID3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 140, 40));

        pnl_msgID.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabel_nombre.setText("Ingresa el Codigo");
        pnl_msgID.add(jlabel_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 20));

        mnA_AEMA_overlay.add(pnl_msgID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, 40));
        mnA_AEMA_overlay.add(mnAddGer_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 130, -1));

        pnl_msgID1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabel_rut.setText("Ingresa el Precio Costo");
        pnl_msgID1.add(jlabel_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 20));

        mnA_AEMA_overlay.add(pnl_msgID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 130, 40));
        mnA_AEMA_overlay.add(mnAddGer_precioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 140, -1));

        pnl_msgID2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabel_sueldoger.setText("Ingresa el Nombre");
        pnl_msgID2.add(jlabel_sueldoger, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 20));

        mnA_AEMA_overlay.add(pnl_msgID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 140, 40));

        mnAddGer_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAddGer_nombreActionPerformed(evt);
            }
        });
        mnA_AEMA_overlay.add(mnAddGer_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 140, -1));

        mnAddGer_jB_modificar.setText("Modificar Articulo");
        mnAddGer_jB_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAddGer_jB_modificarActionPerformed(evt);
            }
        });
        mnA_AEMA_overlay.add(mnAddGer_jB_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        mnAddGer_jB_Eliminar.setText("Eliminar Articulo");
        mnAddGer_jB_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAddGer_jB_EliminarActionPerformed(evt);
            }
        });
        mnA_AEMA_overlay.add(mnAddGer_jB_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, -1, -1));

        mnAddGer_jList.setViewportView(mnAddGer_jList2);

        mnA_AEMA_overlay.add(mnAddGer_jList, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 520, 340));

        mnAddGer_jB_agregar.setText("Agregar Articulo");
        mnAddGer_jB_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAddGer_jB_agregarActionPerformed(evt);
            }
        });
        mnA_AEMA_overlay.add(mnAddGer_jB_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));
        mnA_AEMA_overlay.add(mnAddGer_precioCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 130, -1));
        mnA_AEMA_overlay.add(mnAddGer_desct, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 130, -1));

        pnl_msgID4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabel_nombre2.setText("Ingresa el descuento(%)");
        pnl_msgID4.add(jlabel_nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 20));

        mnA_AEMA_overlay.add(pnl_msgID4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 130, 40));

        pnl_msgID5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabel_nombre3.setText("Ingresa el Stock");
        pnl_msgID5.add(jlabel_nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 20));

        mnA_AEMA_overlay.add(pnl_msgID5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 140, 40));
        mnA_AEMA_overlay.add(mnAddGer_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mnA_AEMA_overlay, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mnA_AEMA_overlay, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnArticulos_mnTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnArticulos_mnTiendaActionPerformed
        ventanaMenuTienda mn = new ventanaMenuTienda(best,tienda);
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnArticulos_mnTiendaActionPerformed

    private void mnAddGer_jB_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAddGer_jB_modificarActionPerformed
        String nombre = mnAddGer_nombre.getText();
        String codigo = mnAddGer_codigo.getText();
        String precioCosto = mnAddGer_precioCosto.getText();
        String precioVenta = mnAddGer_precioVenta.getText();
        String stock = mnAddGer_stock.getText();
        String dsct = mnAddGer_desct.getText();
        
        if(nombre.isEmpty()|| codigo.isEmpty()||precioCosto.isEmpty()||precioVenta.isEmpty()||stock.isEmpty()||dsct.isEmpty()){
            JOptionPane.showMessageDialog(null,"No es posible modificar un articulo con algun campo vacio.");
            return;
        }
        String codigoNuevo;
        do{
            codigoNuevo = JOptionPane.showInputDialog("Ingrese el nuevo codigo: ");
        }while(codigoNuevo.isEmpty() == true);
        
        if(tienda.modificarArticulo(codigo, nombre, precioVenta, precioCosto, stock, dsct, codigoNuevo) == -1){
            JOptionPane.showMessageDialog(null,"Ya esta registrado este articulo.\nO no existe la tienda que deseas modificar.");
            return;
        }
        
        JOptionPane.showMessageDialog(null,"Articulo modificado Exitosamente.");
    }//GEN-LAST:event_mnAddGer_jB_modificarActionPerformed

    private void mnAddGer_jB_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAddGer_jB_EliminarActionPerformed
        String codigo = mnAddGer_codigo.getText();
        if(codigo.isEmpty()){
            JOptionPane.showMessageDialog(null,"No es posible eliminar un articulo sin el codigo.");
            return;
        }
        
        if(tienda.eliminarArticulo(codigo) == -1){
            JOptionPane.showMessageDialog(null,"No existe un articulo con ese codigo.");
            return;
        }
        
        JOptionPane.showMessageDialog(null,"Articulo eliminado Exitosamente.");
    }//GEN-LAST:event_mnAddGer_jB_EliminarActionPerformed

    private void mnAddGer_jB_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAddGer_jB_agregarActionPerformed
        String nombre = mnAddGer_nombre.getText();
        String codigo = mnAddGer_codigo.getText();
        String precioCosto = mnAddGer_precioCosto.getText();
        String precioVenta = mnAddGer_precioVenta.getText();
        String stock = mnAddGer_stock.getText();
        String dsct = mnAddGer_desct.getText();
        
        if(nombre.isEmpty()|| codigo.isEmpty()||precioCosto.isEmpty()||precioVenta.isEmpty()||stock.isEmpty()||dsct.isEmpty()){
            JOptionPane.showMessageDialog(null,"No es posible crear un articulo con algun campo vacio.");
            return;
        }
        if(tienda.añadirArticulosTienda(codigo, nombre, precioVenta, precioCosto,stock,dsct) == -1){
            JOptionPane.showMessageDialog(null,"Ya esta registrado este articulo.");
            return;
        }
        
        JOptionPane.showMessageDialog(null,"Articulo creado Exitosamente.");
    }//GEN-LAST:event_mnAddGer_jB_agregarActionPerformed

    private void mnAddGer_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAddGer_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnAddGer_nombreActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlabel_nombre;
    private javax.swing.JLabel jlabel_nombre1;
    private javax.swing.JLabel jlabel_nombre2;
    private javax.swing.JLabel jlabel_nombre3;
    private javax.swing.JLabel jlabel_rut;
    private javax.swing.JLabel jlabel_sueldoger;
    private javax.swing.JPanel mnA_AEMA_overlay;
    private javax.swing.JTextField mnAddGer_codigo;
    private javax.swing.JTextField mnAddGer_desct;
    private javax.swing.JButton mnAddGer_jB_Eliminar;
    private javax.swing.JButton mnAddGer_jB_agregar;
    private javax.swing.JButton mnAddGer_jB_modificar;
    private javax.swing.JScrollPane mnAddGer_jList;
    private javax.swing.JList<String> mnAddGer_jList2;
    private javax.swing.JTextField mnAddGer_nombre;
    private javax.swing.JTextField mnAddGer_precioCosto;
    private javax.swing.JTextField mnAddGer_precioVenta;
    private javax.swing.JTextField mnAddGer_stock;
    private javax.swing.JButton mnArticulos_mnTienda;
    private javax.swing.JPanel pnl_msgID;
    private javax.swing.JPanel pnl_msgID1;
    private javax.swing.JPanel pnl_msgID2;
    private javax.swing.JPanel pnl_msgID3;
    private javax.swing.JPanel pnl_msgID4;
    private javax.swing.JPanel pnl_msgID5;
    // End of variables declaration//GEN-END:variables
}
