package DAW2.CL2.repository;

import DAW2.CL2.model.bd.Rol;
import DAW2.CL2.model.bd.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol, Integer>{

    Usuario findByEmail(String email);
    Rol findByNomrol(String nomrol);
}
