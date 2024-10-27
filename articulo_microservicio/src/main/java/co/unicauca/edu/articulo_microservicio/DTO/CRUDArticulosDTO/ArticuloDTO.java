package co.unicauca.edu.articulo_microservicio.DTO.CRUDArticulosDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sonhuila
 */
@Getter 
@Setter 
@AllArgsConstructor
public class ArticuloDTO {
    private static final long serialVersionUID = 1L;
    private Integer idArticulo;
    private String nombre;
    private ArrayList<String> autores;
    private String resumen;
    private String palabrasClaves;
    private List<ConferenciaDTO> objConferencias;
    
    public ArticuloDTO()
    {
    }
}
