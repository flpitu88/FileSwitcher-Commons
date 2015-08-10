package com.flpitu88.fileSwitcher.mensajes;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MensajePedidoGuardar implements Serializable {
	
	private String usuario;
	
	public MensajePedidoGuardar(String usuario){
		this.setUsuario(usuario);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}
