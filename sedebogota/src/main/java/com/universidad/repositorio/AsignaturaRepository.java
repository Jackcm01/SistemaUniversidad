package com.universidad.repositorio;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.universidad.modelo.Asignatura;

@Repository
public interface AsignaturaRepository extends JpaRepository<Asignatura, Long>{
}
