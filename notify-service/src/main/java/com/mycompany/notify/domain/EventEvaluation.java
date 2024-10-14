/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notify.domain;

/**
 *
 * @author wsern
 */
public class EventEvaluation {
    private String articleTitle;
    private String userId;  // El usuario que realizó la evaluación
    private String authorId;  // El autor del artículo evaluado
    // Otros detalles de la evaluación
    //Getter and Setters

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }
    
}
