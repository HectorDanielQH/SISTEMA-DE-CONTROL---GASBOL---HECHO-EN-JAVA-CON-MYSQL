/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Conexion;

/**
 *
 * @author hdani
 */
public class Controlador {
    Conexion cone;
    public Controlador(){
        
    }
    public int InicioDeSesion(String user, String pass){
        int dato=0;
        cone=new Conexion();
        dato=cone.LOGEO(user,pass);
        return dato;
    }
}
