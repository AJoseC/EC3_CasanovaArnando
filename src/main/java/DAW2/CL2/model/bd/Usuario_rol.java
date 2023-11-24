package DAW2.CL2.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usuario_rol")
public class Usuario_rol {
    @Id
    @ManyToOne
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    private Usuario usuario;

    @Id
    @ManyToOne
    @JoinColumn(name = "idrol", referencedColumnName = "idrol")
    private Rol rol;
}
