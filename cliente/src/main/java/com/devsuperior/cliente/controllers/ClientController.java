/**
 * 
 */
package com.devsuperior.cliente.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.cliente.dto.ClientDTO;
import com.devsuperior.cliente.services.ClientService;

/**
 * @author matheus
 *
 */

@RestController
@RequestMapping(value = "/clientes")
public class ClientController {
	
	@Autowired
	private ClientService service;
	
	@GetMapping(value = "/{id}")
	public ClientDTO findById(@PathVariable long id) {
		
		return service.findById(id);
		
	}

}
