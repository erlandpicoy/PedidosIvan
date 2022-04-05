package com.finnegans.PedidosIvan.controller;

import java.util.List;

import com.finnegans.PedidosIvan.entity.Cliente;
import com.finnegans.PedidosIvan.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/clientes")
@CrossOrigin()
public class ClienteRest {

    @Autowired
    ClienteRepository clienteRepository;

    @CrossOrigin()
    @PostMapping("/nuevoCliente")
    public Cliente nuevoCliente(@RequestBody Cliente cliente){

        clienteRepository.save(cliente);
        return cliente;
    }

    @CrossOrigin()
    @GetMapping("/cliente/{id}")
    public Cliente getClienteById(@PathVariable String id){

        Cliente cliente = clienteRepository.findById(Integer.parseInt(id)).get();

        return cliente;
    }

    @CrossOrigin()
    @GetMapping("/listarClientes")
    public List<Cliente> listarClientes(){

        List<Cliente> listarClientes  = clienteRepository.findAll();

        return listarClientes;

    }

    @CrossOrigin()
    @PutMapping("/actualizarCliente/{id}")
    public Cliente updateClientById(@PathVariable String id, @RequestBody Cliente clienteActualizado){
        Cliente cliente = getClienteById(id);
        cliente.setNombre(clienteActualizado.getNombre());
        cliente.setApellido(clienteActualizado.getApellido());
        cliente.setDni(clienteActualizado.getDni());

        return clienteRepository.save(cliente);

    }

    @CrossOrigin()
    @DeleteMapping("/eliminarCliente/{id}")
    public String deleteById(@PathVariable String id){
        clienteRepository.deleteById(Integer.parseInt(id));
        return "Cliente eliminado correctamente";
    }


}
