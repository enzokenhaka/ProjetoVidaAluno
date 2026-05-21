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

import com.VidaDeAluno360.Entities.Evento;
import com.VidaDeAluno360.Services.EventosService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/eventos")
@RequiredArgsConstructor
@CrossOrigin("*")
public class EventoController {
	
	private final EventosService service;
	
	@PostMapping
	public Evento cadastrar(@RequestBody Evento eventos) {
		return service.cadastrar(eventos);	
	}
	@GetMapping("/{id}")
	public Evento buscarPorId(@PathVariable Long id) {
		return service.buscarPorId(id);
	}
	@PutMapping("/{id}")
	public Evento atualizar(
			@PathVariable Long id,
			@RequestBody Evento eventos) {
		return service.atualizar(id, eventos);
	}
	@DeleteMapping("/{id}")
	public String deletar(@PathVariable Long id) {
		service.deletar(id);
		
		return "Evento deletado com sucesso";
	}
}