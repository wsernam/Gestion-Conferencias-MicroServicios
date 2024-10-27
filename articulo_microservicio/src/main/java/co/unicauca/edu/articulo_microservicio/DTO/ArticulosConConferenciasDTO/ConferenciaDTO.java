package co.unicauca.edu.articulo_microservicio.DTO.ArticulosConConferenciasDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author sonhuila
 */
@Getter
@Setter
@AllArgsConstructor
public class ConferenciaDTO {
    private Integer id;
    private String nombre;
    private int cantidadMaxArticulos;
    
    public ConferenciaDTO()
    {
    }
}
