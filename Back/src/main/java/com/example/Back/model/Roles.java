package com.example.Back.model;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_rol;

    @Column(name = "nombre",nullable = false,length = 30)
    private String nombre;
    @Column(name = "descripcion",nullable = false,length = 300)
    private String descripcion;

    public long getId_rol() {
        return id_rol;
    }

    public void setId_rol(long id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
