/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JTextField;
import model.Cliente;


/**
 *
 * @author hdani
 */
public class ControllerCliente {
    public ControllerCliente()
    {
        
    }
    public void Busqueda_cliente(String Ci, JTextField Nombre, JTextField apellido)
    {
        Cliente cli=new Cliente();
        cli.Busqueda_cliente(Ci, Nombre, apellido);
    }
}
