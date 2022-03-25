package com.finnegans.PedidosIvan.service.impl;
import com.finnegans.PedidosIvan.entity.Servicio;
import com.finnegans.PedidosIvan.service.ServicioService;

import java.util.ArrayList;
import java.util.List;

public class ServicioServiceImpl implements ServicioService {

    @Override
    public void nuevoServicio(Servicio servicio) {

        List listaServicio = new ArrayList();
        listaServicio.add(servicio);
        System.out.println(listaServicio);
    }

    @Override
    public void bajaServicio(int idServicio) {

    }

    @Override
    public void modificacionServicio(int idServicio, Servicio servicio) {

    }

    @Override
    public void enlistarServicios() {

    }


}
