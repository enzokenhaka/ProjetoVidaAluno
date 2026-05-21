package com.VidaDeAluno360.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VidaDeAluno360.Entities.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {

}