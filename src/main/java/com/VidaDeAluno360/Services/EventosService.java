package com.VidaDeAluno360.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.VidaDeAluno360.Entities.Evento;
import com.VidaDeAluno360.Repositories.EventoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EventosService {
	
	private final EventoRepository repository;
	
	public Evento cadastrar(Evento eventos) {
		return repository.save(eventos);
	}
	public List<Evento> listar(){
		return repository.findAll();
	}
	public Evento buscarPorId(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Evento não encontrado"));
	}
	public Evento atualizar(Long id, Evento eventos) {
		
		Evento eventosExistente = buscarPorId(id);
		
		eventosExistente.setNome(eventosExistente.getNome());
		eventosExistente.setDescricao(eventosExistente.getDescricao());
		eventosExistente.setLocal(eventosExistente.getLocal());
		eventosExistente.setData(eventosExistente.getData());
		eventosExistente.setHorario(eventosExistente.getHorario());
		eventosExistente.setTipo(eventosExistente.getTipo());
		
		return repository.save(eventosExistente);
	}

}