package com.sic.formulario.encuesta.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class FormularioEncuestaApplication implements CommandLineRunner {
	
	@Autowired
	private BCryptPasswordEncoder passEncoder;

	public static void main(String[] args) {
		SpringApplication.run(FormularioEncuestaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		String pass = "12345";
		for (int i = 0; i < 3; i++) {
			System.out.println(this.passEncoder.encode(pass));
		}
		
	}

}
