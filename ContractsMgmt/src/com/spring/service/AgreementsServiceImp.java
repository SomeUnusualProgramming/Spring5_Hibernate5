package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.AgreementsDao;
import com.spring.model.Client;

@Service
public class AgreementsServiceImp implements AgreementsService {

	@Autowired
	   private AgreementsDao agreementsDao;
	 
	   @Transactional
	   public void save(Client client) {
		   agreementsDao.save(client);
	   }
	 
	   @Transactional
	   public List<Client> list() {
	      return agreementsDao.list();
	   }
}
