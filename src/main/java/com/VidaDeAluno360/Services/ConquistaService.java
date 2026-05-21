package com.VidaDeAluno360.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.VidaDeAluno360.Entities.Conquista;
import com.VidaDeAluno360.Repositories.ConquistaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ConquistaService {
	
	private final ConquistaRepository repository;
	
	public Conquista cadastrar(Conquista conquista) {
		return repository.save(conquista);
	}
	public List<Conquista> listar(){
		return repository.findAll();
	}
	public Conquista buscarPorId(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Conquista não encontrada"));
	}
	public Conquista atualizar(Long id, Conquista conquistas) {
		
		Conquista conquistaExistente = buscarPorId(id);
		
		conquistaExistente.setTitulo(conquistaExistente.getTitulo());
		conquistaExistente.setDescricao(conquistaExistente.getDescricao());
		conquistaExistente.setDataConquista(conquistaExistente.getDataConquista());
		conquistaExistente.setCategoria(conquistaExistente.getCategoria());
		conquistaExistente.setPontuacao(conquistaExistente.getPontuacao());
		conquistaExistente.setNivel(conquistaExistente.getNivel());
		
		return repository.save(conquistaExistente);
	}

}