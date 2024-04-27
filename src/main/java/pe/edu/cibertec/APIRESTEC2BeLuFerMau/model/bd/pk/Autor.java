package pe.edu.cibertec.APIRESTEC2BeLuFerMau.model.bd.pk;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAutor;

    private String nomAutor;

    private String apeAutor;

    private Date fechNacAutor;



}
