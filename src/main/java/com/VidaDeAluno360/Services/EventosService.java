package com.VidaDeAluno360.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.VidaDeAluno360.Entities.Eventos;
import com.VidaDeAluno360.Repositories.EventosRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EventosService {
	
	private final EventosRepository repository;
	
	public Eventos cadastrar(Eventos eventos) {
		return repository.save(eventos);
	}
	public List<Eventos> listar(){
		return repository.findAll();
	}
	public Eventos buscarPorId(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Evento não encontrado"));
	}
	public Eventos atualizar(Long id, Eventos eventos) {
		
		Eventos eventosExistente = buscarPorId(id);
		
		eventosExistente.setNome(eventosExistente.getNome());
		eventosExistente.setDescricao(eventosExistente.getDescricao());
		eventosExistente.setLocal(eventosExistente.getLocal());
		eventosExistente.setData(eventosExistente.getData());
		eventosExistente.setHorario(eventosExistente.getHorario());
		eventosExistente.setTipo(eventosExistente.getTipo());
	}

}