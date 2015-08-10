package com.flpitu88.fileSwitcher.colecciones;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ReprArchivo implements Serializable {

	private String pathIniCli;
	private String pathIni;
	private String pathFin;
	private long fUltMod;
	private long tamanio;
	private boolean transferir; // Si esta en false no se debe enviar por exceder tamanio
	
	public ReprArchivo(String path1, String path2, long fecha){
		this.setPathIni(path1);
		this.setPathFin(path2);
		this.setfUltMod(fecha);
		this.setPathIniCli("");
		this.setTransferir(true);
		this.setTamanio(0);
	}

	public String getPathIni() {
		return pathIni;
	}
	
	public String getPathFin() {
		return pathFin;
	}

	public void setPathIni(String path) {
		this.pathIni = path;
	}
	
	public void setPathFin(String path) {
		this.pathFin = path;
	}

	public long getfUltMod() {
		return fUltMod;
	}

	public void setfUltMod(long fUltMod) {
		this.fUltMod = fUltMod;
	}

	public String getPathIniCli() {
		return pathIniCli;
	}

	public void setPathIniCli(String pathIniCli) {
		this.pathIniCli = pathIniCli;
	}

	public long getTamanio() {
		return tamanio;
	}

	public void setTamanio(long tamanio) {
		this.tamanio = tamanio;
	}

	public boolean seTransmite() {
		return transferir;
	}

	public void setTransferir(boolean transferir) {
		this.transferir = transferir;
	}
	
}
