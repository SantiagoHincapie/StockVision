package com.example.Back.model;

import jakarta.persistence.*;

@Entity
@Table(name = "catalogo")
public class Catalogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_catalogo;

    @Column(nullable = false)
    private long id_inventario;

    @Column(nullable = false)
    private int precio;


}
