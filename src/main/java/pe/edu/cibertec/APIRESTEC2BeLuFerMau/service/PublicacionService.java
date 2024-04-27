package pe.edu.cibertec.APIRESTEC2BeLuFerMau.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.APIRESTEC2BeLuFerMau.model.bd.Publicacion;
import pe.edu.cibertec.APIRESTEC2BeLuFerMau.model.bd.Autor;
import pe.edu.cibertec.APIRESTEC2BeLuFerMau.model.dto.AutorRequestDto;
import pe.edu.cibertec.APIRESTEC2BeLuFerMau.model.dto.PublicacionRequestDto;
import pe.edu.cibertec.APIRESTEC2BeLuFerMau.repository.PublicacionRepository;

@AllArgsConstructor
@Service
public class PublicacionService implements IPublicacionService{
    private PublicacionRepository publicacionRepository;
    private IAutorService iAutorService;

    @Transactional
    @Override
    public Publicacion registrarPublicacion(PublicacionRequestDto publicacionRequestDto) {
        Publicacion publicacion = new Publicacion();
        publicacion.setTitulo(publicacionRequestDto.getTitulo());
        publicacion.setResumen(publicacionRequestDto.getResumen());
        publicacion.setFechPublicacion(publicacionRequestDto.getFechPublicacion());
        Publicacion nuevaPublicacion = publicacionRepository.save(publicacion);
        Autor autor;

        return nuevaPublicacion;
    }
}
