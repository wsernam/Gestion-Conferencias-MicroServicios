/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notify.infrastructure;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author William Andres
 */
@Configuration/*La anotación @Configuration indica que la clase ConfigRabbitMQ 
es una clase de configuración en Spring. Esto significa que se utilizará para 
definir beans que el contenedor de Spring gestionará. En este caso, la clase define 
un bean que representa una cola (queue) de RabbitMQ.*/
public class ConfigRabbitMQ {

    @Bean/*La anotación @Bean se utiliza para marcar un método como un productor
    de un bean que será gestionado por el contenedor de Spring. Los beans son 
    objetos que son creados, configurados y administrados por el contenedor de 
    Spring, y pueden ser inyectados en otras partes de la aplicación. En este caso, 
    el método queueArticuloCreado define y devuelve un bean que representa una 
    cola en RabbitMQ.*/
    public Queue queueArticuloCreado() {
        return new Queue("articulos.creados");/*Esta línea crea una nueva instancia
        de la clase Queue, y le asigna el nombre "articulos.creados". Cuando los 
        servicios de tu aplicación quieran enviar o recibir mensajes de esta cola, 
        usarán este nombre para referirse a ella.*/
    }
}