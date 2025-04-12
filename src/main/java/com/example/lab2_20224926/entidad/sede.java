package com.example.lab2_20224926.entidad;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sede")
public class sede {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsede", nullable = false)
    private Integer id;

    @Column(name = "distrito", length = 45)
    private String distrito;

    @Column(name = "direccion", length = 200)
    private String direccion;


}
