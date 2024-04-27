package pe.edu.cibertec.APIRESTEC2BeLuFerMau.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.APIRESTEC2BeLuFerMau.model.bd.Autor;
import pe.edu.cibertec.APIRESTEC2BeLuFerMau.repository.AutorRepository;

@AllArgsConstructor
@Service
public class AutorService implements IAutorService{
    private AutorRepository autorRepository;

    @Override
    public Autor registrarAutor(Autor autor) {
        return autorRepository.save(autor);
    }
}


