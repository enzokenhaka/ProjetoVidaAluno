package com.VidaDeAluno360.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.VidaDeAluno360.Entities.Conquistas;
import com.VidaDeAluno360.Repositories.ConquistasRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ConquistasService {
	
	private final ConquistasRepository repository;
	
	public Conquistas cadastrar(Conquistas conquistas) {
		return repository.save(conquistas);
	}
	public List<Conquistas> listar(){
		return repository.findAll();
	}
	public Conquistas buscarPorId(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Conquista não encontrada"));
	}
	public Conquistas atualizar(Long id, Conquistas conquistas) {
		
		Conquistas conquistasExistente = buscarPorId(id);
		
		conquistasExistente.setTitulo(conquistasExistente.getTitulo());
		conquistasExistente.setDescricao(conquistasExistente.getDescricao());
		conquistasExistente.setDataConquista(conquistasExistente.getDataConquista());
		conquistasExistente.setCategoria(conquistasExistente.getCategoria());
		conquistasExistente.setPontuacao(conquistasExistente.getPontuacao());
		conquistasExistente.setNivel(conquistasExistente.getNivel());
	}

}