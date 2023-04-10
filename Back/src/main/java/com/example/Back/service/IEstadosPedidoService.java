package com.example.Back.service;

import com.example.Back.model.EstadosPedido;

import java.util.List;
import java.util.Optional;

public interface IEstadosPedidoService {

    List<EstadosPedido> findAll();

    Optional<EstadosPedido> findById(Long id);

    EstadosPedido create(EstadosPedido estadosPedido);

    EstadosPedido update(EstadosPedido estadosPedido);

    void delete(Long id);
}
