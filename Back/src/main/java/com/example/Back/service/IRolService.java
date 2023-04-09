package com.example.Back.service;

import com.example.Back.model.Roles;

import java.util.List;
import java.util.Optional;

public interface IRolService {
    List<Roles> findAll();

    Optional<Roles> findById(Long id);

    Roles create(Roles rol);

    Roles update(Roles rol);

    void delete(Long id);
}
