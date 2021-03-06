package com.flpitu88.fileSwitcher.mensajes;

import java.io.Serializable;

import com.flpitu88.fileSwitcher.colecciones.ListaPaths;

@SuppressWarnings("serial")
public class MensajeArchivosGuardar implements Serializable {
	// Atributos
	private ListaPaths listado; 
	private int sizeMax;
	// Fin atributos

	// ----------------------------------------------------------
	
	public MensajeArchivosGuardar(ListaPaths lista){
		this.setListado(lista);
	}
	
	public ListaPaths getListado() {
		return listado;
	}

	public void setListado(ListaPaths listado) {
		this.listado = listado;
	}

	public int getSizeMax() {
		return sizeMax;
	}

	public void setSizeMax(int sizeMax) {
		this.sizeMax = sizeMax;
	}
	
	// Metodos
	// Fin metodos
}
