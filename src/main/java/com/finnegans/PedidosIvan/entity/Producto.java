package com.finnegans.PedidosIvan.entity;

public class Producto {

    private Integer idProducto;
    private Float precioBase;
    private Float impuesto;
    private String nombre;
    private String descripcion;
    private Integer cantidad;

    public Producto() {
    }


    public Producto(Integer idProducto, Float precioBase, Float impuesto, String nombre, String descripcion, Integer cantidad) {
        this.idProducto = idProducto;
        this.precioBase = precioBase;
        this.impuesto = impuesto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Float precioBase) {
        this.precioBase = precioBase;
    }

    public Float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(Float impuesto) {
        this.impuesto = impuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}