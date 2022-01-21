/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view.ADMINISTRADOR;

import controller.ControllerProducto;
import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author hdani
 */
public class INVENTARIO extends javax.swing.JInternalFrame {

    /**
     * Creates new form INVENTARIO
     */
    JDesktopPane ini=null;
    public INVENTARIO(JDesktopPane panel) {
        initComponents();
        ini=panel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSButtonIconUno1 = new RSMaterialComponent.RSButtonIconUno();
        rSButtonIconUno2 = new RSMaterialComponent.RSButtonIconUno();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new RSMaterialComponent.RSTableMetro();
        rSButtonIconUno3 = new RSMaterialComponent.RSButtonIconUno();
        rSButtonIconUno4 = new RSMaterialComponent.RSButtonIconUno();
        rSButtonPane1 = new rojerusan.RSButtonPane();
        rSPanelImage1 = new rojeru_san.rspanel.RSPanelImage();
        jLabel1 = new javax.swing.JLabel();
        rSButtonPane3 = new rojerusan.RSButtonPane();
        rSPanelImage3 = new rojeru_san.rspanel.RSPanelImage();
        jLabel3 = new javax.swing.JLabel();
        rSButtonPane2 = new rojerusan.RSButtonPane();
        rSPanelImage2 = new rojeru_san.rspanel.RSPanelImage();
        jLabel2 = new javax.swing.JLabel();
        rSMetroTextFullPlaceHolder1 = new rojerusan.RSMetroTextFullPlaceHolder();

        rSButtonIconUno1.setBackground(new java.awt.Color(102, 153, 0));
        rSButtonIconUno1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.NAVIGATE_BEFORE);
        rSButtonIconUno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconUno1ActionPerformed(evt);
            }
        });

        rSButtonIconUno2.setBackground(new java.awt.Color(102, 153, 0));
        rSButtonIconUno2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.NAVIGATE_NEXT);
        rSButtonIconUno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconUno2ActionPerformed(evt);
            }
        });

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
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

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

        rSButtonPane1.setBackground(new java.awt.Color(0, 153, 204));
        rSButtonPane1.setColorHover(java.awt.Color.orange);
        rSButtonPane1.setOpaque(false);
        rSButtonPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonPane1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rSButtonPane1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rSButtonPane1MouseExited(evt);
            }
        });

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ICONS_MANAGEMENT/Sin título-1.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 105, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AÑADIR PRODUCTO");

        javax.swing.GroupLayout rSButtonPane1Layout = new javax.swing.GroupLayout(rSButtonPane1);
        rSButtonPane1.setLayout(rSButtonPane1Layout);
        rSButtonPane1Layout.setHorizontalGroup(
            rSButtonPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSButtonPane1Layout.createSequentialGroup()
                .addGroup(rSButtonPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSButtonPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rSButtonPane1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rSButtonPane1Layout.setVerticalGroup(
            rSButtonPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSButtonPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rSButtonPane3.setBackground(new java.awt.Color(0, 153, 204));
        rSButtonPane3.setColorHover(java.awt.Color.orange);
        rSButtonPane3.setOpaque(false);
        rSButtonPane3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonPane3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rSButtonPane3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rSButtonPane3MouseExited(evt);
            }
        });

        rSPanelImage3.setImagen(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ICONS_MANAGEMENT/Sin título-11.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage3Layout = new javax.swing.GroupLayout(rSPanelImage3);
        rSPanelImage3.setLayout(rSPanelImage3Layout);
        rSPanelImage3Layout.setHorizontalGroup(
            rSPanelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );
        rSPanelImage3Layout.setVerticalGroup(
            rSPanelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("EDITAR PRODUCTO");

        javax.swing.GroupLayout rSButtonPane3Layout = new javax.swing.GroupLayout(rSButtonPane3);
        rSButtonPane3.setLayout(rSButtonPane3Layout);
        rSButtonPane3Layout.setHorizontalGroup(
            rSButtonPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSButtonPane3Layout.createSequentialGroup()
                .addGroup(rSButtonPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSButtonPane3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rSButtonPane3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(rSPanelImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rSButtonPane3Layout.setVerticalGroup(
            rSButtonPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSButtonPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSPanelImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rSButtonPane2.setBackground(new java.awt.Color(0, 153, 204));
        rSButtonPane2.setColorHover(java.awt.Color.orange);
        rSButtonPane2.setOpaque(false);
        rSButtonPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonPane2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rSButtonPane2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rSButtonPane2MouseExited(evt);
            }
        });

        rSPanelImage2.setImagen(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ICONS_MANAGEMENT/CERRAR.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage2Layout = new javax.swing.GroupLayout(rSPanelImage2);
        rSPanelImage2.setLayout(rSPanelImage2Layout);
        rSPanelImage2Layout.setHorizontalGroup(
            rSPanelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );
        rSPanelImage2Layout.setVerticalGroup(
            rSPanelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ELIMINAR PRODUCTO");

        javax.swing.GroupLayout rSButtonPane2Layout = new javax.swing.GroupLayout(rSButtonPane2);
        rSButtonPane2.setLayout(rSButtonPane2Layout);
        rSButtonPane2Layout.setHorizontalGroup(
            rSButtonPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSButtonPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSButtonPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSPanelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        rSButtonPane2Layout.setVerticalGroup(
            rSButtonPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSButtonPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSPanelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rSMetroTextFullPlaceHolder1.setPlaceholder("INGRESA EL CODIGO A BUSCAR");
        rSMetroTextFullPlaceHolder1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rSMetroTextFullPlaceHolder1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(rSButtonPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rSButtonPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rSButtonPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(rSButtonIconUno3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rSButtonIconUno4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 145, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rSMetroTextFullPlaceHolder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSButtonPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rSButtonIconUno3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonIconUno4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSMetroTextFullPlaceHolder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonIconUno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconUno1ActionPerformed
        int ultima_fila=rSTableMetro1.getSelectedRow();
        ultima_fila-=1;
        if(ultima_fila<0)
        {
            ultima_fila=rSTableMetro1.getRowCount()-1;
        }
        rSTableMetro1.setRowSelectionInterval(ultima_fila,ultima_fila);
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonIconUno1ActionPerformed

    private void rSButtonIconUno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconUno2ActionPerformed
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
    }//GEN-LAST:event_rSButtonIconUno2ActionPerformed

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

    private void rSButtonPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonPane1MouseClicked
        AÑADIR_PRODUCTO ad=new AÑADIR_PRODUCTO(rSTableMetro1,ini,0);
        ini.add(ad);
        ad.setLocation(10, 10);
        ad.setVisible(true);
        ini.repaint();
        ini.revalidate();
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonPane1MouseClicked

    private void rSButtonPane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonPane1MouseEntered
        rSButtonPane1.setOpaque(true);
        rSButtonPane1.setColorHover(Color.orange);
        jLabel1.setForeground(Color.DARK_GRAY);
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonPane1MouseEntered

    private void rSButtonPane1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonPane1MouseExited
        rSButtonPane1.setOpaque(false);
        jLabel1.setForeground(Color.WHITE);
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonPane1MouseExited

    private void rSButtonPane3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonPane3MouseClicked
        AÑADIR_PRODUCTO ad=new AÑADIR_PRODUCTO(rSTableMetro1,ini,1,rSTableMetro1.getSelectedRow());
        ini.add(ad);
        ad.setLocation(10, 10);
        ad.setVisible(true);
        ini.repaint();
        ini.revalidate();
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonPane3MouseClicked

    private void rSButtonPane3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonPane3MouseEntered
        rSButtonPane3.setOpaque(true);
        rSButtonPane3.setColorHover(Color.orange);
        jLabel3.setForeground(Color.DARK_GRAY);
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonPane3MouseEntered

    private void rSButtonPane3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonPane3MouseExited
        rSButtonPane3.setOpaque(false);
        jLabel3.setForeground(Color.WHITE);
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonPane3MouseExited

    private void rSButtonPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonPane2MouseClicked
        ControllerProducto prod=new ControllerProducto();
        int da=prod.ELIMINAR(rSTableMetro1.getModel().getValueAt(rSTableMetro1.getSelectedRow(), 0).toString());
        if(da==1)
        {
            JOptionPane.showMessageDialog(null, "LA ELIMINACION FUE REALIZADA","ALERTA",JOptionPane.WARNING_MESSAGE);
            prod.Mostrar(rSTableMetro1);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "LA ELIMINACION NO PUEDE SER REALIZADA, EL PRODUCTO TIENE VENTAS","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
        ini.repaint();
        ini.revalidate();
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonPane2MouseClicked

    private void rSButtonPane2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonPane2MouseEntered
        rSButtonPane2.setOpaque(true);
        rSButtonPane2.setColorHover(Color.orange);
        jLabel2.setForeground(Color.DARK_GRAY);// TODO add your handling code here:
    }//GEN-LAST:event_rSButtonPane2MouseEntered

    private void rSButtonPane2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonPane2MouseExited
        rSButtonPane2.setOpaque(false);
        jLabel2.setForeground(Color.WHITE);// TODO add your handling code here:
    }//GEN-LAST:event_rSButtonPane2MouseExited

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        controller.ControllerProducto prod=new ControllerProducto();
        prod.Mostrar(rSTableMetro1);
        TableColumnModel columnModel = rSTableMetro1.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(100);
        columnModel.getColumn(1).setPreferredWidth(500);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(100);
        columnModel.getColumn(5).setPreferredWidth(100);
        columnModel.getColumn(6).setPreferredWidth(100);
                // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameActivated

    private void rSMetroTextFullPlaceHolder1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rSMetroTextFullPlaceHolder1KeyReleased
        controller.ControllerProducto prod=new ControllerProducto();
        prod.MostrarBusqueda(rSTableMetro1,rSMetroTextFullPlaceHolder1.getText());
        ini.repaint();
        ini.revalidate();
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMetroTextFullPlaceHolder1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSButtonIconUno rSButtonIconUno1;
    private RSMaterialComponent.RSButtonIconUno rSButtonIconUno2;
    private RSMaterialComponent.RSButtonIconUno rSButtonIconUno3;
    private RSMaterialComponent.RSButtonIconUno rSButtonIconUno4;
    private rojerusan.RSButtonPane rSButtonPane1;
    private rojerusan.RSButtonPane rSButtonPane2;
    private rojerusan.RSButtonPane rSButtonPane3;
    private rojerusan.RSMetroTextFullPlaceHolder rSMetroTextFullPlaceHolder1;
    private rojeru_san.rspanel.RSPanelImage rSPanelImage1;
    private rojeru_san.rspanel.RSPanelImage rSPanelImage2;
    private rojeru_san.rspanel.RSPanelImage rSPanelImage3;
    private RSMaterialComponent.RSTableMetro rSTableMetro1;
    // End of variables declaration//GEN-END:variables
}