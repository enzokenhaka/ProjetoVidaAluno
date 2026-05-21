package com.VidaDeAluno360.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.VidaDeAluno360.Entities.Tarefas;
import com.VidaDeAluno360.Repositories.TarefasRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TarefasService {
	
	private final TarefasRepository repository;
	
	public Tarefas cadastrar(Tarefas tarefa) {
		return repository.save(tarefa);
	}
	public List<Tarefas> listar(){
		return repository.findAll();
	}
	public Tarefas buscarPorId(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Hobbie não encontrado"));
	}
	public Tarefas atualizar(Long id, Tarefas tarefa) {
		
		Tarefas tarefaExistente = buscarPorId(id);
		
		tarefaExistente.setTitulo(tarefaExistente.getTitulo());
		tarefaExistente.setDescricao(tarefaExistente.getDescricao());
		tarefaExistente.setMateria(tarefaExistente.getMateria());
		tarefaExistente.setDataEntrega(tarefaExistente.getDataEntrega());
		tarefaExistente.setPrioridade(tarefaExistente.getPrioridade());
		tarefaExistente.setStatus(tarefaExistente.getStatus());
		
		return repository.save(tarefaExistente);
	}

}