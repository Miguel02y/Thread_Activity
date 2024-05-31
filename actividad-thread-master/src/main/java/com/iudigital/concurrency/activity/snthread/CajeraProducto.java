/**
 * CajeraProducto.java
 */
package com.iudigital.concurrency.activity.snthread;

import com.iudigital.concurrency.activity.domain.ClienteProducto;
import com.iudigital.concurrency.activity.domain.Producto;

public class CajeraProducto {

    private String nombreCajera;

    public CajeraProducto(String nombreCajera) {
        this.nombreCajera = nombreCajera;
    }

    public void procesarComprar(ClienteProducto cliente, long timeStamp) {
        System.out.println("La cajera " + this.nombreCajera + " Comienza a procesar la compra del cliente "
            + cliente.getNombre() + " en el tiempo " + (System.currentTimeMillis() - timeStamp) / 1000
            + " seg ");
        int contCliente = 1;
        for (Producto producto : cliente.getProductos()) {
            this.esperarXSegundos();
            System.out.println("Procesando el producto " + contCliente
                    + " nombre producto " + producto.getNombre()
                    + " precio producto " + producto.getPrecio()
                    + " cantidad de productos " + producto.getCantidad()
                    + " costo total del producto " + producto.getCantidad() * producto.getPrecio()
                    + " ->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " seg ");

        }


        System.out.println("La cajera " + this.nombreCajera + " ha terminado de procesar " + cliente.getNombre()
                           + " en el tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " seg ");



    }

    private void esperarXSegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
