package com.flpitu88.fileswitcher.mensajes;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MensajePedidoRecuperar extends Mensaje implements Serializable {

    // Atributos
    private String nombreUsuario;
	// Fin atributos

	// ----------------------------------------------------
    public MensajePedidoRecuperar(String user) {
        this.setNombreUsuario(user);
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

	// Metodos
    // Fin metodos
}
