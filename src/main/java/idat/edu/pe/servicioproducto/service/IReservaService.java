package idat.edu.pe.servicioproducto.service;

import idat.edu.pe.servicioproducto.model.Categoria;
import idat.edu.pe.servicioproducto.model.Reservas;
import idat.edu.pe.servicioproducto.model.dto.ReservaDto;

import java.util.List;

public interface IReservaService {

    public List<Reservas> getReservas();

    Reservas obtenerResevaId(Integer idreserva);

    Reservas registrarReserva(ReservaDto reservaDto);


}
