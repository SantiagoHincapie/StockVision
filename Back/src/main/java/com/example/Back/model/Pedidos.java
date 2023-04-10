package com.example.Back.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pedidos")
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Pedido;

    @Column
    private Long id_EstadoPedido;

    @Column
    private Long id_Producto;

    @Column(nullable = false)
    private int cantidad;

    public Long getId_Pedido() {
        return id_Pedido;
    }

    public void setId_Pedido(Long id_Pedido) {
        this.id_Pedido = id_Pedido;
    }

    public Long getId_EstadoPedido() {
        return id_EstadoPedido;
    }

    public void setId_EstadoPedido(Long id_EstadoPedido) {
        this.id_EstadoPedido = id_EstadoPedido;
    }

    public Long getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(Long id_Producto) {
        this.id_Producto = id_Producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
