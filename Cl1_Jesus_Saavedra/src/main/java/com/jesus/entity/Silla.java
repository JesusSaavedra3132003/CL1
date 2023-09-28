package com.jesus.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="tb_silla")
public class Silla {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_silla")
	private Integer codigo;
	
	@Column(name = "des_silla")
	private String descripcion;
	
	@Column(name = "pre_silla")
	private double precio;
	
	@Column(name = "sto_silla")
	private int stock;
	
	@ManyToOne
	@JoinColumn(name="cod_marca")
	private Marca tipo;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Marca getTipo() {
		return tipo;
	}

	public void setTipo(Marca tipo) {
		this.tipo = tipo;
	}

	
	
}
