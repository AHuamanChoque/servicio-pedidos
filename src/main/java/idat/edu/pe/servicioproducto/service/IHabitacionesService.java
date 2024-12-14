package idat.edu.pe.servicioproducto.service;

import idat.edu.pe.servicioproducto.model.Habitaciones;

import java.util.List;

public interface IHabitacionesService {
    public List<Habitaciones> getHabitaciones();

    Habitaciones obtenerHabitacionId(Integer idhabitacion);
}
