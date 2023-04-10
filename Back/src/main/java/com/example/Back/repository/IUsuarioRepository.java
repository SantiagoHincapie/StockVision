package com.example.Back.repository;

import com.example.Back.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuarios,Long> {



}
