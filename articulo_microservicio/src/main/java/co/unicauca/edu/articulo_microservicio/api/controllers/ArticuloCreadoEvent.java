package co.unicauca.edu.articulo_microservicio.api.controllers;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArticuloCreadoEvent implements Serializable{
    private static final long serialVersionUID = 1L;
    private int idArticulo;
    private String nombre;
    private String resumen;
    
    public ArticuloCreadoEvent(int idArticulo, String nombre, String resumen){
        this.idArticulo=idArticulo;
        this.nombre=nombre;
        this.resumen=resumen;
    }
}
