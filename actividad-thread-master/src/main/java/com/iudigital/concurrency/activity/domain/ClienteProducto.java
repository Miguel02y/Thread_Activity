/**
 * ProductoCliente.java
 */
package com.iudigital.concurrency.activity.domain;

import java.util.List;

public class ClienteProducto {

    /**
     * Atributo que determina el nombre del cliente
     */
    private final String nombre;

    /**
     * Atributo que determina los productos del cliente
     */
    private final List<Producto> productos;

    public ClienteProducto(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
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
     * Método encargado de retornar el valor del atributo productos
     *
     * @return El productos asociado a la clase
     */
    public List<Producto> getProductos() {
        return productos;
    }
}
