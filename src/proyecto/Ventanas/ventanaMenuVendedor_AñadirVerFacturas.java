/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Ventanas;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import proyecto.Articulo;
import proyecto.Empresa;
import proyecto.Tienda;
import proyecto.Vendedor;

/**
 *
 * @author Zekro
 */
public class ventanaMenuVendedor_AñadirVerFacturas extends javax.swing.JFrame {

    /**
     * Creates new form ventanaMenuVendedor_AñadirVerFacturas
     */
    private Empresa best;
    private Tienda tienda;
    private Vendedor vend;
    public ventanaMenuVendedor_AñadirVerFacturas(Empresa bestEmpresa,Tienda tienda1,Vendedor vn1) {
        initComponents();
        best=bestEmpresa;
        tienda=tienda1;
        vend = vn1;
        mnVendedor_overlay.setBackground(new Color(0,0,0,100));
        DefaultListModel<String> mdl = vend.mdlFacturas();
        DefaultListModel<String> mdl2 = tienda.modelAgregarFacturaArticulo();
        mnAddGer_jList2.setModel(mdl);
        mnAddGer_jList3.setModel(mdl2);
        mnAddGer_jList3.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
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
        mnVendedor_CrearFactura = new javax.swing.JButton();
        mnAddGer_jList = new javax.swing.JScrollPane();
        mnAddGer_jList2 = new javax.swing.JList<>();
        pnl_msgID3 = new javax.swing.JPanel();
        jlabel_nombre3 = new javax.swing.JLabel();
        jlabel_nombre4 = new javax.swing.JLabel();
        jlabel_nombre5 = new javax.swing.JLabel();
        pnl_msgID2 = new javax.swing.JPanel();
        jlabel_nombre2 = new javax.swing.JLabel();
        pnl_msgID1 = new javax.swing.JPanel();
        jlabel_nombre1 = new javax.swing.JLabel();
        mnAddGer_jList1 = new javax.swing.JScrollPane();
        mnAddGer_jList3 = new javax.swing.JList<>();
        mnAddGer_nombreGer = new javax.swing.JTextField();

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

        mnVendedor_CrearFactura.setText("Crear Factura");
        mnVendedor_CrearFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVendedor_CrearFacturaActionPerformed(evt);
            }
        });
        mnVendedor_overlay.add(mnVendedor_CrearFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        mnAddGer_jList.setViewportView(mnAddGer_jList2);

        mnVendedor_overlay.add(mnAddGer_jList, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 320, 340));

        pnl_msgID3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabel_nombre3.setText("FACTURA A CREAR");
        pnl_msgID3.add(jlabel_nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 20));

        jlabel_nombre4.setText("INGRESA LA ID");
        pnl_msgID3.add(jlabel_nombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 80, 20));

        jlabel_nombre5.setText("DE LA NUEVA");
        pnl_msgID3.add(jlabel_nombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 20));

        mnVendedor_overlay.add(pnl_msgID3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 130, 70));

        pnl_msgID2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabel_nombre2.setText("     CODIGOS DE ARTICULOS REGISTRADOS");
        pnl_msgID2.add(jlabel_nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 20));

        mnVendedor_overlay.add(pnl_msgID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 350, 40));

        pnl_msgID1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabel_nombre1.setText("      FACTURAS REGISTRADAS");
        pnl_msgID1.add(jlabel_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 190, 20));

        mnVendedor_overlay.add(pnl_msgID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 320, 40));

        mnAddGer_jList1.setViewportView(mnAddGer_jList3);

        mnVendedor_overlay.add(mnAddGer_jList1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 350, 340));
        mnVendedor_overlay.add(mnAddGer_nombreGer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 130, -1));

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
        ventanaMenuTienda mn = new ventanaMenuTienda(best,tienda);
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnVendedor_mnTiendaActionPerformed

    private void mnVendedor_CrearFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVendedor_CrearFacturaActionPerformed
        int[] index = mnAddGer_jList3.getSelectedIndices();
        String IDFact = mnAddGer_nombreGer.getText();
        if(vend.buscarSiExisteFactura(IDFact) == 1){
            for(int i = 0;i<index.length;i++){
                String codigo = mnAddGer_jList3.getModel().getElementAt(i);
                Articulo aux = tienda.buscarArticulo(codigo);
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("\nItems Seleccionados\n["+(i+1)+"] de ["+index.length+"]"
                        + "\nIngrese la cantidad que se vendió: "));
                if(cantidad == 1){
                    vend.añadirArticuloFactura(IDFact, aux);
                }else if(cantidad >1){
                    vend.añadirArticuloFactura(IDFact, aux, cantidad);
                }
            }
            return;
        }
        
        String codigo = mnAddGer_jList3.getModel().getElementAt(0);
        Articulo aux = tienda.buscarArticulo(codigo);
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("\nItems Seleccionados\n["+1+"] de ["+index.length+"]"
                    + "\nIngrese la cantidad que se vendió: "));
        
        if(cantidad == 1){
            vend.añadirFactura(IDFact,aux);
        }else if(cantidad >1){
            vend.añadirFactura(IDFact,aux,cantidad);
        }
        if(index.length == 1)return;
        
        for(int i = 1;i<index.length;i++){
            codigo = mnAddGer_jList3.getModel().getElementAt(i);
            aux = tienda.buscarArticulo(codigo);
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("\nItems Seleccionados\n["+(i+1)+"] de ["+index.length+"]"
                    + "\nIngrese la cantidad que se vendió: "));
            if(cantidad == 1){
                vend.añadirArticuloFactura(IDFact, aux);
            }else if(cantidad >1){
                vend.añadirArticuloFactura(IDFact, aux, cantidad);
            }
        }
    }//GEN-LAST:event_mnVendedor_CrearFacturaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlabel_nombre1;
    private javax.swing.JLabel jlabel_nombre2;
    private javax.swing.JLabel jlabel_nombre3;
    private javax.swing.JLabel jlabel_nombre4;
    private javax.swing.JLabel jlabel_nombre5;
    private javax.swing.JScrollPane mnAddGer_jList;
    private javax.swing.JScrollPane mnAddGer_jList1;
    private javax.swing.JList<String> mnAddGer_jList2;
    private javax.swing.JList<String> mnAddGer_jList3;
    private javax.swing.JTextField mnAddGer_nombreGer;
    private javax.swing.JButton mnVendedor_CrearFactura;
    private javax.swing.JButton mnVendedor_mnTienda;
    private javax.swing.JPanel mnVendedor_overlay;
    private javax.swing.JPanel pnl_msgID1;
    private javax.swing.JPanel pnl_msgID2;
    private javax.swing.JPanel pnl_msgID3;
    // End of variables declaration//GEN-END:variables
}
