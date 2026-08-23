package com.cesde.arteydiseno.model.embeddable;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable

public class DireccionEnvio {
    @Column(nullable = false, length = 100)
    private String calle;

    @Column(nullable = false, length = 60)
    private String ciudad;

    @Column(nullable = false, length = 60)
    private String departamento;

    @Column(nullable = false, length = 20)
    private String codigoPostal;
}
