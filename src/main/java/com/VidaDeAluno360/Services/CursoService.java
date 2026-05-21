package com.VidaDeAluno360.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.VidaDeAluno360.Entities.Curso;
import com.VidaDeAluno360.Repositories.CursoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CursoService {
	
	private final CursoRepository repository;
	
	public Curso cadastrar(Curso curso) {
		return repository.save(curso);
	}
	public List<Curso> listar(){
		return repository.findAll();
	}
	public Curso buscarPorId(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Curso não encontrado"));
	}
	public Curso atualizar(Long id, Curso cursos) {
		
		Curso cursoExistente = buscarPorId(id);
		
		cursoExistente.setNome(cursoExistente.getNome());
		cursoExistente.setInstituicao(cursoExistente.getInstituicao());
		cursoExistente.setCargaHoraria(cursoExistente.getCargaHoraria());
		cursoExistente.setArea(cursoExistente.getArea());
		cursoExistente.setNivel(cursoExistente.getNivel());
		cursoExistente.setStatus(cursoExistente.getStatus());
		
		return repository.save(cursoExistente);
	}

}