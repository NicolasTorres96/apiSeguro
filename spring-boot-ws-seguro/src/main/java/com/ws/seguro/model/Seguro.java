package com.ws.seguro.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SEGURO")
public class Seguro implements Serializable {

	@Id
	@Column(name = "IDSEGURO")
	private long idseguro;

	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "VALOR")
	private int valor;
	
	@Column(name = "ESTADOVIGENCIA")
	private int estadovigencia;
	
	@Column(name = "TIPOSEGURO")
	private String tiposeguro;

	public long getIdseguro() {
		return idseguro;
	}

	public void setIdseguro(long idseguro) {
		this.idseguro = idseguro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getEstadovigencia() {
		return estadovigencia;
	}

	public void setEstadovigencia(int estadovigencia) {
		this.estadovigencia = estadovigencia;
	}
	public String getTiposeguro() {
		return tiposeguro;
	}

	public void setTiposeguro(String tiposeguro) {
		this.tiposeguro = tiposeguro;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
