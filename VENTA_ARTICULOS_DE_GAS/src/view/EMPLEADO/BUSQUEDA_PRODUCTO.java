/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view.EMPLEADO;

import controller.ControllerProducto;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author hdani
 */
public class BUSQUEDA_PRODUCTO extends javax.swing.JInternalFrame {

    /**
     * Creates new form BUSQUEDA_PRODUCTO
     */
    public BUSQUEDA_PRODUCTO() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new RSMaterialComponent.RSTableMetro();
        rSMetroTextFullPlaceHolder1 = new rojerusan.RSMetroTextFullPlaceHolder();
        rSButtonIconUno3 = new RSMaterialComponent.RSButtonIconUno();
        rSButtonIconUno4 = new RSMaterialComponent.RSButtonIconUno();

        setClosable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(rSTableMetro1);

        rSMetroTextFullPlaceHolder1.setPlaceholder("INGRESA UNA DESCRIPCION");
        rSMetroTextFullPlaceHolder1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rSMetroTextFullPlaceHolder1KeyReleased(evt);
            }
        });

        rSButtonIconUno3.setBackground(new java.awt.Color(102, 153, 0));
        rSButtonIconUno3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.NAVIGATE_BEFORE);
        rSButtonIconUno3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconUno3ActionPerformed(evt);
            }
        });

        rSButtonIconUno4.setBackground(new java.awt.Color(102, 153, 0));
        rSButtonIconUno4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.NAVIGATE_NEXT);
        rSButtonIconUno4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconUno4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSMetroTextFullPlaceHolder1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(353, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(661, 661, 661)
                            .addComponent(rSButtonIconUno3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(rSButtonIconUno4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 96, Short.MAX_VALUE))
                        .addComponent(jScrollPane1))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(rSMetroTextFullPlaceHolder1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(524, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rSButtonIconUno3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonIconUno4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSMetroTextFullPlaceHolder1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rSMetroTextFullPlaceHolder1KeyReleased
        ControllerProducto prod=new ControllerProducto();
        prod.MostrarBusquedaDescripcion(rSTableMetro1,rSMetroTextFullPlaceHolder1.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMetroTextFullPlaceHolder1KeyReleased

    private void rSButtonIconUno3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconUno3ActionPerformed
        int ultima_fila=rSTableMetro1.getSelectedRow();
        ultima_fila-=1;
        if(ultima_fila<0)
        {
            ultima_fila=rSTableMetro1.getRowCount()-1;
        }
        rSTableMetro1.setRowSelectionInterval(ultima_fila,ultima_fila);
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonIconUno3ActionPerformed

    private void rSButtonIconUno4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconUno4ActionPerformed
        int ultima_fila=rSTableMetro1.getSelectedRow();
        ultima_fila+=1;
        if(ultima_fila==rSTableMetro1.getRowCount())
        {
            rSTableMetro1.setRowSelectionInterval(0, 0);
        }
        else
        {
            rSTableMetro1.setRowSelectionInterval(ultima_fila,ultima_fila);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonIconUno4ActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        ControllerProducto prod=new ControllerProducto();
        prod.MostrarEmp(rSTableMetro1);
        TableColumnModel columnModel = rSTableMetro1.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(100);
        columnModel.getColumn(1).setPreferredWidth(500);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(100);
        columnModel.getColumn(5).setPreferredWidth(100);
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSButtonIconUno rSButtonIconUno3;
    private RSMaterialComponent.RSButtonIconUno rSButtonIconUno4;
    private rojerusan.RSMetroTextFullPlaceHolder rSMetroTextFullPlaceHolder1;
    private RSMaterialComponent.RSTableMetro rSTableMetro1;
    // End of variables declaration//GEN-END:variables
}