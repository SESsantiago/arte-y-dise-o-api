package com.cesde.arteydiseno.model.entity;

import com.cesde.arteydiseno.model.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class MetodosPago extends BaseEntity {

    @Column(nullable = false, unique = true, length = 50)
    private String nombre;

    @Column(nullable = false)
    private Boolean activo;

    @OneToMany(mappedBy = "metodoPago")
    private List<Pagos> pagos;
}