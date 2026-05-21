package com.VidaDeAluno360.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VidaDeAluno360.Entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}