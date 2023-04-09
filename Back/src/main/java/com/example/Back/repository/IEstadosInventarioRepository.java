package com.example.Back.repository;

import com.example.Back.model.EstadosInventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstadosInventarioRepository extends JpaRepository<EstadosInventario,Long> {
}
