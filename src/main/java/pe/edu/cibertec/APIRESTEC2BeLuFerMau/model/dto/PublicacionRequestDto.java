package pe.edu.cibertec.APIRESTEC2BeLuFerMau.model.dto;

import lombok.Data;
import pe.edu.cibertec.APIRESTEC2BeLuFerMau.model.bd.Autor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class PublicacionRequestDto {
    private Integer idpublicacion;
    private String titulo;
    private String resumen;
    private Date fechpublicacion;

}
