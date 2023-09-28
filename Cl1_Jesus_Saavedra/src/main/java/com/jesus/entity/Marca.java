package com.jesus.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_marca")
public class Marca {
	@Id
	@Column(name = "cod_marca")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	
	@Column(name = "nom_marca")
	private String nombre;
	
	@JsonIgnore
	@OneToMany(mappedBy = "tipo")
	private List<Silla> listaMarcaSilla;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Silla> getListaMarcaSilla() {
		return listaMarcaSilla;
	}

	public void setListaMarcaSilla(List<Silla> listaMarcaSilla) {
		this.listaMarcaSilla = listaMarcaSilla;
	}

	
}
