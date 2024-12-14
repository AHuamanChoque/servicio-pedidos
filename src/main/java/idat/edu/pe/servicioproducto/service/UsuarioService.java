package idat.edu.pe.servicioproducto.service;

import idat.edu.pe.servicioproducto.model.Usuarios;
import idat.edu.pe.servicioproducto.model.dto.UsuarioDto;
import idat.edu.pe.servicioproducto.model.dto.UsuarioDtoRegistro;
import idat.edu.pe.servicioproducto.repository.ReservaRepository;
import idat.edu.pe.servicioproducto.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioService implements IUsuarioService {

    private UsuarioRepository usuarioRepository;
    @Override
    public List<Usuarios> getUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuarios obtenerUsuarioId(Integer idususario) {
        return usuarioRepository.findById(idususario).orElse(null);
    }

    @Override
    public Usuarios autenticarUsuario(UsuarioDto usuarioDto) {
        return usuarioRepository.findByNomusuarioAndContraseña(usuarioDto.getNomusuario(), usuarioDto.getContraseña()).orElse(null);
    }

    @Override
    public Usuarios registrarUsuario(UsuarioDtoRegistro usuarioDtoRegistro) {
        // Validar que el usuario no exista previamente
        if (usuarioRepository.existsByNomusuario(usuarioDtoRegistro.getNomusuario())) {
            throw new RuntimeException("El nombre de usuario ya existe.");
        }

        // Crear una nueva instancia de Usuarios y establecer los valores manualmente
        Usuarios nuevoUsuario = new Usuarios();
        nuevoUsuario.setNombres(usuarioDtoRegistro.getNombres());
        nuevoUsuario.setApellidos(usuarioDtoRegistro.getApellidos());
        nuevoUsuario.setNomusuario(usuarioDtoRegistro.getNomusuario());
        nuevoUsuario.setContraseña(usuarioDtoRegistro.getContraseña()); // Reemplazar con cifrado en un caso real
        nuevoUsuario.setEmail(usuarioDtoRegistro.getEmail());
        nuevoUsuario.setCelular(usuarioDtoRegistro.getCelular());
        nuevoUsuario.setDNI(usuarioDtoRegistro.getDNI());
        nuevoUsuario.setEdad(usuarioDtoRegistro.getEdad());
        nuevoUsuario.setActivo(true); // Los usuarios nuevos están activos por defecto

        return usuarioRepository.save(nuevoUsuario);
    }
}
