package com.sinensia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.model.Curso;
import com.sinensia.service.CursoService;

/**
 * Controlador @RestController para realizar peticiones a traves de los metodos
 * Http, devolvemos y consumimos recurso en formato JSON
 * 
 * @author Sergio
 * @since version 1.0
 * @see com.sinensia.service.CursoServiceImpl
 * @see com.sinensia.service.CursoService
 * @see com.sinensia.dao.CursoDao
 */
@RestController
public class CursoController {

	/**
	 * Inyectamos la interfaz de nuestro servicio, la conexion entre capas siempre
	 * debera realizarse mediante una interfaz
	 */
	@Autowired
	private CursoService service;

	/**
	 * 
	 * @return List<Curso>
	 */
	@GetMapping(value = "curso", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> getAll() {
		return service.getAll();
	}

	/**
	 * 
	 * @param codCurso
	 * @return List<Curso>
	 */
	@GetMapping(value = "curso/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Curso getById(@PathVariable("codCurso") int codCurso) {
		return service.getById(codCurso);
	}

	/**
	 * 
	 * @param curso
	 * @return List<Curso>
	 */
	@PostMapping(value = "curso", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> save(@RequestBody Curso curso) {
		return service.save(curso);
	}

	/**
	 * 
	 * @param codCurso
	 * @param duracion
	 */
	@PutMapping("curso/{codCurso}")
	public void update(@PathVariable("codCurso") int codCurso, @RequestParam("duration") int duracion) {
		service.update(codCurso, duracion);
	}

	/**
	 * 
	 * @param codCurso
	 * @return List<Curso>
	 */
	@DeleteMapping(value = "curso/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> deleteById(@PathVariable("codCurso") int codCurso) {
		return service.deleteById(codCurso);
	}

	@GetMapping(value = "curso/{min}/{max}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> findByPriceBetween(@PathVariable("min") int minPrecio, @PathVariable("max") int maxPrecio) {
		return service.findByPrecioBetween(minPrecio, maxPrecio);
	}

}
