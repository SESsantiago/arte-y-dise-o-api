package com.cesde.arteydiseno.entity;

import com.cesde.arteydiseno.model.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Cliente extends BaseEntity {

    @Column(nullable = false, length = 100)
    private String nombreCompleto;

    @Column(nullable = false, unique = true, length = 120)
    private String correo;

    @Column(nullable = false, unique = true, length = 20)

    private String telefono;
    @OneToMany(mappedBy = "cliente")
    private List<Factura> facturas;

    @OneToMany(mappedBy = "cliente")
    private List<Reseña> resenas;

    @ManyToMany
    @JoinTable(
            name = "cliente_producto_favorito",
            joinColumns = @JoinColumn(name = "cliente_id"),
            inverseJoinColumns = @JoinColumn(name = "producto_id")
    )
    private List<Producto> productosFavoritos;
}
