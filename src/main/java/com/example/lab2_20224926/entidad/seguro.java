package com.example.lab2_20224926.entidad;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "seguro")
public class seguro {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idseguro", nullable = false)
    private Integer id;

    @Column(name = "empresa_aseguradora", length = 45)
    private String nombreAseguradora;

    @Column(name = "cobertura_maxima", length = 45)
    private Double coberturaMaxima;

    @Column(name = "tarifa")
    private Double tarifa;


}
