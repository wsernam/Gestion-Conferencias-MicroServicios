/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notify.infrastructure;

import com.mycompany.notify.application.NotifyServices;
import com.mycompany.notify.domain.EventArticleCreate;
import com.mycompany.notify.domain.EventArticleCreateOrUpdate;
import com.mycompany.notify.domain.EventConferenceUpdate;
import com.mycompany.notify.domain.EventEvaluation;
import com.mycompany.notify.domain.Notify;
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

    // 1. Listener para cuando una conferencia es modificada
    @RabbitListener(queues = "eventos.modificados")
    public void recibirEventoModificado(EventConferenceUpdate event) {
        System.out.println("Evento recibido: Conferencia modificada - " + event.getName());
        
        // Crear una nueva notificación para el evento de modificación
        Notify notify = new Notify();
        notify.setMessage("Conferencia modificada: " + event.getName());
        notify.setMessage(event.getName());  // Asume que el evento tiene el ID del autor

        // Guardar la notificación en la base de datos
        notifyServices.saveNotify(notify);
    }
    
    // 2. Listener para cuando un artículo es evaluado
    @RabbitListener(queues = "articulos.evaluados")
    public void recibirEventoEvaluacionArticulo(EventEvaluation event) {
        System.out.println("Evento recibido: Artículo evaluado - " + event.getArticleTitle());
        
        // Crear una notificación para la evaluación del artículo
        Notify notify = new Notify();
        notify.setMessage("Artículo evaluado: " + event.getArticleTitle() + " por el usuario " + event.getUserId());
        notify.setUserId(event.getAuthorId());  // Notificar al autor del artículo

        // Guardar la notificación en la base de datos
        notifyServices.saveNotify(notify);
    }
    
    // 3. Listener para cuando un artículo es creado o modificado
    @RabbitListener(queues = "articulos.creados.modificados")
    public void recibirEventoArticuloCreadoOModificado(EventArticleCreateOrUpdate event) {
        String tipoEvento = event.isCreated() ? "creado" : "modificado";
        System.out.println("Evento recibido: Artículo " + tipoEvento + " - " + event.getTittle());
        
        // Crear una notificación para la creación o modificación del artículo
        Notify notify = new Notify();
        notify.setMessage("Artículo " + tipoEvento + ": " + event.getTittle());
        notify.setUserId(event.getAuthorId());

        // Guardar la notificación en la base de datos
        notifyServices.saveNotify(notify);
    }
}
