package models.entity;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name="Roles")
public class Roles implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_rol;

	@Column(length = 35,nullable = false)
	private String nombre;
	@Column(length = 100,nullable = false)
	private String descripcion;

	public Long getId_rol() {
		return id_rol;
	}

	public void setId_rol(Long id_rol) {
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
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
