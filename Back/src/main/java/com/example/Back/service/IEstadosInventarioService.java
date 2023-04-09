package com.example.Back.service;

import com.example.Back.model.EstadosInventario;

import java.util.List;
import java.util.Optional;

public interface IEstadosInventarioService {

    List<EstadosInventario> findAll();

    Optional<EstadosInventario> findById(Long id);

    EstadosInventario create(EstadosInventario estadosInventario);

    EstadosInventario update(EstadosInventario estadosInventario);

    void delete(Long id);
}
