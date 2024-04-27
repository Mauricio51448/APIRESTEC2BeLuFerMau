package pe.edu.cibertec.APIRESTEC2BeLuFerMau.service;

import pe.edu.cibertec.APIRESTEC2BeLuFerMau.model.bd.Publicacion;
import pe.edu.cibertec.APIRESTEC2BeLuFerMau.model.dto.PublicacionRequestDto;

import java.util.List;

public interface IPublicacionService {
    Publicacion registrarPublicacion(PublicacionRequestDto publicacionRequestDto);
    List<Publicacion> listarPublicacion();
}
