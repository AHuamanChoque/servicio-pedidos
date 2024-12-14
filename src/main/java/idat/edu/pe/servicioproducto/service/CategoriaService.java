package idat.edu.pe.servicioproducto.service;

import idat.edu.pe.servicioproducto.model.Categoria;
import idat.edu.pe.servicioproducto.model.Habitaciones;
import idat.edu.pe.servicioproducto.repository.CategoriaRepository;
import idat.edu.pe.servicioproducto.repository.HabitacionesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoriaService implements ICategoriaService {

    private CategoriaRepository categoriaRepository;


    @Override
    public List<Categoria> getCategorias() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria obtenerCategoriaId(Integer idcategoria) {
        return categoriaRepository.findById(idcategoria).orElse(null);
    }
}
