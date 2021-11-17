package com.sic.formulario.encuesta.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sic.formulario.encuesta.apirest.models.entity.MarcaPC;
import com.sic.formulario.encuesta.apirest.models.services.IMarcaPCService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class MarcaPCRestController {
	
	@Autowired
	private IMarcaPCService marcaPCService;
	
	@GetMapping("/marcasPC")
	public List<MarcaPC> index(){
		return marcaPCService.findAll();
	}

}
