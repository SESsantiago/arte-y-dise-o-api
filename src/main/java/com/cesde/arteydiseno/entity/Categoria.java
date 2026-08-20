package com.cesde.arteydiseno.entity;

import com.cesde.arteydiseno.model.BaseEntity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Categoria extends BaseEntity {

    @Column(nullable = false, unique = true, length = 80)
    private String nombre;

    @Column(length = 255)
    private String descripcion;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;
}
