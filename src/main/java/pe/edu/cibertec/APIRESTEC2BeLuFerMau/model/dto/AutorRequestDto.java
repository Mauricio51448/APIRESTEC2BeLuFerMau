package pe.edu.cibertec.APIRESTEC2BeLuFerMau.model.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class AutorRequestDto {
    private String nomautor;
    private String apeautor;
    private Date fechnacautor;
    private List<PublicacionRequestDto> publicacion = new ArrayList<>();

}
