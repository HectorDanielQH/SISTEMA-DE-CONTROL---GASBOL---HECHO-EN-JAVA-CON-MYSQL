/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.VENTAS;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author hdani
 */
public class ControllerVentas {
    VENTAS ventas;
    public ControllerVentas()
    {
        
    }
    public void Mostrar_Mes(int MES,int Año, JTable tabla,JLabel label)
    {
        ventas=new VENTAS();
        ventas.Mostrar_mes(MES,Año,tabla,label);
    }
    public void Mostrar_fecha(int Dia , int Mes, int Año , JTable tabla,JLabel label)
    {
        ventas=new VENTAS();
        ventas.Mostrar_Fecha(Dia,Mes,Año,tabla,label);
    }
    public void Mostrar_fecha_rango(int Dia , int Mes, int Año,int Dia2 , int Mes2, int Año2 , JTable tabla,JLabel label)
    {
        ventas=new VENTAS();
        ventas.Mostrar_Fecha_Rango(Dia,Mes,Año,Dia2,Mes2,Año2,tabla,label);
    }
    public void Mostrar_Ventas_Emp(JTable tabla)
    {
        ventas=new VENTAS();
        ventas.Mostrar_Ventas_Emp(tabla);
    }
    public void Mostrar_Ventas_Emp_Ci(JTable tabla,String CI)
    {
        ventas=new VENTAS();
        ventas.Mostrar_Ventas_Emp_Ci(tabla,CI);
    }
    public void Vender_Producto(JTable tabla, String CI,String User,String Password,String cliente,String Nombre, String Apellido)
    {
        ventas=new VENTAS();
        ventas.Insertar_Venta(tabla, CI,User,Password,cliente,Nombre,Apellido);
    }
    public void Eliminar_Producto(String COD_PROD,String CANTIDAD,String CI, String FECHA_VENTA, String NUM_VENTA)
    {
        ventas=new VENTAS();
        ventas.Eliminar_Venta(COD_PROD, CANTIDAD, CI, FECHA_VENTA, NUM_VENTA);
    }
    public void Editar_Producto(String COD_PROD,String CANTIDAD,String CI, String FECHA_VENTA, String NUM_VENTA)
    {
        ventas=new VENTAS();
        ventas.Editar_Venta(COD_PROD, CANTIDAD, CI, FECHA_VENTA, NUM_VENTA);
    }
    public void ImprimirPDF(int F)
    {
        ventas=new VENTAS();
        ventas.CrearPDF(F);
    }
}
