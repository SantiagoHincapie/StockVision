package com.example.Back.service;

import com.example.Back.model.Usuarios;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {

    List<Usuarios> findAll();

    Optional<Usuarios> findById(Long id);

    Usuarios create (Usuarios usuario);

    Usuarios update (Usuarios usuario);

    void delete(Long id);

}
