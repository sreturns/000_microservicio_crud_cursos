package com.sinensia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.dao.CursoDao;
import com.sinensia.model.Curso;

/**
 * Nuestra clase servicio, implementamos los metodos de la interfaz
 * 
 * @see com.sinensia.service.CursoService
 * @see com.sinensia.dao.CursoDao
 */
@Service
public class CursoServiceImpl implements CursoService {

	/**
	 * Inyectamos el dao que extiende de JpaRepository para poder acceder a los
	 * metodos CRUD
	 */
	@Autowired
	CursoDao dao;

	/**
	 * 
	 * @paran curso return List<Curso>
	 */
	@Override
	public List<Curso> save(Curso curso) {
		validate(curso);
		dao.save(curso);

		return dao.findAll();
	}

	/**
	 * 
	 * @param codCurso
	 * @retun List<Curso>
	 */
	@Override
	public List<Curso> deleteById(int codCurso) {
		Curso curso = dao.findById(codCurso)
				.orElseThrow(() -> new IllegalArgumentException("No se encontró el curso con el código: " + codCurso));
		dao.deleteById(curso.getCodCurso());

		return dao.findAll();
	}

	/**
	 * 
	 * @param codCurso
	 * @param duracion
	 */
	@Override
	public void update(int codCurso, int duracion) {
		Curso curso = dao.findById(codCurso)
				.orElseThrow(() -> new IllegalArgumentException("No se encontró el curso con el código: " + codCurso));

		validate(curso);

		curso.setDuracion(duracion);

		dao.save(curso);
	}

	/**
	 * 
	 * @return List<Curso
	 */
	@Override
	public List<Curso> getAll() {
		return dao.findAll();
	}

	/**
	 * 
	 * @param codCurso
	 * @return Curso
	 */
	@Override
	public Curso getById(int codCurso) {
		Curso curso = dao.findById(codCurso)
				.orElseThrow(() -> new IllegalArgumentException("No se encontró el curso con el código: " + codCurso));
		return curso;
	}

	private void validate(Curso curso) {
		if (curso == null) {
			throw new IllegalArgumentException("El curso no puede ser nulo");
		}

		if (curso.getDuracion() < 0) {
			throw new IllegalArgumentException("La duración del curso debe ser un número positivo");
		}
	}

	@Override
	public List<Curso> findByPrecioBetween(int minPrice, int maxPrice) {
		return dao.findByPrecioBetween(minPrice, maxPrice);
	}

}
