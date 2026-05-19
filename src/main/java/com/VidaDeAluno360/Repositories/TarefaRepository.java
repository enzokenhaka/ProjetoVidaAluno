package com.VidaDeAluno360.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VidaDeAluno360.Entities.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}
