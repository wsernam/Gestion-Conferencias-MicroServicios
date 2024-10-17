/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.conference.usuarios.access;

import com.conference.usuarios.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Ashlee Campaz
 */
public interface IUserRepository extends CrudRepository<User, Long> {
    
}
