/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hdani
 */
public class PRODUCTO extends Conexion{
    public PRODUCTO(){
        super();
    }
    public TableModel Mostrar()
    {
        TableModel modelo=null;
        String sql="select COD_PROD,DESCRIPCION,MARCA,PRECIO_COMPRA,PRECIO_VENTA,CANTIDAD,PROVEEDOR from producto order by CANTIDAD asc;";
        try{
            Statement st=this.Conexion.createStatement();
            ResultSet resultado=st.executeQuery(sql);
            DefaultTableModel modelo_tabla=new DefaultTableModel();
            modelo_tabla.addColumn("COD. PRODUCTO");
            modelo_tabla.addColumn("DESCRIPCION");
            modelo_tabla.addColumn("MARCA");
            modelo_tabla.addColumn("PRECIO_COMPRA");
            modelo_tabla.addColumn("PRECIO_VENTA");
            modelo_tabla.addColumn("CANTIDAD");
            modelo_tabla.addColumn("PROVEEDOR");
            while(resultado.next()){
                modelo_tabla.addRow(new Object[]{resultado.getString(1),resultado.getString(2),resultado.getString(3),resultado.getString(4),resultado.getString(5),resultado.getString(6),resultado.getString(7)});
            }
            modelo=modelo_tabla;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "EXISTIO UN ERROR DE CONSULTA" + e);
        }
        finally{
            return modelo;
        }
    }
    public TableModel MostrarEmp()
    {
        TableModel modelo=null;
        String sql="select COD_PROD,DESCRIPCION,MARCA,PRECIO_VENTA,CANTIDAD,PROVEEDOR from producto where CANTIDAD>0 order by CANTIDAD asc;";
        try{
            Statement st=this.Conexion.createStatement();
            ResultSet resultado=st.executeQuery(sql);
            DefaultTableModel modelo_tabla=new DefaultTableModel();
            modelo_tabla.addColumn("COD. PRODUCTO");
            modelo_tabla.addColumn("DESCIRPCION");
            modelo_tabla.addColumn("MARCA");
            modelo_tabla.addColumn("PRECIO");
            modelo_tabla.addColumn("CANTIDAD");
            modelo_tabla.addColumn("PROVEEDOR");
            while(resultado.next()){
                modelo_tabla.addRow(new Object[]{resultado.getString(1),resultado.getString(2),resultado.getString(3),resultado.getString(4),resultado.getString(5),resultado.getString(6)});
            }
            modelo=modelo_tabla;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "EXISTIO UN ERROR DE CONSULTA" + e);
        }
        finally{
            return modelo;
        }
    }
    
    public void MostrarBusq(JTable tabla, String bus)
    {
        TableModel modelo=null;
        String sql="select COD_PROD,DESCRIPCION,MARCA,PRECIO_COMPRA,PRECIO_VENTA,CANTIDAD,PROVEEDOR from producto where COD_PROD like '%"+bus+"%' order by CANTIDAD asc;";
        try{
            Statement st=this.Conexion.createStatement();
            ResultSet resultado=st.executeQuery(sql);
            DefaultTableModel modelo_tabla=new DefaultTableModel();
            modelo_tabla.addColumn("COD. PRODUCTO");
            modelo_tabla.addColumn("DESCIRPCION");
            modelo_tabla.addColumn("MARCA");
            modelo_tabla.addColumn("PRECIO COMPRA");
            modelo_tabla.addColumn("PRECIO VENTA");
            modelo_tabla.addColumn("CANTIDAD");
            modelo_tabla.addColumn("PROVEEDOR");
            while(resultado.next()){
                modelo_tabla.addRow(new Object[]{resultado.getString(1),resultado.getString(2),resultado.getString(3),resultado.getString(4),resultado.getString(5),resultado.getString(6),resultado.getString(7)});
            }
            modelo=modelo_tabla;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "EXISTIO UN ERROR DE CONSULTA" + e);
        }
        finally{
            tabla.setModel(modelo);
        }
    }
    public void MostrarBusquedaDescripcion(JTable tabla, String bus)
    {
        TableModel modelo=null;
        String sql="select COD_PROD,DESCRIPCION,MARCA,PRECIO_VENTA,CANTIDAD,PROVEEDOR from producto where DESCRIPCION like '%"+bus+"%' and CANTIDAD>0 order by CANTIDAD asc;";
        try{
            Statement st=this.Conexion.createStatement();
            ResultSet resultado=st.executeQuery(sql);
            DefaultTableModel modelo_tabla=new DefaultTableModel();
            modelo_tabla.addColumn("COD. PRODUCTO");
            modelo_tabla.addColumn("DESCIRPCION");
            modelo_tabla.addColumn("MARCA");
            modelo_tabla.addColumn("PRECIO");
            modelo_tabla.addColumn("CANTIDAD");
            modelo_tabla.addColumn("PROVEEDOR");
            while(resultado.next()){
                modelo_tabla.addRow(new Object[]{resultado.getString(1),resultado.getString(2),resultado.getString(3),resultado.getString(4),resultado.getString(5),resultado.getString(6)});
            }
            modelo=modelo_tabla;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "EXISTIO UN ERROR DE CONSULTA" + e);
        }
        finally{
            tabla.setModel(modelo);
        }
    }
    public int INSERTAR(String COD_PROD, String DESCRIPCION, String MARCA, String PRECIO_C,String PRECIO_V,String CANTIDAD, String PROVEEDOR){
        int mensaje=-1;
        String sql="CALL CREAR_PRODUCTO(?,?,?,?,?,?,?,?)";
        try{
            CallableStatement call=this.Conexion.prepareCall(sql);
            call.setString(1, COD_PROD);
            call.setString(2, DESCRIPCION);
            call.setString(3, MARCA);
            call.setFloat(4, Float.parseFloat(PRECIO_C.replace(",", ".")));
            call.setFloat(5, Float.parseFloat(PRECIO_V.replace(",", ".")));
            call.setFloat(6, Float.parseFloat(CANTIDAD.replace(",", ".")));
            call.setString(7, PROVEEDOR);
            call.registerOutParameter(8, java.sql.Types.INTEGER);
            call.execute();
            mensaje=call.getInt(8);
            call.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR "+e.getMessage());
        }
        finally{
            return mensaje;
        }
    }
    public int EDITAR(String COD_PROD, String DESCRIPCION, String MARCA, String PRECIO_C,String PRECIO_V, String CANTIDAD,String PROVEEDOR){
        int mensaje=-1;
        String sql="CALL EDITAR_PRODUCTO(?,?,?,?,?,?,?,?)";
        try{
            CallableStatement call=this.Conexion.prepareCall(sql);
            call.setString(1, COD_PROD);
            call.setString(2, DESCRIPCION);
            call.setString(3, MARCA);
            call.setFloat(4, Float.parseFloat(PRECIO_C.replace(",", ".")));
            call.setFloat(5, Float.parseFloat(PRECIO_V.replace(",", ".")));
            call.setFloat(6, Float.parseFloat(CANTIDAD.replace(",", ".")));
            call.setString(7, PROVEEDOR);
            call.registerOutParameter(8, java.sql.Types.INTEGER);
            call.execute();
            mensaje=call.getInt(8);
            call.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR"+e.getMessage());
        }
        finally{
            return mensaje;
        }
    }
    public int ELIMINAR(String COD_PROD){
        int mensaje=-1;
        String sql="CALL ELIMINAR_PRODUCTO(?,?)";
        try{
            CallableStatement call=this.Conexion.prepareCall(sql);
            call.setString(1, COD_PROD);
            call.registerOutParameter(2, java.sql.Types.INTEGER);
            call.execute();
            mensaje=call.getInt(2);
            call.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR "+e.getMessage());
        }
        finally{
            return mensaje;
        }
    }
    public void Busqueda_producto(String Codigo, JTextField DESCRIPCION, JTextField PRECIO,JTextField CANTIDAD)
    {
        String sql="select DESCRIPCION,PRECIO_VENTA,CANTIDAD from producto where CANTIDAD>0 and producto.COD_PROD like '%"+Codigo+"%';";
        String sql2="select count(DESCRIPCION) from producto where CANTIDAD>0 and producto.COD_PROD like '%"+Codigo+"%';";
        try{
            Statement st=this.Conexion.createStatement();
            ResultSet resultado=st.executeQuery(sql);
            
            Statement st2=this.Conexion.createStatement();
            ResultSet resultado2=st2.executeQuery(sql2);
            
            int dato=0;
            while(resultado2.next())
            {
                dato=resultado2.getInt(1);
            }
            if(dato>0)
            {
                while(resultado.next())
                {
                    DESCRIPCION.setText(resultado.getString(1));
                    PRECIO.setText(resultado.getString(2));
                    CANTIDAD.setText(resultado.getString(3).replace(",", "."));
                }
            }
            else
            {
                DESCRIPCION.setText("");
                PRECIO.setText("");
                CANTIDAD.setText("");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "EXISTIO UN ERROR DE CONSULTA" + e);
        }
    }
}
