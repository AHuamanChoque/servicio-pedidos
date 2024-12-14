package idat.edu.pe.servicioproducto.service;

import idat.edu.pe.servicioproducto.model.Categoria;
import idat.edu.pe.servicioproducto.model.Usuarios;
import idat.edu.pe.servicioproducto.model.dto.UsuarioDto;
import idat.edu.pe.servicioproducto.model.dto.UsuarioDtoRegistro;

import java.util.List;

public interface IUsuarioService {

    public List<Usuarios> getUsuarios();

    Usuarios obtenerUsuarioId(Integer idususario);

    Usuarios autenticarUsuario(UsuarioDto usuarioDto);

    Usuarios registrarUsuario(UsuarioDtoRegistro usuarioDtoRegistro);
}
