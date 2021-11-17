package com.sic.formulario.encuesta.apirest.models.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sic.formulario.encuesta.apirest.models.dao.IUsuarioDao;
import com.sic.formulario.encuesta.apirest.models.entity.Usuario;

@Service
public class UsuarioService implements UserDetailsService {
	
	@Autowired
	private IUsuarioDao usuarioDao;	
	
	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario usuario = usuarioDao.findByUsername(username);
		
		List<GrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority(usuario.getRol()));
		
		return new User(username, usuario.getPassword(), usuario.getActivo(), true, true, true, authorities);
	}

}
