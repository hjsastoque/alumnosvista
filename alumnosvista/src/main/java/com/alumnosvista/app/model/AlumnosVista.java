<<<<<<< Updated upstream:alumnosvista/src/main/java/com/alumnosvista/app/model/AlumnosVista.java
package com.alumnosvista.app.model;

import java.io.Serializable;



import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="alumnosvista")
public class AlumnosVista implements Serializable{
	
	private static final long serialVersionUID = 2369821992858708427L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@JsonProperty("nombres")
	@Column(nullable=false)
	private String nombres;
	@JsonProperty("direccion")
	private String direccion;
	@JsonProperty("email")
	private String email;
	@JsonProperty("celular")
	private String celular;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	

}
=======
package com.alumnosvista.app.model;

import java.io.Serializable;



import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="alumnosvista")
public class AlumnosVista implements Serializable{
	
	private static final long serialVersionUID = 2369821992858708427L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@JsonProperty("nombres")
	@Column(nullable=false)
	private String nombres;
	@JsonProperty("direccion")
	private String direccion;
	@JsonProperty("email")
	private String email;
	@JsonProperty("celular")
	private String celular;
	@JsonProperty("estado")
	private String estado;
	
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	

}
>>>>>>> Stashed changes:src/main/java/com/alumnosvista/app/model/AlumnosVista.java
