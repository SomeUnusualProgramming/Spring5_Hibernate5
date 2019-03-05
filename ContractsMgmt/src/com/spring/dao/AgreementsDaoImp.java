package com.spring.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.Client;

@Repository
public class AgreementsDaoImp implements AgreementsDao {

  @Autowired
  private SessionFactory sessionFactory;

  @Override
  public void save(Client client) {
     sessionFactory.getCurrentSession().save(client);
  }

  @Override
  public List<Client> list() {
     @SuppressWarnings("unchecked")
     TypedQuery<Client> query = sessionFactory.getCurrentSession().createQuery("from User");
     return query.getResultList();
  }
}