/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notify.domain;

/**
 *
 * @author wsern
 */
public class EventArticleCreateOrUpdate {
    private String tittle;
    private String authorId;
    private boolean created;  // Indica si el artículo fue creado (true) o modificado (false)
    
    //Getters and Setters

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public boolean isCreated() {
        return created;
    }

    public void setCreated(boolean created) {
        this.created = created;
    }
    
}

