package com.VidaDeAluno360.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VidaDeAluno360.Entities.Tarefas;

public interface TarefasRepository extends JpaRepository<Tarefas, Long> {

}
