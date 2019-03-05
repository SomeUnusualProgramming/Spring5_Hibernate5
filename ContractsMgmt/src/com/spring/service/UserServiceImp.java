package com.spring.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.UserDao;
import com.spring.model.User;


@Service
public class UserServiceImp implements UserService {
 
   @Autowired
   private UserDao userDao;
 
   @Transactional
   public void save(User user) {
      userDao.save(user);
   }
 
   @Transactional
   public List<User> list() {
      return userDao.list();
   }
}