package com.spring.dao;

import java.util.List;
import com.spring.model.Client;

public interface AgreementsDao {
	   void save(Client client);
	   List<Client> list();
	}
	 