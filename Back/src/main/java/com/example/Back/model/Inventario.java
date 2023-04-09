package com.example.Back.model;

import jakarta.persistence.*;

@Entity
@Table(name = "inventario")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_inventario;

    @Column(nullable = false)
    private Long id_pedido;

    @Column(nullable = false)
    private Long id_estadoInventario;

    public Long getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(long id_inventario) {
        this.id_inventario = id_inventario;
    }

    public Long getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(long id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Long getId_estadoInventario() {
        return id_estadoInventario;
    }

    public void setId_estadoInventario(long id_estadoInventario) {
        this.id_estadoInventario = id_estadoInventario;
    }
}
