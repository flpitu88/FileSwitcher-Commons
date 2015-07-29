package com.flpitu88.fileSwitcher.utilitarios;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.util.logging.SimpleFormatter;

public class Logueo {

	private Logger logger;
	private FileHandler fh;
	private String name;
	
	public Logueo(String path, String name){
		try {
			this.setLogger(Logger.getLogger(name));
			this.setFh(new FileHandler(path, true));
			this.getLogger().addHandler(fh);
			this.getLogger().setLevel(Level.ALL);
//			SimpleFormatter formatter = new SimpleFormatter();
			MyFormatter formatter = new MyFormatter();
			this.getFh().setFormatter(formatter);
		} catch (SecurityException e) {
			e.printStackTrace();
			System.err.println("Fallo la inicializacion del log: " + name);
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Fallo la inicializacion del log: " + name);
		}
	}
	
	public Logger getLogger() {
		return logger;
	}
	public void setLogger(Logger logger) {
		this.logger = logger;
	}
	public FileHandler getFh() {
		return fh;
	}
	public void setFh(FileHandler fh) {
		this.fh = fh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void logArchivo(String mje){
		this.getLogger().fine(mje);
	}

	public void logConsola(String mje){
		System.out.println(mje);
	}
	
	public void logAmbos(String mje){
		this.logArchivo(mje);
		this.logConsola(mje);
	}
	
	public void logAmbosAtCli(Socket sock, String mje){
		this.logArchivo(sock.getInetAddress() + " : " + mje);
		this.logConsola(mje);
	}
	
	public void logArchivoAtCli(Socket sock, String mje){
		this.getLogger().fine(sock.getInetAddress() + " : " + mje);
	}

}
