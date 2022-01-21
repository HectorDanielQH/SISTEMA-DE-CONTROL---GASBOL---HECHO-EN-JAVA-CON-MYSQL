/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JTable;
import javax.swing.JTextField;
import model.PRODUCTO;

/**
 *
 * @author hdani
 */
public class ControllerProducto {
    PRODUCTO producto;
    public ControllerProducto()
    {
        
    }
    public void Mostrar(JTable tabla)
    {
        producto=new PRODUCTO();
        tabla.setModel(producto.Mostrar());
    }
    public void MostrarEmp(JTable tabla)
    {
        producto=new PRODUCTO();
        tabla.setModel(producto.MostrarEmp());
    }
    public int INSERTAR(String CODIGO,String DESCRIPCION,String MARCA,String PRECIO_C,String PRECIO_V,String CANTIDAD,String PROVEEDOR)
    {
        producto=new PRODUCTO();
        return producto.INSERTAR(CODIGO,DESCRIPCION,MARCA,PRECIO_C,PRECIO_V,CANTIDAD,PROVEEDOR);
    }
    public int MODIFICAR(String CODIGO,String DESCRIPCION,String MARCA,String PRECIO_C,String PRECIO_V,String CANTIDAD,String PROVEEDOR)
    {
        producto=new PRODUCTO();
        return producto.EDITAR(CODIGO,DESCRIPCION,MARCA,PRECIO_C,PRECIO_V,CANTIDAD,PROVEEDOR);
    }
    public int ELIMINAR(String CODIGO)
    {
        producto=new PRODUCTO();
        return producto.ELIMINAR(CODIGO);
    }
    public void MostrarBusqueda(JTable tabla ,String texto)
    {
        producto=new PRODUCTO();
        producto.MostrarBusq(tabla, texto);
    }
    public void MostrarBusquedaDescripcion(JTable tabla ,String texto)
    {
        producto=new PRODUCTO();
        producto.MostrarBusquedaDescripcion(tabla, texto);
    }
    public void Busqueda_producto(String Codigo, JTextField DESCRIPCION, JTextField PRECIO,JTextField CANTIDAD)
    {
        producto=new PRODUCTO();
        producto.Busqueda_producto(Codigo, DESCRIPCION, PRECIO,CANTIDAD);
    }
}
