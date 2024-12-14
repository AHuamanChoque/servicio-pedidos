package idat.edu.pe.servicioproducto.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usuarios")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idusuario;
    private String nombres;
    private String apellidos;
    private String nomusuario;
    private String contraseña;
    private String email;
    private String celular;
    private String DNI;
    private Integer edad;
    private Boolean activo;
}
