package DAW2.CL2.repository;

import DAW2.CL2.model.bd.Rol;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol, Integer>{


    Rol findByNomrol(String nomrol);
}
