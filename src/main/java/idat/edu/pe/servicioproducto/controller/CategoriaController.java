package idat.edu.pe.servicioproducto.controller;

import idat.edu.pe.servicioproducto.model.Categoria;
import idat.edu.pe.servicioproducto.model.Habitaciones;
import idat.edu.pe.servicioproducto.service.ICategoriaService;
import idat.edu.pe.servicioproducto.service.IHabitacionesService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    private ICategoriaService iCategoriaService;


    @GetMapping("/listar")
    @ResponseBody //cuando devuelves un arreglo que no es una vista!
    public List<Categoria> getCategorias(){
        return iCategoriaService.getCategorias();
    }

    @GetMapping("/listar/{id}")
    @ResponseBody
    public Categoria obtenerCategoriaId(@PathVariable("id") Integer idcategoria) {
        return iCategoriaService.obtenerCategoriaId(idcategoria);
    }

}
