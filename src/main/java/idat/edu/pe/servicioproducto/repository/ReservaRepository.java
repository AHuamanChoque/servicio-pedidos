package idat.edu.pe.servicioproducto.repository;

import idat.edu.pe.servicioproducto.model.Reservas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends JpaRepository<Reservas,Integer> {


}
