package model;


import Plantilla.Plantilla;
import java.sql.CallableStatement;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Conexion;

/**
 *
 * @author hdani
 */
public class VENTAS extends Conexion{
    public VENTAS(){
        super();
    }
    public void CrearPDF(int Parametro)
    {
        Plantilla plantilla = new Plantilla(Parametro);
        plantilla.crearPlantilla();
    }
    public void Eliminar_Venta(String COD_PROD,String CANTIDAD,String CI, String FECHA_VENTA, String NUM_VENTA)
    {
        String sql="CALL ELIMINAR_VENTA(?,?,?,?,?)";
        try{
            CallableStatement call=this.Conexion.prepareCall(sql);
            call.setString(1, COD_PROD);
            call.setFloat(2, Float.parseFloat(CANTIDAD.replace(",", ".")));
            call.setString(3, CI);
            call.setString(4, FECHA_VENTA);
            call.setInt(5, Integer.parseInt(NUM_VENTA));
            call.execute();
            call.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR "+e.getMessage());
        }
    }
    
    public void Editar_Venta(String COD_PROD,String CANTIDAD,String CI, String FECHA_VENTA, String NUM_VENTA)
    {
        String sql="CALL EDITAR_VENTA(?,?,?,?,?)";
        try{
            CallableStatement call=this.Conexion.prepareCall(sql);
            call.setString(1, COD_PROD);
            call.setFloat(2, Float.parseFloat(CANTIDAD.replace(",", ".")));
            call.setString(3, CI);
            call.setString(4, FECHA_VENTA);
            call.setInt(5, Integer.parseInt(NUM_VENTA));
            call.execute();
            call.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR "+e.getMessage());
        }
    }
    
