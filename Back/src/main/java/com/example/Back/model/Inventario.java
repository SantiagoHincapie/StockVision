package com.example.Back.model;

import jakarta.persistence.*;

@Entity
@Table(name = "inventario")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_inventario;

    @Column(nullable = false)
    private long id_pedido;

    @Column(nullable = false)
    private long id_estadoInventario;

    public long getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(long id_inventario) {
        this.id_inventario = id_inventario;
    }

    public long getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(long id_pedido) {
        this.id_pedido = id_pedido;
    }

    public long getId_estadoInventario() {
        return id_estadoInventario;
    }

    public void setId_estadoInventario(long id_estadoInventario) {
        this.id_estadoInventario = id_estadoInventario;
    }
}
