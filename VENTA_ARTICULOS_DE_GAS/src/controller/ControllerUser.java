
package controller;

import javax.swing.table.TableModel;
import model.Conexion;
import model.USER;

/**
 *
 * @author hdani
 */
public class ControllerUser {
    USER cone;
    public ControllerUser(){
        
    }
    public TableModel MOSTRAR(){
        cone=new USER();
        return cone.Mostrar();
    }
    public int INSERTAR(String CI, String Nombre,String Apellido, String Celular, String Usuario, String Contraseña, int Tipo){
        int dato=-1;
        cone=new USER();
        dato=cone.Registro(CI, Nombre, Apellido, Celular, Usuario, Contraseña, Tipo);
        return dato;
    }
    public int MODIFICAR(String CI, String Nombre,String Apellido, String Celular, String Usuario, String Contraseña, int Tipo){
        int dato=-1;
        cone=new USER();
        dato=cone.EDITAR(CI, Nombre, Apellido, Celular, Usuario, Contraseña, Tipo);
        return dato;
    }
    public int BORRAR(String CI){
        int dato=-1;
        cone=new USER();
        dato=cone.Eliminar(CI);
        return dato;
    }
}
