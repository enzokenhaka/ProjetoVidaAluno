package com.VidaDeAluno360.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.VidaDeAluno360.Entities.Aluno;
import com.VidaDeAluno360.Repositories.AlunoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AlunoService {
	
	private final AlunoRepository repository;
	
	public Aluno cadastrar(Aluno aluno) {
		return repository.save(aluno);
	}
	public List<Aluno> listar(){
		return repository.findAll();
	}
	public Aluno buscarPorId(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Conquista não encontrada"));
	}
	public Aluno atualizar(Long id, Aluno aluno) {
		
		Aluno alunoExistente = buscarPorId(id);
		
		alunoExistente.setNome(alunoExistente.getNome());
		alunoExistente.setIdade(alunoExistente.getIdade());
		alunoExistente.setEmail(alunoExistente.getEmail());
		alunoExistente.setTelefone(alunoExistente.getTelefone());
		alunoExistente.setTurma(alunoExistente.getTurma());
		alunoExistente.setStatus(alunoExistente.getStatus());
	}

}