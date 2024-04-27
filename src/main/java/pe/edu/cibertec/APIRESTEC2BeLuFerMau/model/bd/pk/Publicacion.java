package pe.edu.cibertec.APIRESTEC2BeLuFerMau.model.bd.pk;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPublicacion;

    private String titulo;

    private String resumen;

    private Date fechPublicacion;

    @ManyToOne
    private Autor autor;

}
