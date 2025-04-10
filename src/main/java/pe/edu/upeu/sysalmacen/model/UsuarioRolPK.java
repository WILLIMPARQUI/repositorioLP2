package pe.edu.upeu.sysalmacen.model;

import jakarta.persistence.*;
import lombok.*;

@Embeddable
@EqualsAndHashCode
public class UsuarioRolPK {
    @ManyToOne
    @JoinColumn (name = "usuario_id")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Rol rol;
}

