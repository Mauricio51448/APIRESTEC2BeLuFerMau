package pe.edu.cibertec.APIRESTEC2BeLuFerMau.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name = "publicacion")
public class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpublicacion;
    private String titulo;
    private String resumen;
    private Date fechpublicacion;

    @ManyToOne
    @JoinColumn(name = "idautor")
    private Autor autor;

}
