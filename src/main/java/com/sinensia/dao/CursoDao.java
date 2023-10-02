package com.sinensia.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinensia.model.Curso;

/**
 * Extendemos de la especificacion JpaRepository
 * 
 * @see com.sinensia.service.CursoServiceImpl
 * @see com.sinensia.service.CursoService
 * @see com.sinensia.dao.CursoDao
 */
public interface CursoDao extends JpaRepository<Curso, Integer> {
	List<Curso> findByPrecioBetween(int minPrice, int maxPrice);
}
