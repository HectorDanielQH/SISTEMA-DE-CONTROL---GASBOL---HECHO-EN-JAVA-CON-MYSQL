/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hdani
 */
public class EMPLEADO extends Conexion{
    public EMPLEADO(){
        super();
    }
    public TableModel Mostrar()
    {
        TableModel modelo=null;
        String sql="select * from empleados;";
        try{
            Statement st=this.Conexion.createStatement();
            ResultSet resultado=st.executeQuery(sql);
            DefaultTableModel modelo_tabla=new DefaultTableModel();
            modelo_tabla.addColumn("CI");
            modelo_tabla.addColumn("NOMBRE");
            modelo_tabla.addColumn("APELLIDO");
            modelo_tabla.addColumn("CELULAR");
            while(resultado.next()){
                modelo_tabla.addRow(new Object[]{resultado.getString(1),resultado.getString(2),resultado.getString(3),resultado.getString(4)});
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
}
