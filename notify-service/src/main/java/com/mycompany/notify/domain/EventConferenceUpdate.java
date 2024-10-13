/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notify.domain;

/**
 *
 * @author William Andres
 */
public class EventConferenceUpdate {
    private String conferenceId;
    private String newdate;

    public EventConferenceUpdate(String conferenceId, String newdate) {
        this.conferenceId = conferenceId;
        this.newdate = newdate;
    }

    // Getters y Setters

    public String getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    public String getNewdate() {
        return newdate;
    }

    public void setNewdate(String newdate) {
        this.newdate = newdate;
    }
    
}
