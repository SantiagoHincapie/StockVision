package com.example.Back.model;

import jakarta.persistence.*;

@Entity
@Table(name = "estados_del_pedido")
public class EstadosPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_estadoPedido;

    @Column(length = 30,nullable = false)
    private String estado;

    @Column(length = 300,nullable = false)
    private String Descrip;

    public long getId_estadoPedido() {
        return id_estadoPedido;
    }

    public void setId_estadoPedido(long id_estadoPedido) {
        this.id_estadoPedido = id_estadoPedido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescrip() {
        return Descrip;
    }

    public void setDescrip(String descrip) {
        Descrip = descrip;
    }
}
