package com.flpitu88.fileSwitcher.utilitarios;

import java.io.File;


public class Archivo {

	private File archFile;
	
	public Archivo(String path){
		this.archFile = new File(path);
	}
	
	
	public long getTamanio(){
		return this.archFile.length();
	}
	
	public String getDirPadre(){
		return this.archFile.getParent();
	}
	
	public String[] listarArchivosDelDir(){
		return this.archFile.list();
	}
	
	public File getDirectorioContenedor(){
		return this.archFile.getParentFile();
	}
	
	public long ultimaModif(){
		return this.archFile.lastModified();
	}
	
	public String getNombreArchivo(){
		return this.archFile.getName();
	}
	
	public String getPathCompleto(){
		return this.archFile.getPath();
	}
	
	public boolean esCarpeta(){
		return this.archFile.isDirectory();
	}
	
	public boolean esArchivo(){
		return this.archFile.isFile();
	}
	
	public void crearCarpeta(){
		this.archFile.mkdir();
	}
	
	public void borrarArchivo(){
		this.archFile.delete();
	}
	
	public void modificarNombreTemporal(){
		String path = this.getPathCompleto();
		String nuevoPath = path + "_temp";
		Archivo nuevoArch = new Archivo(nuevoPath);
		this.archFile.renameTo(nuevoArch.archFile);
		nuevoArch.borrarArchivo();
	}
	
	public boolean existe(){
		return this.archFile.exists();
	}
	
	public void crearDirectorios(){
		this.archFile.mkdirs();
	}
	
}
