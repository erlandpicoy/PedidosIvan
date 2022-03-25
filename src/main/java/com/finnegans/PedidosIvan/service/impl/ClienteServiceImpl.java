package com.finnegans.PedidosIvan.service.impl;
import com.finnegans.PedidosIvan.entity.Cliente;
import com.finnegans.PedidosIvan.service.ClienteService;

import java.util.ArrayList;
import java.util.List;

public class ClienteServiceImpl implements ClienteService {

    @Override
    public void nuevoCliente(Cliente cliente) {
        List listaCliente = new ArrayList();

        listaCliente.add(cliente);
        System.out.println(listaCliente);
    }

    @Override
    public void bajaCliente(int idCliente) {

    }

    @Override
    public void modificacionCliente(int idCliente, Cliente cliente) {

    }

    @Override
    public void enlistarCliente() {

    }

}
