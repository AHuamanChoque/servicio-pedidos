package idat.edu.pe.servicioproducto.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioDtoRegistro {
    private String nombres;
    private String apellidos;
    private String nomusuario;
    private String contraseña;
    private String email;
    private String celular;
    private String DNI;
    private int edad;
}
