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

import com.VidaDeAluno360.Entities.Meta;
import com.VidaDeAluno360.Services.MetaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/metas")
@RequiredArgsConstructor
@CrossOrigin("*")
public class MetaController {
	
	private final MetaService service;
	
	@PostMapping
	public Meta cadastrar(@RequestBody Meta metas) {
		return service.cadastrar(metas);	
	}
	@GetMapping("/{id}")
	public Meta buscarPorId(@PathVariable Long id) {
		return service.buscarPorId(id);
	}
	@PutMapping("/{id}")
	public Meta atualizar(
			@PathVariable Long id,
			@RequestBody Meta metas) {
		return service.atualizar(id, metas);
	}
	@DeleteMapping("/{id}")
	public String deletar(@PathVariable Long id) {
		service.deletar(id);
		
		return "Meta deletada com sucesso";
	}
}