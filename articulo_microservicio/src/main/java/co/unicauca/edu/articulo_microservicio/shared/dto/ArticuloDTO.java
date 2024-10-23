package co.unicauca.edu.articulo_microservicio.shared.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 *
 * @author sonhuila
 */
@Getter 
@Setter 
@AllArgsConstructor
public class ArticuloDTO {
    private int idArticulo;
    private String nombre;
    private ArrayList<String> autores;
    private String resumen;
    private String palabrasClaves;
    
    public ArticuloDTO()
    {
    }
}
