package com.MalcaSuarezYosthinSebastian.infraccionservice.entity;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Entity
@Table(name = "infracciones")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Infraccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 8)
    private String dni;

    @Column(nullable = false)
    private LocalDateTime fecha;

    @Column(name = "tipo_infraccion", nullable = false, length = 20)
    private String tipoInfraccion;

    @Column(nullable = false, length = 200)
    private String ubicacion;

    @Column(length = 255)
    private String descripcion;

    @Column(name = "monto_multa", precision = 8, scale = 2)
    private BigDecimal montoMulta;

    @Column(nullable = false, length = 20)
    private String estado;
}