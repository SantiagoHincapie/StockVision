package com.example.Back.repository;

import com.example.Back.model.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPedidosRepository extends JpaRepository<Pedidos,Long> {
}
