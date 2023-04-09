package com.example.Back.model;

import jakarta.persistence.*;

@Entity
@Table(name = "estados_inventario")
public class EstadosInventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_EstadoInventario;

    @Column(length = 30,nullable = false)
    private String estado;

    @Column(length = 300,nullable = false)
    private String descrip;

    public long getId_EstadoInventario() {
        return id_EstadoInventario;
    }

    public void setId_EstadoInventario(long id_EstadoInventario) {
        this.id_EstadoInventario = id_EstadoInventario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
}
