package com.VidaDeAluno360.Controllers;

import java.security.Provider.Service;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.VidaDeAluno360.Entities.Aluno;
import com.VidaDeAluno360.Services.AlunoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/alunos")
@RequiredArgsConstructor
@CrossOrigin("*")
public class AlunoController {
	
	private final AlunoService service;
	
	@PostMapping
	public Aluno cadastrar(@RequestBody Aluno aluno) {
		return service.cadastrar(aluno);	
	}
	@GetMapping("/{id}")
	public Aluno buscarPorId(@PathVariable Long id) {
		return service.buscarPorId(id);
	}
	@PutMapping("/{id}")
	public Aluno atualizar(
			@PathVariable Long id,
			@RequestBody Aluno aluno) {
		return service.atualizar(id, aluno);
	}
	@DeleteMapping("/{id}")
	public String deletar(@PathVariable Long id) {
		service.deletar(id);
		
		return "Aluno deletado com sucesso";
	}
}
