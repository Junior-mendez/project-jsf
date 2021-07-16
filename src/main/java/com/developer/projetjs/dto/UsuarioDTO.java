/**
 * 
 */
package com.developer.projetjs.dto;

/**
 * @author Junior Mendez
 * Clase que permitira contener la informacion del usuario en sesion.
 */
public class UsuarioDTO {

	private String usuario;
	private String password;
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public UsuarioDTO() {
		super();
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
