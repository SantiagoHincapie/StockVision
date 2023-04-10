package com.example.Back.service;

import com.example.Back.model.Productos;

import java.util.List;
import java.util.Optional;

public interface IProductosService {
    List<Productos> findAll();

    Optional<Productos> findById(Long id);

    Productos create(Productos productos);

    Productos update(Productos productos);

    void delete(Long id);
}
