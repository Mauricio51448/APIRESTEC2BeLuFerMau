package pe.edu.cibertec.APIRESTEC2BeLuFerMau.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import pe.edu.cibertec.APIRESTEC2BeLuFerMau.model.bd.Autor;

import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name = "publicacion")
public class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPublicacion;

    private String titulo;

    private String resumen;

    private Date fechPublicacion;

    @ManyToOne
    @JoinColumn(name = "idautor")
    private Autor autor;

}
