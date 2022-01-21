/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hdani
 */

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.CallableStatement;

public class Conexion {
    public Connection Conexion;
    private String user="root";
    private String password="0000";
    private String driver="com.mysql.cj.jdbc.Driver";
    private String Direccion="jdbc:mysql://127.0.0.1:3306/venta_articulos_gas?serverTimezone=UTC";
    public Conexion(){
        try{
            Class.forName(driver);
            Conexion=(Connection)DriverManager.getConnection(Direccion,user,password);
            if(Conexion!=null){
                //JOptionPane.showMessageDialog(null,"CONEXION EXITOSA");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR DE CONEXION" + e);
        }
    }
    public Connection getCon()
    {
        return Conexion;
    }
    public int LOGEO(String user, String pass){
        String sql="call LOGEO(?,?,?)";
        int mensaje=0;
        try{
            CallableStatement call=Conexion.prepareCall(sql);
            call.setString(1, user);
            call.setString(2, pass);
            call.registerOutParameter(3, java.sql.Types.INTEGER);
            call.execute();
            mensaje=call.getInt(3);
            call.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "NO EXISTE EL USUARIO");
        }
        finally{
            return mensaje;
        }
    }
}
