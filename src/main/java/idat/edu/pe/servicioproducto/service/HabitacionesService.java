package idat.edu.pe.servicioproducto.service;

import idat.edu.pe.servicioproducto.model.Habitaciones;
import idat.edu.pe.servicioproducto.repository.HabitacionesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HabitacionesService implements IHabitacionesService{

    private HabitacionesRepository habitacionesRepository;
    @Override
    public List<Habitaciones> getHabitaciones() {
        return habitacionesRepository.findAll();
    }

    @Override
    public Habitaciones obtenerHabitacionId(Integer idhabitacion) {
        return habitacionesRepository.findById(idhabitacion).orElse(null);
    }
}
