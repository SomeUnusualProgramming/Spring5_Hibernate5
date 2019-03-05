package com.spring.service;

import java.util.List;

import com.spring.model.Client;


public interface AgreementsService {
	void save(Client client);
	
	List<Client> list();
}
