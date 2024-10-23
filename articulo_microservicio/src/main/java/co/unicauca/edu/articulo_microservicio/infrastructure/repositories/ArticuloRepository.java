package co.unicauca.edu.articulo_microservicio.infrastructure.repositories;

import co.unicauca.edu.articulo_microservicio.domain.models.Articulo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sonhuila
 */
@Repository
public class ArticuloRepository {

    /*Lista de articulos*/
    private ArrayList<Articulo> listaDeArticulos;

    /*Constructor*/
    public ArticuloRepository() {
        this.listaDeArticulos = new ArrayList<>();
        cargarArticulos();
    }

    /*Registrar articulo*/
    public Articulo save(Articulo articulo) {
        System.out.println("Invocando a almacenar articulo");
        Articulo objArticulo = null;
        if (this.listaDeArticulos.add(articulo)) {
            objArticulo = articulo;
        }

        return objArticulo;
    }

    /*Consultar articulo para ver sus detalles*/
    public Articulo findById(Integer id) {
        System.out.println("Invocando a consultar un articulo");
        Articulo objArticulo = null;

        for (Articulo articulo : listaDeArticulos) {
            if (articulo.getIdArticulo() == id) {
                objArticulo = articulo;
                break;
            }
        }
        return objArticulo;
    }

    /*Listar articulos*/
    public List<Articulo> findAll() {
        System.out.println("Invocando a listarArticulos");
        return this.listaDeArticulos;
    }

    /*Actualizar articulo*/
    public Articulo update(Integer id, Articulo articulo) {
        System.out.println("Invocando a actualizar un articulo");
        Articulo objArticulo = null;

        for (int i = 0; i < this.listaDeArticulos.size(); i++) {
            if (this.listaDeArticulos.get(i).getIdArticulo() == id) {
                this.listaDeArticulos.set(i, articulo);
                objArticulo = articulo;
                break;
            }
        }

        return objArticulo;
    }

    /*Eliminar articulo*/
    public boolean delete(Integer id) {
        System.out.println("Invocando a eliminar un articulo");
        boolean bandera = false;

        for (int i = 0; i < this.listaDeArticulos.size(); i++) {
            if (this.listaDeArticulos.get(i).getIdArticulo() == id) {
                this.listaDeArticulos.remove(i);
                bandera = true;
                break;
            }
        }

        return bandera;
    }

    /*Consultar articulo para establecer si se puede registrar*/
    public boolean existsById(Integer id) {
        System.out.println("Invocando a consultar si existe un articulo");
        boolean bandera = false;

        for (Articulo articulo : listaDeArticulos) {
            if (articulo.getIdArticulo() == id) {
                bandera = true;
            }
        }

        return bandera;
    }

    /*Almacena articulos de prueba*/
    private void cargarArticulos() {
        Articulo objArticulo1 = new Articulo(1, "Gestión de Proyectos Ágiles",
                new ArrayList<>(List.of("Juan Pérez", "María Gómez")),
                "Este artículo describe metodologías ágiles para la gestión de proyectos.",
                "gestión de proyectos, metodologías ágiles");

        this.listaDeArticulos.add(objArticulo1);

        Articulo objArticulo2 = new Articulo(2, "Aplicación de IA en Salud",
                new ArrayList<>(List.of("Carlos Ramírez", "Ana Torres")),
                "El uso de inteligencia artificial para mejorar los servicios de salud.",
                "IA, salud, servicios médicos");

        this.listaDeArticulos.add(objArticulo2);

        Articulo objArticulo3 = new Articulo(3, "Seguridad Informática Moderna",
                new ArrayList<>(List.of("Laura Méndez")),
                "Un análisis de las técnicas actuales para la protección de información.",
                "seguridad informática, ciberseguridad, protección de datos");

        this.listaDeArticulos.add(objArticulo3);

        Articulo objArticulo4 = new Articulo(4, "Sistemas Distribuidos",
                new ArrayList<>(List.of("Roberto Díaz", "Luisa Martínez")),
                "Un estudio sobre el diseño y arquitectura de sistemas distribuidos.",
                "sistemas distribuidos, arquitectura, computación en red");

        this.listaDeArticulos.add(objArticulo4);
    }
}
