package idat.edu.pe.servicioproducto.repository;

import idat.edu.pe.servicioproducto.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios,Integer> {

    Optional<Usuarios> findByNomusuarioAndContraseña(String nomusuario, String contraseña);

    boolean existsByNomusuario(String nomusuario);
}
