package com.gustavoluiz.projetoFullStack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoluiz.projetoFullStack.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
