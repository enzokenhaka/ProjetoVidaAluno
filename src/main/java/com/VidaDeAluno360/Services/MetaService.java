package com.VidaDeAluno360.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.VidaDeAluno360.Entities.Meta;
import com.VidaDeAluno360.Repositories.MetaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MetaService {
	
	private final MetaRepository repository;
	
	public Meta cadastrar(Meta meta) {
		return repository.save(meta);
	}
	public List<Meta> listar(){
		return repository.findAll();
	}
	public Meta buscarPorId(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Meta não encontrada"));
	}
	public Meta atualizar(Long id, Meta metas) {
		
		Meta metaExistente = buscarPorId(id);
		
		metaExistente.setTitulo(meta.getTitulo());
		metaExistente.setDescricao(meta.getDescricao());
		metaExistente.setCategoria(meta.getCategoria());
		metaExistente.setPrazo(meta.getPrazo());
		metaExistente.setProgresso(meta.getProgresso());
		metaExistente.setStatus(meta.getStatus());
		
		return repository.save(metaExistente);
	}

}