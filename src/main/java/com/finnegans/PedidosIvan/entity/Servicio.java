package com.finnegans.PedidosIvan.entity;

public class Servicio {
    private Integer idServicio;
    private String nombre;
    private Integer costoMensual;

    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(Integer costoMensual) {
        this.costoMensual = costoMensual;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "idServicoi=" + idServicio +
                ", nombre='" + nombre + '\'' +
                ", costoMensual=" + costoMensual +
                '}';
    }

    public Servicio() {
        this.idServicio = idServicio;
        this.nombre = nombre;
        this.costoMensual = costoMensual;
    }
}
