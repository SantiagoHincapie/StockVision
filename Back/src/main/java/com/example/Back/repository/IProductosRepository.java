package com.example.Back.repository;

import com.example.Back.model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductosRepository extends JpaRepository<Productos,Long> {
}
