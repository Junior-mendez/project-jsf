/**
 * 
 */
package com.developer.projetjs.controller;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author Junior Mendez
 * Clase que se encarga de cerrar la cesión dell usuario.
 */

@ManagedBean
public class SessionClosedController {
	
	@PostConstruct
	public void init() {
		System.out.println("Cerrar Sesión ...");
	}
	
	/**
	 * Metodo que permite cerrar la sesion del usuario y regresar a la pantalla del login.
	 */
	public void cerrarSession() {
		
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.invalidateSession();
		try {
			this.redireccionar("login.xhtml");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * Metodo que permite cerrar la sesion del usuario y regresar a la pantalla del login.
	 */
	
	private void redireccionar (String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
}
