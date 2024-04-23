package com.gustavoluiz.projetoFullStack.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gustavoluiz.projetoFullStack.entities.Cliente;
import com.gustavoluiz.projetoFullStack.repositories.ClienteRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public void run(String... args) throws Exception {

		Cliente c = new Cliente(null, "342423", "maria", "feminino", "maria@gmail.com", "342343", "parana");
		
		clienteRepository.save(c);
		
	}
	
	
}
