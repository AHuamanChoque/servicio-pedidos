package idat.edu.pe.servicioproducto.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "reservas")
public class Reservas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idreserva;

    @ManyToOne
    @JoinColumn(name="idusuario")
    private Usuarios usuarios;
    @ManyToOne
    @JoinColumn(name="idhabitacion")
    private Habitaciones habitaciones;
    private String fechainicio;
    private String fechafin;
    private Double totalpago;
    private Integer nhuespedes;
}
