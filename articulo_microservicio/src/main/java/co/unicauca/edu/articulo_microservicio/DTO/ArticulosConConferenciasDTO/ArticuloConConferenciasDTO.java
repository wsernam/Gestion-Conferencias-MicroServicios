package co.unicauca.edu.articulo_microservicio.DTO.ArticulosConConferenciasDTO;

import co.unicauca.edu.articulo_microservicio.DTO.CRUDArticulosDTO.ArticuloDTO;
import java.util.List;

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
public class ArticuloConConferenciasDTO {
    private ArticuloDTO objArticuloDTO;
    private List<ConferenciaDTO> conferencias;
}
