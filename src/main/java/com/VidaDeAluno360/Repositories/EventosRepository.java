package com.VidaDeAluno360.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VidaDeAluno360.Entities.Eventos;

public interface EventosRepository extends JpaRepository<Eventos, Long> {

}