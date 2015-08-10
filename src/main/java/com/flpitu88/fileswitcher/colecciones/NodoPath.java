package com.flpitu88.fileswitcher.colecciones;

import java.io.Serializable;

@SuppressWarnings("serial")
public class NodoPath implements Serializable {

	// Atributos
		private ReprArchivo dato;
		private NodoPath nodo;
	// Fin atributos
		
	//-------------------------------------------------
		
		// Metodos
		
		
		public NodoPath(){
			this.dato = null;
			this.nodo = null;
		}
			
		public NodoPath(ReprArchivo dato){
			this();
			this.dato = dato;  	
		}
		
		public void setDato(ReprArchivo dato){
			this.dato = dato;
		}
	 
		public ReprArchivo getElemento(){
			return this.dato;
		}
	 
		public void setNodoPath(NodoPath NodoPath){
			this.nodo = NodoPath;
		}
	 
		public NodoPath getNodoPath(){
			return this.nodo;
		} 
		
		// Fin metodos
	
}
