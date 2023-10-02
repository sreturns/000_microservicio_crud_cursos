package com.sinensia.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinensia.model.Curso;
import org.springframework.data.jpa.repository.Query;

/**
 * Extendemos de la especificacion JpaRepository
 *
 * @see com.sinensia.service.CursoServiceImpl
 * @see com.sinensia.service.CursoService
 * @see com.sinensia.dao.CursoDao
 */
public interface CursoDao extends JpaRepository<Curso, Integer> {
    @Query("SELECT c FROM Curso c WHERE c.precio BETWEEN :minPrecio AND :maxPrecio")
    List<Curso> findByPrecioBetween(int minPrecio, int maxPrecio);
}
