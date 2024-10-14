/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notify.domain;

import jakarta.persistence.Entity;

/**
 *
 * @author William Andres
 */
@Entity
public class Author extends AppUser {
    
    public Author(String id, String nombre) {
        super(id, nombre);
    }

    // Métodos adicionales si es necesario
}
