/**
 * 
 */
package com.developer.projetjs.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.developer.projetjs.dto.UsuarioDTO;

/**
 * @author Junior Mendez
 * clase que se encarga de mantener la información del usuario que ingresa al aplicativo
 * en sesion.
 */
@ManagedBean
@SessionScoped
public class SessionController {
	
	/**
	 * Usuario que se mantendra en sesion
	 */
	
	private UsuarioDTO usuarioDTO;
	
	@PostConstruct
	private void init() {
		System.out.println("Cargando información del usuario en la sesión ...");

	}

	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}

}
