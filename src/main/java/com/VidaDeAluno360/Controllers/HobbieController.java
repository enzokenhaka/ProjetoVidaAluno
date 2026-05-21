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

import com.VidaDeAluno360.Entities.Hobbie;
import com.VidaDeAluno360.Services.HobbieService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/hobbies")
@RequiredArgsConstructor
@CrossOrigin("*")
public class HobbieController {
	
	private final HobbieService service;
	
	@PostMapping
	public Hobbie cadastrar(@RequestBody Hobbie hobbie) {
		return service.cadastrar(hobbie);	
	}
	@GetMapping("/{id}")
	public Hobbie buscarPorId(@PathVariable Long id) {
		return service.buscarPorId(id);
	}
	@PutMapping("/{id}")
	public Hobbie atualizar(
			@PathVariable Long id,
			@RequestBody Hobbie hobbie {
		return service.atualizar(id, hobbie);
	}
	@DeleteMapping("/{id}")
	public String deletar(@PathVariable Long id) {
		service.deletar(id);
		
		return "Hobbie deletado com sucesso";
	}
}