package co.unicauca.edu.articulo_microservicio.domain.models;

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
public class Articulo {

    private int idArticulo;
    private String nombre;
    private ArrayList<String> autores;
    private String resumen;
    private String palabrasClaves;

    public Articulo() {
    }
}
