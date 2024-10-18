/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notify.domain;

import jakarta.persistence.*;
/**
 *
 * @author William Andres
 */
@Entity
public class Notify {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "usuario_id")
    private String userId;
    private String message; 
    private String emailUsuario;  // El correo electrónico del usuario que recibirá la notificación
    
    public String getEmailUsuario() {
        return emailUsuario;
    }

    // Getters y Setters
    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public long getId() {
        return id;
    }
    
    public void setId(long id) {    
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}

