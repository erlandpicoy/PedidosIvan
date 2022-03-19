package com.finnegans.PedidosIvan.service.impl;
import com.finnegans.PedidosIvan.entity.Producto;
import com.finnegans.PedidosIvan.service.ProductoService;

import java.util.ArrayList;
import java.util.List;

public class ProductoServiceImpl implements ProductoService {

    @Override
    public void nuevoProducto(Producto producto) {
        List listaProducto = new ArrayList();

        listaProducto.add(producto);
        System.out.println(listaProducto);
    }

    @Override
    public void bajaProducto(int idProducto) {

    }

    @Override
    public void modificacionProducto(int idProducto, Producto producto) {

    }

    @Override
    public void enlistarProductos() {

    }
}
