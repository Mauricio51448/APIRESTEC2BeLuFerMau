package pe.edu.cibertec.APIRESTEC2BeLuFerMau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.APIRESTEC2BeLuFerMau.model.bd.Autor;

@Repository
public interface AutorRepository
        extends JpaRepository<Autor, Integer> {
}
