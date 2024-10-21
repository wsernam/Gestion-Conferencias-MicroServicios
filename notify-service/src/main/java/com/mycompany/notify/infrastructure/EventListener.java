/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notify.infrastructure;

import com.mycompany.notify.application.NotifyServices;
import com.mycompany.notify.domain.ConferenciaCreadaEvent;
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

    // Escuchar el evento de creación de conferencia
    @RabbitListener(queues = "conferencia-creada-queue")
    public void handleConferenciaCreada(ConferenciaCreadaEvent evento) {
        // Procesar el evento recibido y enviar la notificación
        String destinatario = "wsernamunoz@gmail.com"; // Esto puede depender de tu lógica
        String asunto = "Nueva conferencia creada: " + evento.getNombre();
        String cuerpo = "Se ha creado una nueva conferencia con ID: " + evento.getId() + " y nombre: " + evento.getNombre();
        System.out.println("Conferencia creada: " + evento.getNombre());
        // Enviar la notificación
        notifyServices.enviarNotificacion(destinatario, asunto, cuerpo);
    }

}
