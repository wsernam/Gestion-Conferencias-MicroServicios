package co.unicauca.edu.articulo_microservicio.domain.services;

import co.unicauca.edu.articulo_microservicio.shared.dto.ArticuloDTO;
import java.util.List;

/**
 *
 * @author sonhuila
 */
public interface IArticuloService {
    public List<ArticuloDTO> findAll();
    public ArticuloDTO findById(Integer id);
    public boolean existsById(Integer id);
    public ArticuloDTO save(ArticuloDTO articulo);
    public ArticuloDTO update(Integer id, ArticuloDTO articulo);
    public boolean delete(Integer id);
}
