package com.cesde.arteydiseno.model.entity;

import com.cesde.arteydiseno.model.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class DetalleFactura extends BaseEntity {

    @Column(nullable = false)
    private Integer cantidad;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal precioUnitario;

    @ManyToOne
    @JoinColumn(name = "pedido_id", nullable = false)
    private Factura factura;

    @ManyToOne
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto producto;
}