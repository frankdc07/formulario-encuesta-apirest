package com.sic.formulario.encuesta.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sic.formulario.encuesta.apirest.models.dao.IFormularioDao;
import com.sic.formulario.encuesta.apirest.models.entity.Formulario;

@Service
public class FormularioServiceImpl implements IFormularioService{
	
	@Autowired
	private IFormularioDao formDao;

	@Override
	@Transactional(readOnly = true)
	public List<Formulario> findAll() {
		return (List<Formulario>) formDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Formulario findById(Long id) {
		return formDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Formulario create(Formulario formulario) {
		return formDao.save(formulario);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		formDao.deleteById(id);
		
	}

}
