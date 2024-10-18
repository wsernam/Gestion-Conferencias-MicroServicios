/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notify.controller;

import com.mycompany.notify.application.NotifyServices;
import com.mycompany.notify.domain.Notify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wsern
 */
@RestController
@RequestMapping("/api/notificaciones")
public class NotificacionController {

    @Autowired
    private NotifyServices notifyServices;

    // Endpoint para crear una nueva notificación
    @PostMapping
    public ResponseEntity<String> enviarNotificacion(@RequestBody Notify notify) {
        notifyServices.procesarNotificacion(notify);  // Llama al servicio para procesar la notificación
        return ResponseEntity.ok("Notificación enviada exitosamente.");
    }
}
