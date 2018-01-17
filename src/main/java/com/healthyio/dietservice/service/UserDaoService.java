package com.healthyio.dietservice.service;

import com.healthyio.dietservice.bean.User;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;

@Component
public class UserDaoService {

    private EntityManager em;

    public User save(User user) {
        em.persist(user);
        return user;
    }

    public User findById(Integer id){
        return em.find(User.class,id);
    }
}
