package idat.edu.pe.servicioproducto.service;

import idat.edu.pe.servicioproducto.model.Categoria;
import idat.edu.pe.servicioproducto.model.Habitaciones;

import java.util.List;

public interface ICategoriaService {

    public List<Categoria> getCategorias();

    Categoria obtenerCategoriaId(Integer idcategoria);
}
