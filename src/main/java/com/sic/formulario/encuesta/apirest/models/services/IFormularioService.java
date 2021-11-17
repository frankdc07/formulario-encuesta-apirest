package com.sic.formulario.encuesta.apirest.models.services;

import java.util.List;

import com.sic.formulario.encuesta.apirest.models.entity.Formulario;

public interface IFormularioService {
	
	public List<Formulario> findAll();
	
	public Formulario findById(Long id);
	
	public Formulario create(Formulario formulario);
	
	public void delete(Long id);
	
}
