/**
 * 
 */
package com.developer.projetjs.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.developer.projetjs.entity.Empleado;
import com.developer.projetjs.services.EmpleadoService;

/**
 * @author Junior Mendez
 * Clase controller que se encarga de procesar información para la pantalla principal
 */
@ManagedBean
@ViewScoped
public class PrincipalController {
	/**
	 * Lista de Empleados para la tabla.
	 */
	private List<Empleado> empleados;
	/**
	 * Lista de Empleados Filtrados para la tabla.
	 */
	private List<Empleado> empleadosFiltrados;
	
	public List<Empleado> getEmpleadosFiltrados() {
		return empleadosFiltrados;
	}

	public void setEmpleadosFiltrados(List<Empleado> empleadosFiltrados) {
		this.empleadosFiltrados = empleadosFiltrados;
	}

	/**
	 * Servicio con los metodos qeu realiza la logica de empleado.
	 */
	private EmpleadoService empleadoService = new EmpleadoService();
	
	/**
	 * Metodo que se encarga de inicializar la pantalla principal.
	 */
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}
	
	/**
	 * Metodo que consulta la lista de empleado.
	 */
	public void consultarEmpleados() {
		this.empleados = this.empleadoService.consultarEmpleados();
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

}
