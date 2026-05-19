package com.VidaDeAluno360.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.VidaDeAluno360.Entities.Metas;
import com.VidaDeAluno360.Repositories.MetasRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MetasService {
	
	private final MetasRepository repository;
	
	public Metas cadastrar(Metas metas) {
		return repository.save(metas);
	}
	public List<Metas> listar(){
		return repository.findAll();
	}
	public Metas buscarPorId(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Meta não encontrada"));
	}
	public Metas atualizar(Long id, Metas metas) {
		
		Metas metasExistente = buscarPorId(id);
		
		metasExistente.setTitulo(metas.getTitulo());
		metasExistente.setDescricao(metas.getDescricao());
		metasExistente.setCategoria(metas.getCategoria());
		metasExistente.setPrazo(metas.getPrazo());
		metasExistente.setProgresso(metas.getProgresso());
		metasExistente.setStatus(metas.getStatus());
	}

}