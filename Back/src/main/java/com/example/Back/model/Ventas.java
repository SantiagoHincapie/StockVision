package com.example.Back.model;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "ventas")
public class Ventas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_venta;

    @Column(nullable = false)
    private long id_catalogo;


    @Column(nullable = false)
    private Date fecha;

    public long getId_venta() {
        return id_venta;
    }

    public void setId_venta(long id_venta) {
        this.id_venta = id_venta;
    }

    public long getId_catalogo() {
        return id_catalogo;
    }

    public void setId_catalogo(long id_catalogo) {
        this.id_catalogo = id_catalogo;
    }


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
