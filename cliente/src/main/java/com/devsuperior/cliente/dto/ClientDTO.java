package com.devsuperior.cliente.dto;

import java.time.LocalDate;

import com.devsuperior.cliente.entities.Client;



public class ClientDTO {
	
	
	Long id;
    String name;
    String cpf;
    Double income;
    LocalDate birthDate;
    Integer children;
    
    


	public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birthDate = birthDate;
		this.children = children;
	}
	
	public ClientDTO(Client entity) {
		super();
		id = entity.getId();
		name = entity.getName();
	    cpf = entity.getCpf();
		income = entity.getIncome();
		birthDate = entity.getBirthDate();
		children = entity.getChildren();
	}
	


	public Long getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getCpf() {
		return cpf;
	}


	public Double getIncome() {
		return income;
	}


	public LocalDate getBirthDate() {
		return birthDate;
	}


	public Integer getChildren() {
		return children;
	} 
    
    
    

}
