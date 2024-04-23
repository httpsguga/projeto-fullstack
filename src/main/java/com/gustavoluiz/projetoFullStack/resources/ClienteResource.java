package com.gustavoluiz.projetoFullStack.resources;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gustavoluiz.projetoFullStack.entities.Cliente;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

	@GetMapping
	public ResponseEntity<Cliente> findAll(){
		Cliente c = new Cliente(null, "342423", "maria", "feminino", "maria@gmail.com", "342343", "parana");
		return ResponseEntity.ok().body(c);
	}
	
}
