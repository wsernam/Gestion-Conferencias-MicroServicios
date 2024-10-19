package co.unicauca.edu.conferencia_microservicio.fachadaServicios.servicios;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.unicauca.edu.conferencia_microservicio.AccesoADatos.Repositorio.IRepositorioConferencia;
import co.unicauca.edu.conferencia_microservicio.AccesoADatos.modelos.Conferencia;
import co.unicauca.edu.conferencia_microservicio.fachadaServicios.DTO.ConferenciaDTO;

import org.modelmapper.TypeToken;

@Service
public class ServicioConferencia implements IServicioConferencia {
    @Autowired
    private IRepositorioConferencia servicioAccesoBaseDatos;
        @Autowired
    private ModelMapper modelMapper;
        @Override
        public List<ConferenciaDTO> getConferencias() {
            List<Conferencia> ConferenciasEntity= this.servicioAccesoBaseDatos.findAll();
            List<ConferenciaDTO> ConferenciasDto=this.modelMapper.map(ConferenciasEntity, new TypeToken<List<ConferenciaDTO>>(){
            }.getType());
            return ConferenciasDto;
        }
    
        @Override
        public ConferenciaDTO setConferencia(ConferenciaDTO prmConferencia) {
            Conferencia ConferenciaEntity= this.modelMapper.map(prmConferencia, Conferencia.class);
           Conferencia objConferenciasEntity=this.servicioAccesoBaseDatos.save(ConferenciaEntity);
           ConferenciaDTO ConferenciasDTO=this.modelMapper.map(objConferenciasEntity, ConferenciaDTO.class);
           return ConferenciasDTO;
        }
    
        @Override
        public boolean existeConferencia(int prmId) {
            return this.servicioAccesoBaseDatos.existsById(prmId);
        }
    
       
       
        
    }
    
