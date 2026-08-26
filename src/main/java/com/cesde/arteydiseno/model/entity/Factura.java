package com.cesde.arteydiseno.model.entity;

import com.cesde.arteydiseno.model.embeddable.DireccionEnvio;
import com.cesde.arteydiseno.model.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Factura extends BaseEntity {

    @Column(nullable = false)
    private LocalDate fechaFactura;

    @Column(nullable = false, length = 30)
    private String estadoFactura;

    @Embedded
    private DireccionEnvio direccionEnvio;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "factura", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleFactura> detallesfacturas;
}