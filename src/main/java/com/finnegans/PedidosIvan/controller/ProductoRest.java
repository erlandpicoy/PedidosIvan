package com.finnegans.PedidosIvan.controller;

import com.finnegans.PedidosIvan.entity.Producto;
import com.finnegans.PedidosIvan.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

import java.util.List;

@RestController
@RequestMapping("/productos")
@CrossOrigin()
public class ProductoRest {

    @Autowired
    ProductoRepository productoRepository;

    @PostMapping("/nuevoProducto")
    public Producto nuevoProducto(@RequestBody Producto producto){

        productoRepository.save(producto);

        return producto;
    }

    @GetMapping("/producto/{id}")
    public Producto getProductoById(@PathVariable String id){

        Producto producto = productoRepository.findById(Integer.parseInt(id)).get();

        return producto;
    }

    @CrossOrigin()
    @GetMapping("/listarProductos")
    public List<Producto> listarProductos(){

        List<Producto> listaDeProductos  = productoRepository.findAll();

        return listaDeProductos;

    }


    @PutMapping("/updateProduct/{id}")
    public Producto updateProductById(@PathVariable String id, @RequestBody Producto productoActualizado){
        Producto producto = getProductoById(id);
        producto.setNombre(productoActualizado.getNombre());
        producto.setDescripcion(productoActualizado.getDescripcion());
        producto.setImpuesto(productoActualizado.getImpuesto());
        producto.setPrecioBase(productoActualizado.getPrecioBase());

        return productoRepository.save(producto);

    }

    @DeleteMapping("/eliminar-producto/{id}")
    public String deleteById(@PathVariable String id){
        productoRepository.deleteById(Integer.parseInt(id));
        return "Se elimino con exito";
    }



}
