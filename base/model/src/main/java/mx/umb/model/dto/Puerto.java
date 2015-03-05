package mx.umb.model.dto;

import java.io.Serializable;

public class Puerto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private int puerto;
	private String nombre;
	private int noSms;
	private boolean activo;

	public Puerto() {
	}

	public Puerto(int puerto, int noSms, boolean activo) {
		this.puerto = puerto;
		this.noSms = noSms;
		this.activo = activo;
	}

	public Puerto(int puerto, String nombre, int noSms, boolean activo) {
		this.puerto = puerto;
		this.nombre = nombre;
		this.noSms = noSms;
		this.activo = activo;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getPuerto() {
		return this.puerto;
	}

	public void setPuerto(int puerto) {
		this.puerto = puerto;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNoSms() {
		return this.noSms;
	}

	public void setNoSms(int noSms) {
		this.noSms = noSms;
	}

	public boolean isActivo() {
		return this.activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

}