    public int Insertar_Venta(JTable tabla, String CI,String User, String Password,String Cliente,String Nombre, String Apellido)
    {
        int dato=0,mensaje=-1;
        String sql="select max(venta.NUM_VENTA) from venta;";
        try{
            Statement st=this.Conexion.createStatement();
            ResultSet resultado=st.executeQuery(sql);
            while(resultado.next()){
                dato=resultado.getInt(1);
            }
            dato+=1;   
            DefaultTableModel modelo=(DefaultTableModel) tabla.getModel();
            for(int i=0;i<modelo.getRowCount();i++)
            {
                sql="CALL CREAR_VENTA(?,?,?,?,?,?,?,?,?,?)";
                try{
                    CallableStatement call=this.Conexion.prepareCall(sql);
                    call.setString(1, modelo.getValueAt(i, 0).toString().replace(",", "."));
                    call.setString(2, User);
                    call.setString(3, Password);
                    call.setString(4, Cliente);
                    call.setString(5, Nombre);
                    call.setString(6, Apellido);
                    call.setFloat(7, Float.parseFloat(modelo.getValueAt(i, 3).toString().replace(",", ".")));
                    call.setInt(8, dato);
                    call.setDouble(9, Double.parseDouble(modelo.getValueAt(i, 4).toString().replace(",", ".")));
                    call.registerOutParameter(10, java.sql.Types.INTEGER);
                    call.execute();
                    mensaje=call.getInt(10);
                    call.close();
                    
                    
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR "+e.getMessage());
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "EXISTIO UN ERROR DE CONSULTA" + e);
        }
        return mensaje;
    }
    
    
    
    public void Mostrar_Fecha_Rango(int Dia , int Mes, int Año,int Dia2 , int Mes2, int Año2 , JTable tabla,JLabel label)
    {
        TableModel modelo=null;
        String sql="select producto.COD_PROD,producto.DESCRIPCION,producto.MARCA,producto.PRECIO_VENTA,venta.CANTIDAD,venta.DESCUENTO,((producto.PRECIO_VENTA*venta.CANTIDAD)-venta.DESCUENTO) as TOTAL," +
                   "concat(empleado.NOMBRE,' ',empleado.APELLIDO) as empleado, concat(cliente.NOMBRE,' ',cliente.APELLIDO) as cliente,venta.FECHA_VENTA " +
                   "from venta,producto,empleado,cliente " +
                   "where " +
                   "venta.COD_PROD=producto.COD_PROD and " +
                   "venta.COD_EMP=empleado.CI and " +
                   "venta.COD_CLI=cliente.CI and " +
                   "day(venta.FECHA_VENTA) between "+Dia+" and "+ Dia2 + " and "+
                   " month(venta.FECHA_VENTA) between "+Mes+" and "+ Mes2 + " and "+
                   "year(venta.FECHA_VENTA) between "+Año+" and "+ Año2 + ";";
        String sql2="select sum((producto.PRECIO_VENTA*venta.CANTIDAD)-venta.DESCUENTO) as TOTAL " +
                    "from venta,producto,empleado,cliente " +
                    "where " +
                    "venta.COD_PROD=producto.COD_PROD and " +
                    "venta.COD_EMP=empleado.CI and " +
                    "venta.COD_CLI=cliente.CI and " +
                    "day(venta.FECHA_VENTA) between "+Dia+" and "+ Dia2 + " and "+
                   " month(venta.FECHA_VENTA) between "+Mes+" and "+ Mes2 + " and "+
                   "year(venta.FECHA_VENTA) between "+Año+" and "+ Año2 + ";";
        try{
            Statement st=this.Conexion.createStatement();
            ResultSet resultado=st.executeQuery(sql);
            DefaultTableModel modelo_tabla=new DefaultTableModel();
            modelo_tabla.addColumn("COD. PRODUCTO");
            modelo_tabla.addColumn("DESCIRPCION");
            modelo_tabla.addColumn("MARCA");
            modelo_tabla.addColumn("PRECIO");
            modelo_tabla.addColumn("CANTIDAD");
            modelo_tabla.addColumn("DESCUENTO");
            modelo_tabla.addColumn("TOTAL");
            modelo_tabla.addColumn("EMPLEADO");
            modelo_tabla.addColumn("CLIENTE");
            modelo_tabla.addColumn("FECHA VENTA");
            while(resultado.next()){
                modelo_tabla.addRow(new Object[]{resultado.getString(1),resultado.getString(2),resultado.getString(3),resultado.getString(4),resultado.getString(5),resultado.getString(6),resultado.getString(7),resultado.getString(8),resultado.getString(9),resultado.getString(10)});
            }
            modelo=modelo_tabla;
            tabla.setModel(modelo);
            
            Statement st2=this.Conexion.createStatement();
            ResultSet resultado2=st2.executeQuery(sql2);
            while(resultado2.next()){
                label.setText("GANANCIA DE ESTE RANGO DE FECHA ES: "+resultado2.getString(1) + "Bs.");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "EXISTIO UN ERROR DE CONSULTA" + e);
        }
    }
    
    
    public void Mostrar_Fecha(int Dia , int Mes, int Año , JTable tabla,JLabel label)
    {
        TableModel modelo=null;
        String sql="select producto.COD_PROD,producto.DESCRIPCION,producto.MARCA,producto.PRECIO_VENTA,venta.CANTIDAD,venta.DESCUENTO,((producto.PRECIO_VENTA*venta.CANTIDAD)-venta.DESCUENTO) as TOTAL," +
                   "concat(empleado.NOMBRE,' ',empleado.APELLIDO) as empleado, concat(cliente.NOMBRE,' ',cliente.APELLIDO) as cliente,venta.FECHA_VENTA " +
                   "from venta,producto,empleado,cliente " +
                   "where " +
                   "venta.COD_PROD=producto.COD_PROD and " +
                   "venta.COD_EMP=empleado.CI and " +
                   "venta.COD_CLI=cliente.CI and " +
                   "day(venta.FECHA_VENTA)="+Dia+" and "+
                   "month(venta.FECHA_VENTA)="+Mes+" and "+
                   "year(venta.FECHA_VENTA)="+Año+";";
        String sql2="select sum((producto.PRECIO_VENTA*venta.CANTIDAD)-venta.DESCUENTO) as TOTAL " +
                    "from venta,producto,empleado,cliente " +
                    "where " +
                    "venta.COD_PROD=producto.COD_PROD and " +
                    "venta.COD_EMP=empleado.CI and " +
                    "venta.COD_CLI=cliente.CI and " +
                    "day(venta.FECHA_VENTA)="+Dia+" and "+
                    "month(venta.FECHA_VENTA)="+Mes+" and "+
                    "year(venta.FECHA_VENTA)="+Año+";";
        try{
            Statement st=this.Conexion.createStatement();
            ResultSet resultado=st.executeQuery(sql);
            DefaultTableModel modelo_tabla=new DefaultTableModel();
            modelo_tabla.addColumn("COD. PRODUCTO");
            modelo_tabla.addColumn("DESCIRPCION");
            modelo_tabla.addColumn("MARCA");
            modelo_tabla.addColumn("PRECIO");
            modelo_tabla.addColumn("CANTIDAD");
            modelo_tabla.addColumn("DESCUENTO");
            modelo_tabla.addColumn("TOTAL");
            modelo_tabla.addColumn("EMPLEADO");
            modelo_tabla.addColumn("CLIENTE");
            modelo_tabla.addColumn("FECHA VENTA");
            while(resultado.next()){
                modelo_tabla.addRow(new Object[]{resultado.getString(1),resultado.getString(2),resultado.getString(3),resultado.getString(4),resultado.getString(5),resultado.getString(6),resultado.getString(7),resultado.getString(8),resultado.getString(9),resultado.getString(10)});
            }
            modelo=modelo_tabla;
            tabla.setModel(modelo);
            
            Statement st2=this.Conexion.createStatement();
            ResultSet resultado2=st2.executeQuery(sql2);
            while(resultado2.next()){
                label.setText("GANANCIA DE ESTE DIA ES: "+resultado2.getString(1) + "Bs.");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "EXISTIO UN ERROR DE CONSULTA" + e);
        }
    }
    public void Mostrar_mes(int MES,int año, JTable tabla,JLabel label)
    {
        TableModel modelo=null;
        String sql="select producto.COD_PROD,producto.DESCRIPCION,producto.MARCA,producto.PRECIO_VENTA,venta.CANTIDAD,venta.DESCUENTO,((producto.PRECIO_VENTA*venta.CANTIDAD)-venta.DESCUENTO) as TOTAL, " +
                   "concat(empleado.NOMBRE,' ',empleado.APELLIDO) as empleado, concat(cliente.NOMBRE,' ',cliente.APELLIDO) as cliente,venta.FECHA_VENTA " +
                   "from venta,producto,empleado,cliente " +
                   "where " +
                   "venta.COD_PROD=producto.COD_PROD and " +
                   "venta.COD_EMP=empleado.CI and " +
                   "venta.COD_CLI=cliente.CI and " +
                   "month(venta.FECHA_VENTA)="+MES+" and "+
                   "year(venta.FECHA_VENTA)="+año+";";
        String sql2="select sum((producto.PRECIO_VENTA*venta.CANTIDAD)-venta.DESCUENTO) as TOTAL " +
                    "from venta,producto,empleado,cliente " +
                    "where " +
                    "venta.COD_PROD=producto.COD_PROD and " +
                    "venta.COD_EMP=empleado.CI and " +
                    "venta.COD_CLI=cliente.CI and " +
                    "month(venta.FECHA_VENTA)="+MES+" and "+
                   "year(venta.FECHA_VENTA)="+año+";";
        try{
            Statement st=this.Conexion.createStatement();
            ResultSet resultado=st.executeQuery(sql);
            DefaultTableModel modelo_tabla=new DefaultTableModel();
            modelo_tabla.addColumn("COD. PRODUCTO");
            modelo_tabla.addColumn("DESCIRPCION");
            modelo_tabla.addColumn("MARCA");
            modelo_tabla.addColumn("PRECIO");
            modelo_tabla.addColumn("CANTIDAD");
            modelo_tabla.addColumn("DESCUENTO");
            modelo_tabla.addColumn("TOTAL");
            modelo_tabla.addColumn("EMPLEADO");
            modelo_tabla.addColumn("CLIENTE");
            modelo_tabla.addColumn("FECHA VENTA");
            while(resultado.next()){
                modelo_tabla.addRow(new Object[]{resultado.getString(1),resultado.getString(2),resultado.getString(3),resultado.getString(4),resultado.getString(5),resultado.getString(6),resultado.getString(7),resultado.getString(8),resultado.getString(9),resultado.getString(10)});
            }
            modelo=modelo_tabla;
            tabla.setModel(modelo);
            
            Statement st2=this.Conexion.createStatement();
            ResultSet resultado2=st2.executeQuery(sql2);
            while(resultado2.next()){
                label.setText("GANANCIA DE MES ES: "+resultado2.getString(1) + "Bs.");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "EXISTIO UN ERROR DE CONSULTA" + e);
        }
    }
    public void Mostrar_Ventas_Emp(JTable tabla)
    {
        TableModel modelo=null;
        String sql="select producto.COD_PROD,producto.DESCRIPCION,producto.PRECIO_VENTA,venta.CANTIDAD,venta.DESCUENTO,((producto.PRECIO_VENTA*venta.CANTIDAD)-venta.DESCUENTO) as TOTAL, cliente.CI, " +
                   "concat(cliente.NOMBRE,' ',cliente.APELLIDO) as cliente,venta.FECHA_VENTA,venta.num_venta " +
                   "from venta,producto,empleado,cliente " +
                   "where " +
                   "venta.COD_PROD=producto.COD_PROD and " +
                   "venta.COD_EMP=empleado.CI and " +
                   "venta.COD_CLI=cliente.CI " +
                   "order by venta.num_venta desc;";
        try{
            Statement st=this.Conexion.createStatement();
            ResultSet resultado=st.executeQuery(sql);
            DefaultTableModel modelo_tabla=new DefaultTableModel();
            modelo_tabla.addColumn("COD. PRODUCTO");
            modelo_tabla.addColumn("DESCIRPCION");
            modelo_tabla.addColumn("PRECIO");
            modelo_tabla.addColumn("CANTIDAD");
            modelo_tabla.addColumn("DESCUENTO");
            modelo_tabla.addColumn("TOTAL");
            modelo_tabla.addColumn("CI");
            modelo_tabla.addColumn("CLIENTE");
            modelo_tabla.addColumn("FECHA VENTA");
            modelo_tabla.addColumn("NUM. VENTA");
            while(resultado.next()){
                modelo_tabla.addRow(new Object[]{resultado.getString(1),resultado.getString(2),resultado.getString(3),resultado.getString(4),resultado.getString(5),resultado.getString(6),resultado.getString(7),resultado.getString(8),resultado.getString(9),resultado.getString(10)});
            }
            modelo=modelo_tabla;
            tabla.setModel(modelo);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "EXISTIO UN ERROR DE CONSULTA" + e);
        }
    }
    public void Mostrar_Ventas_Emp_Ci(JTable tabla,String CI)
    {
        TableModel modelo=null;
        String sql="select producto.COD_PROD,producto.DESCRIPCION,producto.PRECIO_VENTA,venta.CANTIDAD, venta.DESCUENTO ,((producto.PRECIO_VENTA*venta.CANTIDAD)-venta.DESCUENTO) as TOTAL, cliente.CI, " +
"concat(cliente.NOMBRE,' ',cliente.APELLIDO) as cliente,venta.FECHA_VENTA,venta.num_venta " +
"from venta,producto,empleado,cliente " +
"where " +
"venta.COD_PROD=producto.COD_PROD and " +
"venta.COD_EMP=empleado.CI and " +
"venta.COD_CLI=cliente.CI and " +
"cliente.CI like '%"+CI+"%'  " +
"order by venta.num_venta desc;";
        try{
            Statement st=this.Conexion.createStatement();
            ResultSet resultado=st.executeQuery(sql);
            DefaultTableModel modelo_tabla=new DefaultTableModel();
            modelo_tabla.addColumn("COD. PRODUCTO");
            modelo_tabla.addColumn("DESCIRPCION");
            modelo_tabla.addColumn("PRECIO");
            modelo_tabla.addColumn("CANTIDAD");
            modelo_tabla.addColumn("DESCUENTO");
            modelo_tabla.addColumn("TOTAL");
            modelo_tabla.addColumn("CI");
            modelo_tabla.addColumn("CLIENTE");
            modelo_tabla.addColumn("FECHA VENTA");
            modelo_tabla.addColumn("NUM. VENTA");
            while(resultado.next()){
                modelo_tabla.addRow(new Object[]{resultado.getString(1),resultado.getString(2),resultado.getString(3),resultado.getString(4),resultado.getString(5),resultado.getString(6),resultado.getString(7),resultado.getString(8),resultado.getString(9),resultado.getString(10)});
            }
            modelo=modelo_tabla;
            tabla.setModel(modelo);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "EXISTIO UN ERROR DE CONSULTA" + e);
        }
    }
}
