/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author hdani
 */
public class Cliente extends Conexion {
    public Cliente()
    {
        super();
    }
    public void Busqueda_cliente(String Ci, JTextField Nombre, JTextField Apellido)
    {
        String sql="select * from cliente " +
                    "where " +
                    "cliente.CI like '%"+Ci+"%';";
        String sql2="select count(cliente.CI) from cliente " +
                    "where " +
                    "cliente.CI like '%"+Ci+"%';";
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
            if(dato==0)
            {
                Nombre.setText("");
                Apellido.setText("");
            }
            else
            {
                while(resultado.next())
                {
                    Nombre.setText(resultado.getString(2));
                    Apellido.setText(resultado.getString(3));
                }
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "EXISTIO UN ERROR DE CONSULTA" + e);
        }
    }
}
