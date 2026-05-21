package com.VidaDeAluno360.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.VidaDeAluno360.Entities.Hobbie;
import com.VidaDeAluno360.Repositories.HobbieRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HobbieService {
	
	private final HobbieRepository repository;
	
	public Hobbie cadastrar(Hobbie hobbie) {
		return repository.save(hobbie);
	}
	public List<Hobbie> listar(){
		return repository.findAll();
	}
	public Hobbie buscarPorId(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Hobbie não encontrado"));
	}
	public Hobbie atualizar(Long id, Hobbie hobbies) {
		
		Hobbie hobbieExistente = buscarPorId(id);
		
		hobbieExistente.setNome(hobbieExistente.getNome());
		hobbieExistente.setCategoria(hobbieExistente.getCategoria());
		hobbieExistente.setPlataforma(hobbieExistente.getPlataforma());
		hobbieExistente.setTempoSemanal(hobbieExistente.getTempoSemanal());
		hobbieExistente.setNivelHabilidade(hobbieExistente.getNivelHabilidade());
		hobbieExistente.setStatus(hobbieExistente.getStatus());
		
		return repository.save(hobbieExistente);
	}

}