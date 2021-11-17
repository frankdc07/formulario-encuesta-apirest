package com.sic.formulario.encuesta.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sic.formulario.encuesta.apirest.models.dao.IMarcaPCDao;
import com.sic.formulario.encuesta.apirest.models.entity.MarcaPC;

@Service
public class MarcaPCServiceImpl implements IMarcaPCService{
	
	@Autowired
	private IMarcaPCDao marcaPCDao;

	@Override
	public List<MarcaPC> findAll() {
		return (List<MarcaPC>) marcaPCDao.findAll();
	}

}
