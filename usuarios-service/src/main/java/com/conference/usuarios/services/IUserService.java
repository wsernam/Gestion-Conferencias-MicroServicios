/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.conference.usuarios.services;

import com.conference.usuarios.domain.User;
import java.util.List;

/**
 *
 * @author Ashlee Campaz
 */
public interface IUserService {
    public User login(String us,String password);
    public User register(User us); 
    public boolean isEmailRegistered(String email);
    public List<User> findAll();
    public User findById(Long id);
}
