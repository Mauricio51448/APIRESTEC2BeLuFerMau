package pe.edu.cibertec.APIRESTEC2BeLuFerMau.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.APIRESTEC2BeLuFerMau.model.bd.Publicacion;
import pe.edu.cibertec.APIRESTEC2BeLuFerMau.model.dto.PublicacionRequestDto;
import pe.edu.cibertec.APIRESTEC2BeLuFerMau.service.IPublicacionService;

import java.util.List;

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

    @GetMapping("/listar")
    public List<Publicacion> listarPublicaciones(){
        return iPublicacionService.listarPublicacion();
    };
}
