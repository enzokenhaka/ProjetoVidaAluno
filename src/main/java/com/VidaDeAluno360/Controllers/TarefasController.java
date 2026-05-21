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

import com.VidaDeAluno360.Entities.Tarefas;
import com.VidaDeAluno360.Services.TarefasService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/tarefa")
@RequiredArgsConstructor
@CrossOrigin("*")
public class TarefasController {
	
	private final TarefasService service;
	
	@PostMapping
	public Tarefas cadastrar(@RequestBody Tarefas tarefa) {
		return service.cadastrar(tarefa);	
	}
	@GetMapping("/{id}")
	public Tarefas buscarPorId(@PathVariable Long id) {
		return service.buscarPorId(id);
	}
	@PutMapping("/{id}")
	public Tarefas atualizar(
			@PathVariable Long id,
			@RequestBody Tarefas tarefa) {
		return service.atualizar(id, tarefa);
	}
	@DeleteMapping("/{id}")
	public String deletar(@PathVariable Long id) {
		service.deletar(id);
		
		return "Tarefa deletada com sucesso";
	}
}
