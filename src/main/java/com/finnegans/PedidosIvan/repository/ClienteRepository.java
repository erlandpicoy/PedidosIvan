package com.finnegans.PedidosIvan.repository;

import com.finnegans.PedidosIvan.entity.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}