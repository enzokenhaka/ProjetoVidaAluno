package com.VidaDeAluno360.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.VidaDeAluno360.Entities.Cursos;
import com.VidaDeAluno360.Repositories.CursosRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CursosService {
	
	private final CursosRepository repository;
	
	public Cursos cadastrar(Cursos cursos) {
		return repository.save(cursos);
	}
	public List<Cursos> listar(){
		return repository.findAll();
	}
	public Cursos buscarPorId(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Curso não encontrado"));
	}
	public Cursos atualizar(Long id, Cursos cursos) {
		
		Cursos cursosExistente = buscarPorId(id);
		
		cursosExistente.setNome(cursosExistente.getNome());
		cursosExistente.setInstituicao(cursosExistente.getInstituicao());
		cursosExistente.setCargaHoraria(cursosExistente.getCargaHoraria());
		cursosExistente.setArea(cursosExistente.getArea());
		cursosExistente.setNivel(cursosExistente.getNivel());
		cursosExistente.setStatus(cursosExistente.getStatus());
	}

}