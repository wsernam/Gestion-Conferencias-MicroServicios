package co.unicauca.edu.conferencia_microservicio.AccesoADatos.modelos;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Articulo {
    @Id
    private int id;
      @ManyToOne // Relación inversa: muchos Articulos pueden pertenecer a una Conferencia
    @JoinColumn(name = "conferencia_id") // Indica la columna en la base de datos
    private Conferencia conferencia;

    public Articulo(){
        
    }
    public Articulo(int id){
        this.id=id;
        
    }
    
}
