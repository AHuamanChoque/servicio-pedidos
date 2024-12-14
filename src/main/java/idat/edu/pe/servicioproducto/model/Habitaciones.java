package idat.edu.pe.servicioproducto.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "habitaciones")
public class Habitaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idhabitacion;
    private String numerohabitacion;
    private String descripcion;
    private Double preciopornoche;
    private Integer estado;
    @ManyToOne
    @JoinColumn(name="idcategoria")
    private Categoria categoria;

}
