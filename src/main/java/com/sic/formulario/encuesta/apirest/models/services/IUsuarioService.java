package com.sic.formulario.encuesta.apirest.models.services;

import com.sic.formulario.encuesta.apirest.models.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario save(Usuario usuario);
	
	public Usuario findByUsername(String username);

}
