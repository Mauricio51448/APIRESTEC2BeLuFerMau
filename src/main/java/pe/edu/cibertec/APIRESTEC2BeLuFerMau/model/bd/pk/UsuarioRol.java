package pe.edu.cibertec.APIRESTEC2BeLuFerMau.model.bd.pk;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UsuarioRol {

    @Id
    private Integer idUsuario;

    @ManyToOne
    @JoinColumn(name = "idrol")
    private Rol rol;

}
