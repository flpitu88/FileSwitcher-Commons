package com.flpitu88.fileSwitcher.colecciones;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ListaPaths implements Serializable {
	
	// Atributos
	private NodoPath cabecera;
	private int tamanio;
	// Fin atributos

	// ----------------------------------------------
	
	// Metodos
	public ListaPaths(){
		tamanio = 0;
		cabecera = new NodoPath();
	 }
	 
	public int getTamanio(){
		return tamanio;
	}
	 
	public boolean addPath(ReprArchivo archivo){
		NodoPath NodoPathUltimo = getUltimoNodoPath();
		if(archivo != null && NodoPathUltimo != null){	
			NodoPathUltimo.setNodoPath(new NodoPath(archivo));
			tamanio ++;	
			return true;
		}else{	
			return false;
		}
	}
	
	private NodoPath getUltimoNodoPath(){
		NodoPath NodoPathUltimo = null;
		if(cabecera != null){
			NodoPathUltimo = cabecera;
			while(NodoPathUltimo.getNodoPath() != null){
				NodoPathUltimo = NodoPathUltimo.getNodoPath();
			}
		}
		return NodoPathUltimo;
	} 
	 
	public ReprArchivo getPath(int pos){
		NodoPath NodoPathUltimo = null;
		int contador = 0;
		ReprArchivo dato = null;
		if(cabecera != null){
			NodoPathUltimo = cabecera;
			do{
				NodoPathUltimo = NodoPathUltimo.getNodoPath();
				if(contador == pos){
					dato = NodoPathUltimo.getElemento();
					break;
				}else{
					contador++;
				}   
			}while(NodoPathUltimo.getNodoPath() != null);
		}
		return dato;
	}
	
	public NodoPath getNodo(int pos){
		NodoPath NodoPathUltimo = null;
		NodoPath buscado = null;
		int contador = 0;
		if(cabecera != null){
			NodoPathUltimo = cabecera;
			do{
				NodoPathUltimo = NodoPathUltimo.getNodoPath();
				if(contador == pos){
					buscado = NodoPathUltimo;
					break;
				}else{
					contador++;
				}   
			}while(NodoPathUltimo.getNodoPath() != null);
		}
		return buscado;
	}
	
	
	public long getTamanioTotal(){
		long total = 0;
		for (int i=0;i<this.getTamanio();i++){
			ReprArchivo nodo = getPath(i);
			total = total + nodo.getTamanio();
		}
		return total;
	}
	
	public void limitarTamanio(int maxSize){
		long total = 0;
		for (int i=0;i<this.getTamanio();i++){
			ReprArchivo nodo = getPath(i);
			total = total + nodo.getTamanio();
			if (total > maxSize){
				nodo.setTransferir(false);
			}
		}
	}
	
	public int getCantSinTransferir(){
		int total = 0;
		for (int i=0;i<this.getTamanio();i++){
			ReprArchivo nodo = getPath(i);
			if (!nodo.seTransmite()){
				total++;
			}
		}
		return total;
	}
	
	public long getTamTotalSinTransferir(){
		long total = 0;
		for (int i=0;i<this.getTamanio();i++){
			ReprArchivo nodo = getPath(i);
			if (!nodo.seTransmite()){
				total = total + nodo.getTamanio();
			}
		}
		return total;
	}
	
	public ListaPaths clonarSinLimitadas(){
		ListaPaths listaNueva = new ListaPaths();
		for (int i=0;i<this.getTamanio();i++){
			ReprArchivo nodo = getPath(i);
			if (nodo.seTransmite() == true){
				listaNueva.addPath(nodo);
			}
		}
		return listaNueva;
	}
	
	// Fin metodos
}
