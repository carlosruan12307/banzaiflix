package com.backbanzaiflix.backbanzaiflix;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.backbanzaiflix.backbanzaiflix.repositorys.UsuarioRepository;

@SpringBootApplication
public class BackbanzaiflixApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackbanzaiflixApplication.class, args);
	
		
	}

}
