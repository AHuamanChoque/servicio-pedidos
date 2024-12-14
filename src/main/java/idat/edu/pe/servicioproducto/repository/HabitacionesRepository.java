package idat.edu.pe.servicioproducto.repository;

import idat.edu.pe.servicioproducto.model.Habitaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitacionesRepository extends JpaRepository<Habitaciones,Integer> {


}
