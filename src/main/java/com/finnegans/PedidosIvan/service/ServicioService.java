package com.finnegans.PedidosIvan.service;
import com.finnegans.PedidosIvan.entity.Servicio;

public interface ServicioService {

    public void nuevoServicio(Servicio servicio);

    public void bajaServicio(int idServicio);

    public void modificacionServicio(int idServicio, Servicio servicio);

    public void enlistarServicios();

}
