package com.VidaDeAluno360.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.VidaDeAluno360.Entities.Tarefa;
import com.VidaDeAluno360.Repositories.TarefaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TarefaService {
	
	private final TarefaRepository repository;
	
	public Tarefa cadastrar(Tarefa tarefa) {
		return repository.save(tarefa);
	}
	public List<Tarefa> listar(){
		return repository.findAll();
	}
	public Tarefa buscarPorId(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Hobbie não encontrado"));
	}
	public Tarefa atualizar(Long id, Tarefa tarefa) {
		
		Tarefa tarefaExistente = buscarPorId(id);
		
		tarefaExistente.setTitulo(tarefaExistente.getTitulo());
		tarefaExistente.setDescricao(tarefaExistente.getDescricao());
		tarefaExistente.setMateria(tarefaExistente.getMateria());
		tarefaExistente.setDataEntrega(tarefaExistente.getDataEntrega());
		tarefaExistente.setPrioridade(tarefaExistente.getPrioridade());
		tarefaExistente.setStatus(tarefaExistente.getStatus());
	}

}