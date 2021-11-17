package com.sic.formulario.encuesta.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.sic.formulario.encuesta.apirest.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
	
	public Usuario findByUsername(String username);

}
