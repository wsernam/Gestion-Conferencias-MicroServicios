/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notify.infrastructure;

import com.mycompany.notify.aplication.NotifyServices;
import com.mycompany.notify.domain.EventArticleCreate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author William Andres
 */
@Component
public class EventListener {
    @Autowired
    private NotifyServices notifyServices;

    @RabbitListener(queues = "articulos.creados")
    public void recibirEventoArticuloCreado(EventArticleCreate Event) {
        System.out.println("Evento recibido: " + Event.getTittle());
        // Aquí puedes convertir el evento en una notificación y guardarla usando NotificacionService
    }
}
