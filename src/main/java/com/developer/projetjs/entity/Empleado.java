/**
 * 
 */
package com.developer.projetjs.entity;

/**
 * @author Junior Mendez
 * Clase que representa entidades de Empleado
 */
public class Empleado {
	
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	public Empleado(String nombre, String primerApellido, String segundoApellido, String puesto, boolean estatus) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.puesto = puesto;
		this.estatus = estatus;
	}
	public Empleado() {
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public boolean isEstatus() {
		return estatus;
	}
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	private String puesto;
	private boolean estatus;
}
