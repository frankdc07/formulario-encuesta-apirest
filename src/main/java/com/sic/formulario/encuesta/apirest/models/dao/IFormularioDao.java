package com.sic.formulario.encuesta.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.sic.formulario.encuesta.apirest.models.entity.Formulario;

public interface IFormularioDao extends CrudRepository<Formulario, Long> {

}
