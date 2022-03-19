package com.finnegans.PedidosIvan.service;
import com.finnegans.PedidosIvan.entity.Producto;

public interface ProductoService {

    public void nuevoProducto(Producto producto);

    public void bajaProducto(int idProducto);

    public void modificacionProducto(int idProducto, Producto producto);

    public void enlistarProductos();

}
