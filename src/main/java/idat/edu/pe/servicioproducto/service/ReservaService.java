package idat.edu.pe.servicioproducto.service;

import idat.edu.pe.servicioproducto.model.Habitaciones;
import idat.edu.pe.servicioproducto.model.Reservas;
import idat.edu.pe.servicioproducto.model.Usuarios;
import idat.edu.pe.servicioproducto.model.dto.ReservaDto;
import idat.edu.pe.servicioproducto.repository.HabitacionesRepository;
import idat.edu.pe.servicioproducto.repository.ReservaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ReservaService implements IReservaService{

    private ReservaRepository reservaRepository;
    @Override
    public List<Reservas> getReservas() {
        return reservaRepository.findAll();
    }

    @Override
    public Reservas obtenerResevaId(Integer idreserva) {
        return reservaRepository.findById(idreserva).orElse(null);
    }

    @Override
    public Reservas registrarReserva(ReservaDto reservaDto) {
        Reservas nuevaReserva = new Reservas();
        nuevaReserva.setFechainicio(reservaDto.getFechainicio());
        nuevaReserva.setFechafin(reservaDto.getFechafin());
        nuevaReserva.setTotalpago(reservaDto.getTotalpago());
        nuevaReserva.setNhuespedes(reservaDto.getNhuespedes());

        Habitaciones habitaciones= new Habitaciones();
        habitaciones.setIdhabitacion(reservaDto.getIdhabitacion());
        nuevaReserva.setHabitaciones(habitaciones);

        Usuarios usuarios= new Usuarios();
        usuarios.setIdusuario(reservaDto.getIdusuario());
        nuevaReserva.setUsuarios(usuarios);

        // Guardar la reserva
        return reservaRepository.save(nuevaReserva);
    }


}
