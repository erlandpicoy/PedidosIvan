package com.finnegans.PedidosIvan;

import com.finnegans.PedidosIvan.entity.Producto;
import com.finnegans.PedidosIvan.service.ProductoService;
import com.finnegans.PedidosIvan.service.impl.ProductoServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PedidosIvanApplication {

	public static void main(String[] args) {
		SpringApplication.run(PedidosIvanApplication.class, args);

		Producto coca1 = new Producto();
		coca1.setNombre("Manaos");

		ProductoServiceImpl productoService = new ProductoServiceImpl();

		productoService.nuevoProducto(coca1);


	}

}
