package DAW2.CL2.repository;

import DAW2.CL2.model.bd.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findByEmail(String email);
    Usuario findByNomusuario(String nomusuario);
}
