package idat.edu.pe.servicioproducto.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioDto {
    private String nomusuario;
    private String contraseña;
}
