package com.VidaDeAluno360.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.VidaDeAluno360.Entities.Hobbies;
import com.VidaDeAluno360.Repositories.HobbiesRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HobbiesService {
	
	private final HobbiesRepository repository;
	
	public Hobbies cadastrar(Hobbies hobbies) {
		return repository.save(hobbies);
	}
	public List<Hobbies> listar(){
		return repository.findAll();
	}
	public Hobbies buscarPorId(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Hobbie não encontrado"));
	}
	public Hobbies atualizar(Long id, Hobbies hobbies) {
		
		Hobbies hobbiesExistente = buscarPorId(id);
		
		hobbiesExistente.setNome(hobbiesExistente.getNome());
		hobbiesExistente.setCategoria(hobbiesExistente.getCategoria());
		hobbiesExistente.setPlataforma(hobbiesExistente.getPlataforma());
		hobbiesExistente.setTempoSemanal(hobbiesExistente.getTempoSemanal());
		hobbiesExistente.setNivelHabilidade(hobbiesExistente.getNivelHabilidade());
		hobbiesExistente.setStatus(hobbiesExistente.getStatus());
	}

}