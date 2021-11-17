package com.sic.formulario.encuesta.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sic.formulario.encuesta.apirest.models.entity.Formulario;
import com.sic.formulario.encuesta.apirest.models.services.IFormularioService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class FormularioRestController {
	
	@Autowired
	private IFormularioService formService;
	
	@GetMapping("/encuestas")
	public List<Formulario> index(){
		return formService.findAll();
	}
	
	@PostMapping("/encuestas")
	@ResponseStatus(HttpStatus.CREATED)
	public Formulario save(@RequestBody Formulario form) {
		return formService.create(form);
	}
	
	@DeleteMapping("/encuestas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		formService.delete(id);
	}
	
}
