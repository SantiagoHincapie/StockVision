package com.example.Back.service;

import com.example.Back.model.Pedidos;

import java.util.List;
import java.util.Optional;

public interface IPedidoService {
    List<Pedidos> findAll();

    Optional<Pedidos> findById(Long id);

    Pedidos create(Pedidos pedidos);

    Pedidos update(Pedidos pedidos);

    void delete(Long id);
}
