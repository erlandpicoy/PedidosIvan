package com.finnegans.PedidosIvan;

import com.finnegans.PedidosIvan.entity.Producto;
import com.finnegans.PedidosIvan.entity.Cliente;
import com.finnegans.PedidosIvan.entity.Servicio;


import com.finnegans.PedidosIvan.service.impl.ProductoServiceImpl;
import com.finnegans.PedidosIvan.service.impl.ClienteServiceImpl;
import com.finnegans.PedidosIvan.service.impl.ServicioServiceImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PedidosIvanApplication {

	public static void main(String[] args) {
		SpringApplication.run(PedidosIvanApplication.class, args);

//		Producto coca1 = new Producto();
//		coca1.setNombre("Manaos");
//
//		Cliente cliente1= new Cliente();
//		cliente1.setNombre("Ivan");
//		cliente1.setApellido("Picoy");
//		cliente1.setDni(94007486);
//
//		Servicio servicio1= new Servicio();
//		servicio1.setIdServicio(1);
//		servicio1.setNombre("Telecentro");
//		servicio1.setCostoMensual(2500);
//
//
//		ProductoServiceImpl productoService = new ProductoServiceImpl();
//		ClienteServiceImpl clienteService = new ClienteServiceImpl();
//		ServicioServiceImpl servicioService = new ServicioServiceImpl();
//
//		productoService.nuevoProducto(coca1);
//		clienteService.nuevoCliente(cliente1);
//		servicioService.nuevoServicio(servicio1);

	}

}
