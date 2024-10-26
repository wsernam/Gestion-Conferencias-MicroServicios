package co.unicauca.edu.articulo_microservicio.domain.services;

import co.unicauca.edu.articulo_microservicio.api.controllers.ArticuloCreadoEvent;
import co.unicauca.edu.articulo_microservicio.domain.models.Articulo;
import co.unicauca.edu.articulo_microservicio.infrastructure.repositories.ArticuloRepository;
import co.unicauca.edu.articulo_microservicio.shared.dto.ArticuloDTO;
import java.util.List;
import javax.crypto.AEADBadTagException;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sonhuila
 */
@Service
public class ArticuloServiceImpl implements IArticuloService {

    private ArticuloRepository servicioAccesoBaseDatos;

    private ModelMapper modelMapper;
    
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public ArticuloServiceImpl(ArticuloRepository servicioAccesoBaseDatos, ModelMapper modelMapper) {
        this.servicioAccesoBaseDatos = servicioAccesoBaseDatos;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ArticuloDTO> findAll() {
        List<Articulo> articulosEntity = this.servicioAccesoBaseDatos.findAll();
        List<ArticuloDTO> articulosDTO = this.modelMapper.map(articulosEntity, new TypeToken<List<ArticuloDTO>>() {
        }.getType());
        return articulosDTO;
    }

    @Override
    public ArticuloDTO findById(Integer id) {
        Articulo objArticuloEntity = this.servicioAccesoBaseDatos.findById(id);
        ArticuloDTO articuloDTO = this.modelMapper.map(objArticuloEntity, ArticuloDTO.class);
        return articuloDTO;
    }

    @Override
    public boolean existsById(Integer id) {
        return this.servicioAccesoBaseDatos.existsById(id);
    }

    @Override
    public ArticuloDTO save(ArticuloDTO articulo) {
        Articulo articuloEntity = this.modelMapper.map(articulo, Articulo.class);
        Articulo objArticuloEntity = this.servicioAccesoBaseDatos.save(articuloEntity);
        ArticuloDTO articuloDTO = this.modelMapper.map(objArticuloEntity, ArticuloDTO.class);
        ArticuloCreadoEvent evento = new ArticuloCreadoEvent(articuloEntity.getIdArticulo(), articuloEntity.getNombre(), articuloEntity.getResumen());
        rabbitTemplate.convertAndSend("articulo-exchange", "articulo.creado", evento);
        return articuloDTO;
    }

    @Override
    public ArticuloDTO update(Integer id, ArticuloDTO articulo) {
        Articulo articuloEntity = this.modelMapper.map(articulo, Articulo.class);
        Articulo articuloEntityActualizado = this.servicioAccesoBaseDatos.update(id, articuloEntity);
        ArticuloDTO articuloDTO = this.modelMapper.map(articuloEntityActualizado, ArticuloDTO.class);
        return articuloDTO;
    }

    @Override
    public boolean delete(Integer id) {
        return this.servicioAccesoBaseDatos.delete(id);
    }
}
