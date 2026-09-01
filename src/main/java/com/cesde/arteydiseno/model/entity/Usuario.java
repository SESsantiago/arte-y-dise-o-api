package com.cesde.arteydiseno.model.entity;

import com.cesde.arteydiseno.model.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Usuario extends BaseEntity {

    @Column(nullable = false, unique = true, length = 120)
    private String email;

    @Column(nullable = false)
    private String passwordHash;

    @Column(nullable = false, length = 30)
    private String rol;

    @OneToOne
    @JoinColumn(name = "cliente_id", unique = true)
    private Cliente cliente;
}