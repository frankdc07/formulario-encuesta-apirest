package com.sic.formulario.encuesta.apirest.models.services;

import java.util.List;

import com.sic.formulario.encuesta.apirest.models.entity.MarcaPC;

public interface IMarcaPCService {
	
	public List<MarcaPC> findAll();

}
