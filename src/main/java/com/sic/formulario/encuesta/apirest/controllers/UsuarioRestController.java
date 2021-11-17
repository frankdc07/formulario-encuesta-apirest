package com.sic.formulario.encuesta.apirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sic.formulario.encuesta.apirest.models.entity.Usuario;
import com.sic.formulario.encuesta.apirest.models.services.IUsuarioService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class UsuarioRestController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@PutMapping("/usuarios/{username}")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario bloquearUsuario(@RequestBody Usuario usuario, @PathVariable String username) {
		Usuario usuarioActual = usuarioService.findByUsername(username);
		usuarioActual.setActivo(usuario.getActivo());
		return usuarioService.save(usuarioActual);
	}
	
	
	
}
