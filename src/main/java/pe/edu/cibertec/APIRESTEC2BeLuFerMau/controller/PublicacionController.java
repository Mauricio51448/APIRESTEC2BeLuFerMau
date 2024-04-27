package pe.edu.cibertec.APIRESTEC2BeLuFerMau.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.APIRESTEC2BeLuFerMau.model.bd.Publicacion;
import pe.edu.cibertec.APIRESTEC2BeLuFerMau.model.dto.PublicacionRequestDto;
import pe.edu.cibertec.APIRESTEC2BeLuFerMau.service.IPublicacionService;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/publicacion")
public class PublicacionController {
    private IPublicacionService iPublicacionService;

    @PostMapping("")
    public ResponseEntity<Publicacion> registrarPublicacion(
            @RequestBody PublicacionRequestDto publicacionRequestDto
    ){
        return new ResponseEntity<>(
                iPublicacionService.registrarPublicacion(publicacionRequestDto),
                HttpStatus.CREATED
        );
    }
}
