package com.sinensia.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Mapeamos la clase Curso con la tabla cursos
 * 
 * @see com.sinensia.service.CursoServiceImpl
 * @see com.sinensia.service.CursoService
 * @see com.sinensia.dao.CursoDao
 */
@Entity
@Table(name = "cursos")
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codCurso;
	private String nombre;
	private int duracion;
	private int precio;

	public Curso() {
	}

	/**
	 * 
	 * @param codCurso
	 * @param nombre
	 * @param duracion
	 * @param precio
	 */
	public Curso(String nombre, int duracion, int precio) {
		this.nombre = nombre;
		this.duracion = duracion;
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codCurso, duracion, nombre, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return codCurso == other.codCurso && duracion == other.duracion && Objects.equals(nombre, other.nombre)
				&& precio == other.precio;
	}

	public int getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
