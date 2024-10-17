/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.usuarios.services;

import com.conference.usuarios.access.IUserRepository;
import com.conference.usuarios.domain.User;
import java.util.List;

/**
 *
 * @author Ashlee Campaz
 */
public class UserService implements IUserService {
    IUserRepository userAccess; 
    
    @Override
    public User login(String us, String password) {
       List<User> listado_usarios =(List<User>) userAccess.findAll();
       for(User u:listado_usarios){
           if(u.getEmail().equals(us)){
               if( u.getPassword().equals(password)){
                   return u;
               }
           }
       }
       return null; 
    }

    @Override
    public User register(User us) {
        if(!isEmailRegistered(us.getEmail())){
            return userAccess.save(us); 
        }
        return null; 
    }
    
    @Override
    public boolean isEmailRegistered(String email){
        List<User> listado_usarios =(List<User>) userAccess.findAll();
       for(User u:listado_usarios){
           return u.getEmail().equals(email);
       }
       return false; 
    }

    @Override
    public List<User> findAll() {
        List<User> listado_usarios =(List<User>) userAccess.findAll();
        return listado_usarios;
    }

    @Override
    public User findById(Long id) {
        User us = userAccess.findById(id).orElse(null);
        return us;
    }
}
