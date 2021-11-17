package com.sic.formulario.encuesta.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class FormularioEncuestaApplication {
	
	@Autowired
	private BCryptPasswordEncoder passEncoder;

	public static void main(String[] args) {
		SpringApplication.run(FormularioEncuestaApplication.class, args);
	}


}
