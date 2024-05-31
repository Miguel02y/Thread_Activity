/**
 * CajeraProductoMain.java
 */
package com.iudigital.concurrency.activity.snthread;

import com.iudigital.concurrency.activity.domain.ClienteProducto;
import com.iudigital.concurrency.activity.domain.Producto;

import java.util.ArrayList;
import java.util.List;

public class CajeraProductoMain {

    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        setProductos(productos);

       /* ClienteProducto cliente1 = new ClienteProducto("Tony Stark" , productos);
        ClienteProducto cliente2 = new ClienteProducto("Superman" , productos);
        ClienteProducto cliente3 = new ClienteProducto("Aquaman" , productos);

        long initialTime = System.currentTimeMillis();
        CajeraProducto cajeraUno = new CajeraProducto("Cajera Valentina");
        CajeraProducto cajeraDos = new CajeraProducto("Cajera Paola");
        CajeraProducto cajeraTres = new CajeraProducto("Cajera Franchesca");

        cajeraUno.procesarComprar(cliente1, initialTime);
        cajeraDos.procesarComprar(cliente2, initialTime);
        cajeraTres.procesarComprar(cliente3, initialTime);*/


            ClienteProducto cliente1 = new ClienteProducto("Tony Stark", productos);
            ClienteProducto cliente2 = new ClienteProducto("Superman" , productos);
            ClienteProducto cliente3 = new ClienteProducto("Aquaman" , productos);

            long tiempoProcesamiento = System.currentTimeMillis();
            Cajera_hilo cajera1 = new Cajera_hilo("Valentina", cliente1, tiempoProcesamiento);
            Cajera_hilo cajera2 = new Cajera_hilo("paola", cliente2, tiempoProcesamiento);
            Cajera_hilo cajera3 = new Cajera_hilo("franchesca", cliente3, tiempoProcesamiento);

            cajera1.start();
            cajera2.start();
            cajera3.start();


    }
    private static void setProductos(List<Producto> productos) {
        Producto productoUno = new Producto("Zapatos" , 500, 6);
        Producto productoDos = new Producto("Pantalones" , 800, 18);
        Producto productoTres = new Producto("Camisas" , 500, 46);

        productos.add(productoUno);
        productos.add(productoDos);
        productos.add(productoTres);

    }
}

