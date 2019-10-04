package com.nelioalves.cursomc.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nelioalves.cursomc.domain.Cliente;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente,Integer>{
	
	//faz fica mais rapida e diminui lock dentro do banco de dados
	@Transactional(readOnly = true)
	Cliente findByEmail(String email);
}
