package com.iudigital.concurrency.activity.snthread;

import com.iudigital.concurrency.activity.domain.ClienteProducto;
import com.iudigital.concurrency.activity.domain.Producto;

public class Cajera_hilo extends Thread {

    private String nombre;

    private ClienteProducto cliente;

    private long tiempoProcesamiento;

    public Cajera_hilo(){

    }

    public Cajera_hilo(String nombre, ClienteProducto cliente, long tiempoProcesamiento){
        this.nombre = nombre;
        this.cliente = cliente;
        this.tiempoProcesamiento = tiempoProcesamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ClienteProducto getCliente() {
        return cliente;
    }

    public void setCliente(ClienteProducto cliente) {
        this.cliente = cliente;
    }

    public long getTiempoProcesamiento() {
        return tiempoProcesamiento;
    }

    public void setTiempoProcesamiento(long tiempoProcesamiento) {
        this.tiempoProcesamiento = tiempoProcesamiento;
    }

    @Override
    public void run() {
        System.out.println("La cajera " + this.nombre + " Comienza a procesar la compra del cliente "
                + cliente.getNombre() + " en el tiempo " + (System.currentTimeMillis() - tiempoProcesamiento) / 1000
                + " seg ");
        System.out.println("=============================================");
        int contCliente = 1;
        for (Producto producto : cliente.getProductos()) {
            this.esperarXSegundos();
            System.out.println("Procesando el producto" + contCliente
                    + " = " + producto.getNombre()
                    + " que tiene un precio de  = " + "$"+ producto.getPrecio()
                    + " El cual se van a llevar = " + producto.getCantidad() + " productos,"
                    + " para un costo total del producto adquirido de = " + "$" + producto.getCantidad() * producto.getPrecio()
                    + " ->Tiempo: " + (System.currentTimeMillis() - tiempoProcesamiento) / 1000 + " seg ");
           // System.out.println(" ================================================ ");
            contCliente++;

        }
       // System.out.println("=========================================================================================");
        System.out.println("La cajera " + this.nombre + " ha terminado de procesar " + cliente.getNombre()
                + " en el tiempo: " + (System.currentTimeMillis() - tiempoProcesamiento) / 1000 + " seg ");

    }

   /* public void procesarComprar(ClienteProducto cliente, long timeStamp){
        this.cliente = cliente;
        this.tiempoProcesamiento = timeStamp;
        this.start();
    }*/

    private void esperarXSegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}


