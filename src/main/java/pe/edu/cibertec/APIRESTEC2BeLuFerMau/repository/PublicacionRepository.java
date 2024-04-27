package pe.edu.cibertec.APIRESTEC2BeLuFerMau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.APIRESTEC2BeLuFerMau.model.bd.Publicacion;

@Repository
public interface PublicacionRepository
        extends JpaRepository<Publicacion, Integer> {
}
