package com.sinensia.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.sinensia.model.Curso;

/**
 * 
 * @see com.sinensia.service.CursoServiceImpl
 * @see com.sinensia.dao.CursoDao
 */
public interface CursoService {

	List<Curso> save(Curso curso);

	List<Curso> deleteById(int codCurso);

	void update(int codCurso, int duracion);

	List<Curso> getAll();

	Curso getById(int codCurso);

	List<Curso> findByPrecioBetween(int minPrecio, int maxPrecio);

}
