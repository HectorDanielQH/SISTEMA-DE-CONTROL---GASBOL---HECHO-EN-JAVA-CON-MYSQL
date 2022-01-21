/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.CallableStatement;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

/**
 *
 * @author hdani
 */
public class USER  extends Conexion{
    public USER()
    {
        super();
    }
    public int Registro(String CI, String Nombre,String Apellido, String Celular, String Usuario, String Contraseña, int Tipo)
    {
        int mensaje=-1;
        String sql="CALL REGISTRO(?,?,?,?,?,?,?,?)";
        try{
            CallableStatement call=this.Conexion.prepareCall(sql);
            call.setString(1, CI);
            call.setString(2, Nombre);
            call.setString(3, Apellido);
            call.setString(4, Celular);
            call.setString(5, Usuario);
            call.setString(6, Contraseña);
            call.setInt(7, Tipo);
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
    public int EDITAR(String CI, String Nombre,String Apellido, String Celular, String Usuario, String Contraseña, int Tipo)
    {
        int mensaje=-1;
        String sql="CALL REGISTRO_EDITAR(?,?,?,?,?,?,?,?)";
        try{
            CallableStatement call=this.Conexion.prepareCall(sql);
            call.setString(1, CI);
            call.setString(2, Nombre);
            call.setString(3, Apellido);
            call.setString(4, Celular);
            call.setString(5, Usuario);
            call.setString(6, Contraseña);
            call.setInt(7, Tipo);
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
    public TableModel Mostrar()
    {
        TableModel modelo=null;
        String sql="select * from USUARIOS;";
        try{
            Statement st=this.Conexion.createStatement();
            ResultSet resultado=st.executeQuery(sql);
            DefaultTableModel modelo_tabla=new DefaultTableModel();
            modelo_tabla.addColumn("CI");
            modelo_tabla.addColumn("NOMBRE");
            modelo_tabla.addColumn("APELLIDO");
            modelo_tabla.addColumn("CELULAR");
            modelo_tabla.addColumn("TIPO_USUARIO");
            modelo_tabla.addColumn("USUARIO");
            modelo_tabla.addColumn("CONTRASEÑA");
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
    public int Eliminar(String CI)
    {
        int mensaje=-1;
        String sql="CALL ELIMINAR_REGISTRO(?,?)";
        try{
            CallableStatement call=this.Conexion.prepareCall(sql);
            call.setString(1, CI);
            call.registerOutParameter(2, java.sql.Types.INTEGER);
            call.execute();
            mensaje=call.getInt(2);
            call.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "EL USUARIO TIENE VENTAS REALIZADAS \n NO PUEDE SER ELIMINADO PORQUE SE PERDERÁ INFORMACIÓN","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        finally{
            return mensaje;
        }
    }
}
