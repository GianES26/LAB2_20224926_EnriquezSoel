package com.example.lab2_20224926.entidad;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "auto")
public class auto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idauto", nullable = false)
    private Integer id;

    @Column(name = "modelo", length = 45)
    private String modelo;

    @Column(name = "color", length = 45)
    private String color;

    @Column(name = "kilometraje", length = 45)
    private String kilometraje;

    @ManyToOne
    @JoinColumn(name = "sede_idsede")
    private sede sede;

    @Column(name = "costo_por_dia")
    private Double costoPorDia;

}
