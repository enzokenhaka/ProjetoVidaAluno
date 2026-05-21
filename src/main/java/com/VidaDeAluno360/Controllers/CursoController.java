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

import com.VidaDeAluno360.Entities.Curso;
import com.VidaDeAluno360.Services.CursoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/cursos")
@RequiredArgsConstructor
@CrossOrigin("*")
public class CursoController {
	
	private final CursoService service;
	
	@PostMapping
	public Curso cadastrar(@RequestBody Curso curso) {
		return service.cadastrar(curso);	
	}
	@GetMapping("/{id}")
	public Curso buscarPorId(@PathVariable Long id) {
		return service.buscarPorId(id);
	}
	@PutMapping("/{id}")
	public Curso atualizar(
			@PathVariable Long id,
			@RequestBody Curso curso) {
		return service.atualizar(id, curso);
	}
	@DeleteMapping("/{id}")
	public String deletar(@PathVariable Long id) {
		service.deletar(id);
		
		return "Curso deletado com sucesso";
	}
}