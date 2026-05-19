package com.VidaDeAluno360.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VidaDeAluno360.Entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}