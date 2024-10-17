/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.usuarios.presentation;

import com.conference.usuarios.domain.User;
import com.conference.usuarios.services.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ashlee Campaz
 */
@RestController
@Component
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;
    
    @RequestMapping(method = RequestMethod.GET, produces =
    "application/json")
     @ResponseBody
     public List<User> findAll() {
        return userService.findAll();
     }
     
     @RequestMapping(method = RequestMethod.POST, produces =
    "application/json")
     @ResponseBody
     public User create(@RequestBody User us) {
     return userService.register(us);
     }
     /* Get a Event by ID */
     @GetMapping("/{id}")
     public User getEventById(@PathVariable Long id) {
     return userService.findById(id);
    }
}
