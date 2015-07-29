package com.flpitu88.fileSwitcher.mensajes;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MensajeNuevoUsuario implements Serializable {

	// Atributos
	private String usuario;
//	private String clave;
	private boolean resul;
	private String mensaje;
	// Fin atributos
	
	// --------------------------------------
	
//	public MensajeNuevoUsuario(String usuario, String clave){
	public MensajeNuevoUsuario(String usuario){
		this.setUsuario(usuario);
//		this.setClave(clave);
		this.setResul(false);
		this.setMensaje("");
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

//	public String getClave() {
//		return clave;
//	}
//
//	public void setClave(String clave) {
//		this.clave = clave;
//	}

	public boolean getResul() {
		return resul;
	}

	public void setResul(boolean resul) {
		this.resul = resul;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
