package com.flpitu88.fileswitcher.mensajes;

import java.io.Serializable;

import com.flpitu88.fileswitcher.colecciones.ListaPaths;

@SuppressWarnings("serial")
public class MensajeArchivosRecuperar extends Mensaje implements Serializable {

    // Atributos

    private ListaPaths listado;
    private int size_limit;
	// Fin atributos

	// ----------------------------------------------------------
    public MensajeArchivosRecuperar(ListaPaths lista, int max) {
        this.setListado(lista);
        this.setMaximoTamanio(max);
    }

    public ListaPaths getListado() {
        return listado;
    }

    public void setListado(ListaPaths listado) {
        this.listado = listado;
    }

    public int getMaxTamanio() {
        return size_limit;
    }

    public void setMaximoTamanio(int totalTam) {
        this.size_limit = totalTam;
    }

	// Metodos
    // Fin metodos
}
