/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notify.application;

import com.mycompany.notify.domain.Notify;
import com.mycompany.notify.domain.INotifyServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author William Andres
 */
@Service
public class NotifyServices {
        
    @Autowired
    private EmailServices emailServices;
    private final INotifyServices repositoryNotify;
    @Autowired
    public NotifyServices(INotifyServices repositoryNotify) {
        this.repositoryNotify = repositoryNotify;
    }
    
    public void saveNotify(Notify notify) {
        repositoryNotify.save(notify);
    }

    public List<Notify> getNotifyForUser(String userId) {
        return repositoryNotify.findByUserId(userId);
    }
    
    public void procesarNotificacion(Notify notify) {
        // Aquí puedes construir el mensaje y enviar el correo.
        String destinatario = notify.getEmailUsuario();
        String asunto = "Nueva notificación";
        String cuerpo = "Has recibido una nueva notificación: " + notify.getMessage();
        emailServices.enviarNotificacion(destinatario, asunto, cuerpo);
    }
}
