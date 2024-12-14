package idat.edu.pe.servicioproducto.controller;

import idat.edu.pe.servicioproducto.model.Habitaciones;
import idat.edu.pe.servicioproducto.service.IHabitacionesService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/habitacion")
public class HabitacionController {

    private IHabitacionesService iHabitacionesService;

    @GetMapping("/listar")
    @ResponseBody //cuando devuelves un arreglo que no es una vista!
    public List<Habitaciones> getHabitaciones(){
        return iHabitacionesService.getHabitaciones();
    }

    @GetMapping("/listar/{id}")
    @ResponseBody
    public Habitaciones obtenerHabitacionbyId(@PathVariable("id") Integer idhabitacion) {
        return iHabitacionesService.obtenerHabitacionId(idhabitacion);
    }
}
