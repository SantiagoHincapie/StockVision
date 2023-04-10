package com.example.Back.service;

import com.example.Back.model.Catalogo;

import java.util.List;
import java.util.Optional;

public interface ICatalogoService {
    List<Catalogo> findAll();

    Optional<Catalogo> findById(Long id);

    Catalogo create (Catalogo  catalogo);

    Catalogo update (Catalogo catalogo);

    void delete (Long id);
}
