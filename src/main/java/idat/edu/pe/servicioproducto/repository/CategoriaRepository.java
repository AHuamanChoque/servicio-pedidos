package idat.edu.pe.servicioproducto.repository;

import idat.edu.pe.servicioproducto.model.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {
}
