package idat.edu.pe.servicioproducto.model.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
public class ReservaDto {
    private Integer idusuario;
    private Integer idhabitacion;
    private String fechainicio;
    private String fechafin;
    private Double totalpago;
    private Integer nhuespedes;
}
