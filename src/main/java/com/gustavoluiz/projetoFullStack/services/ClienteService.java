package com.gustavoluiz.projetoFullStack.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavoluiz.projetoFullStack.entities.Cliente;
import com.gustavoluiz.projetoFullStack.repositories.ClienteRepository;
import com.gustavoluiz.projetoFullStack.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	public List<Cliente> findAll(){
		return repository.findAll();
	}
	
	public Cliente findById(Long id) {
		Optional<Cliente> obj =repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Cliente insert (Cliente obj) {
		return repository.save(obj);
	}
	
	public void delete (Long id) {
		try {
		repository.deleteById(id);
		}catch (RuntimeException e) {
			e.printStackTrace();

		}
	}
	
	public Cliente update(Long id, Cliente obj) {
		try {
		Cliente entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
		}catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(Cliente entity, Cliente obj) {
		entity.setDocumento(obj.getDocumento());
		entity.setNome(obj.getNome());
		entity.setSexo(obj.getSexo());
		entity.setEmail(obj.getEmail());
		entity.setTelefone(obj.getTelefone());
		entity.setUF(obj.getUF());
	}
}
