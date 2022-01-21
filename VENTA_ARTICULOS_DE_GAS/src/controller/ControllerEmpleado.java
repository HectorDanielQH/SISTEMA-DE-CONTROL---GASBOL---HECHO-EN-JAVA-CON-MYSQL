/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JTable;
import javax.swing.table.TableModel;
import model.EMPLEADO;
import model.USER;

/**
 *
 * @author hdani
 */
public class ControllerEmpleado {
    EMPLEADO cone;
    
    public void MOSTRAR(JTable tabla){
        cone=new EMPLEADO();
        tabla.setModel(cone.Mostrar());
    }
}
