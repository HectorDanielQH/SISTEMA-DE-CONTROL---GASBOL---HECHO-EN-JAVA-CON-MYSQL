/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view.ADMINISTRADOR;

import controller.ControllerVentas;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author hdani
 */
public class VENTAS_POR_RANGO extends javax.swing.JInternalFrame {

    /**
     * Creates new form VENTAS_POR_RANGO
     */
    public VENTAS_POR_RANGO() {
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

        rSLabelBorderRound1 = new rojeru_san.rslabel.RSLabelBorderRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new RSMaterialComponent.RSTableMetro();
        rSCalendar1 = new newscomponents.RSCalendar();
        rSButtonEstados1 = new rojeru_san.rsbutton.RSButtonEstados();
        rSButtonIconUno3 = new RSMaterialComponent.RSButtonIconUno();
        rSButtonIconUno4 = new RSMaterialComponent.RSButtonIconUno();
        rSCalendar2 = new newscomponents.RSCalendar();

        setClosable(true);
        setResizable(true);

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

        rSButtonEstados1.setText("BUSCAR");
        rSButtonEstados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonEstados1ActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rSCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rSCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSButtonEstados1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rSButtonIconUno3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rSButtonIconUno4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rSLabelBorderRound1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rSButtonIconUno3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonIconUno4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(rSButtonEstados1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(rSLabelBorderRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonEstados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonEstados1ActionPerformed
        ControllerVentas ventas=new ControllerVentas();
        ventas.Mostrar_fecha_rango(rSCalendar1.getDate().getDate(), rSCalendar1.getDate().getMonth()+1,rSCalendar1.getDate().getYear()+1900,rSCalendar2.getDate().getDate(), rSCalendar2.getDate().getMonth()+1,rSCalendar2.getDate().getYear()+1900, rSTableMetro1, rSLabelBorderRound1);
        TableColumnModel columnModel = rSTableMetro1.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(100);
        columnModel.getColumn(1).setPreferredWidth(500);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(100);
        columnModel.getColumn(5).setPreferredWidth(100);
        columnModel.getColumn(6).setPreferredWidth(100);
        columnModel.getColumn(7).setPreferredWidth(100);
        columnModel.getColumn(8).setPreferredWidth(100);
        columnModel.getColumn(9).setPreferredWidth(100);
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonEstados1ActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private rojeru_san.rsbutton.RSButtonEstados rSButtonEstados1;
    private RSMaterialComponent.RSButtonIconUno rSButtonIconUno3;
    private RSMaterialComponent.RSButtonIconUno rSButtonIconUno4;
    private newscomponents.RSCalendar rSCalendar1;
    private newscomponents.RSCalendar rSCalendar2;
    private rojeru_san.rslabel.RSLabelBorderRound rSLabelBorderRound1;
    private RSMaterialComponent.RSTableMetro rSTableMetro1;
    // End of variables declaration//GEN-END:variables
}