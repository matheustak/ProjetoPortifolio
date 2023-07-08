/**
 * 
 */
package com.devsuperior.cliente.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.cliente.dto.ClientDTO;
import com.devsuperior.cliente.entities.Client;
import com.devsuperior.cliente.repositories.ClientRepository;

/**
 * @author matheus
 *
 */
@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public  ClientDTO findById(Long id) {
		Optional <Client> result = repository.findById(id);
		Client client = result.get();
		ClientDTO dto = new ClientDTO(client);
		return dto;
	}
	

}
