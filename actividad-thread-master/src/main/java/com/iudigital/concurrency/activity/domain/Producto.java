/**
 * Producto.java
 */
package com.iudigital.concurrency.activity.domain;

public class Producto {
    /**
     * Atributo que determina el nombre del producto
     */
    private String nombre;

    /**
     * Atributo que determina el precio del producto
     */
    private float precio;

    /**
     * Atributo que determina la cantidad del producto comprado
     */
    private int cantidad;

    public Producto(String nombre, float precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    /**
     * Método encargado de retornar el valor del atributo nombre
     *
     * @return El nombre asociado a la clase
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método encargado de modificar el valor del atributo nombre.
     *
     * @param nombre El nuevo nombre a modificar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método encargado de retornar el valor del atributo precio
     *
     * @return El precio asociado a la clase
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Método encargado de modificar el valor del atributo precio.
     *
     * @param precio El nuevo precio a modificar
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * Método encargado de retornar el valor del atributo cantidad
     *
     * @return El cantidad asociado a la clase
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Método encargado de modificar el valor del atributo cantidad.
     *
     * @param cantidad El nuevo cantidad a modificar
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
