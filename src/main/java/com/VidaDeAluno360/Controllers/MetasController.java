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

import com.VidaDeAluno360.Entities.Metas;
import com.VidaDeAluno360.Services.MetasService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/metas")
@RequiredArgsConstructor
@CrossOrigin("*")
public class MetasController {
	
	private final MetasService service;
	
	@PostMapping
	public Metas cadastrar(@RequestBody Metas metas) {
		return service.cadastrar(metas);	
	}
	@GetMapping("/{id}")
	public Metas buscarPorId(@PathVariable Long id) {
		return service.buscarPorId(id);
	}
	@PutMapping("/{id}")
	public Metas atualizar(
			@PathVariable Long id,
			@RequestBody Metas metas) {
		return service.atualizar(id, metas);
	}
	@DeleteMapping("/{id}")
	public String deletar(@PathVariable Long id) {
		service.deletar(id);
		
		return "Meta deletada com sucesso";
	}
}