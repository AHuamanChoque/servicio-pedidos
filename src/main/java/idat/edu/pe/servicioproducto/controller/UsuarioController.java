package idat.edu.pe.servicioproducto.controller;

import idat.edu.pe.servicioproducto.model.Reservas;
import org.springframework.jms.core.JmsTemplate;
import idat.edu.pe.servicioproducto.model.Usuarios;
import idat.edu.pe.servicioproducto.model.dto.UsuarioDto;
import idat.edu.pe.servicioproducto.model.dto.UsuarioDtoRegistro;
import idat.edu.pe.servicioproducto.service.IHabitacionesService;
import idat.edu.pe.servicioproducto.service.IUsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private IUsuarioService iUsuarioService;

    @GetMapping("/listar")
    @ResponseBody
    public List<Usuarios> getUsuarios(){
        return iUsuarioService.getUsuarios();
    }

    @GetMapping("/listar/{id}")
    @ResponseBody
    public Usuarios obtenerUsuariosbyId(@PathVariable("id") Integer idusuario) {
        return iUsuarioService.obtenerUsuarioId(idusuario);
    }


    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestBody UsuarioDto usuarioDto) {
        Usuarios usuario = iUsuarioService.autenticarUsuario(usuarioDto);
        if (usuario != null && usuario.getActivo()) {
            return "Login exitoso. Bienvenido, " + usuario.getNombres() + "!";
        } else {
            return "Credenciales inválidas o usuario inactivo.";
        }
    }
    private final JmsTemplate jmsTemplate;


    @PostMapping("/registrar")
    public ResponseEntity<?> registrarUsuario(@RequestBody UsuarioDtoRegistro usuarioDtoRegistro) {
        try {
            Usuarios nuevoUsuario = iUsuarioService.registrarUsuario(usuarioDtoRegistro);
            return ResponseEntity.ok(nuevoUsuario);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
