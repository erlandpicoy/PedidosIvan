package com.finnegans.PedidosIvan.service;
import com.finnegans.PedidosIvan.entity.Cliente;

public interface ClienteService {

    public void nuevoCliente(Cliente cliente);

    public void bajaCliente(int idCliente);

    public void modificacionCliente(int idCliente, Cliente cliente);

    public void enlistarCliente();

}
