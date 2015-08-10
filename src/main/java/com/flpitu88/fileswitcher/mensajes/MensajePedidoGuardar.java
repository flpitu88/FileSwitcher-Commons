package com.flpitu88.fileswitcher.mensajes;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MensajePedidoGuardar extends Mensaje implements Serializable {

    private String usuario;

    public MensajePedidoGuardar(String usuario) {
        this.setUsuario(usuario);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
