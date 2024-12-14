package idat.edu.pe.servicioproducto.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import idat.edu.pe.servicioproducto.model.Habitaciones;
import idat.edu.pe.servicioproducto.model.Reservas;
import idat.edu.pe.servicioproducto.model.dto.ReservaDto;
import idat.edu.pe.servicioproducto.service.IHabitacionesService;
import idat.edu.pe.servicioproducto.service.IReservaService;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessageOperations;
import org.springframework.jms.core.JmsTemplate;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/reservas")
public class ReservaController {

    private final ObjectMapper objectMapper;
    private IReservaService iReservaService;


    @GetMapping("/listar")
    @ResponseBody
    public List<Reservas> getReservas(){
        return iReservaService.getReservas();
    }

    @GetMapping("/listar/{id}")
    @ResponseBody
    public Reservas obtenerReservabyId(@PathVariable("id") Integer idreserva) {
        return iReservaService.obtenerResevaId(idreserva);
    }



    @PostMapping("/registrar")
    @ResponseBody
    public ResponseEntity<Reservas> registrarReserva(@RequestBody ReservaDto reservaDto) {
        try {
            Reservas nuevaReserva = iReservaService.registrarReserva(reservaDto);
            System.out.println("Registrando reserva: " + nuevaReserva);


            return ResponseEntity.ok(nuevaReserva);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

}
