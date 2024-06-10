package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "SEDE")
@Data
@NoArgsConstructor
public class Sede {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "ANIO_APERTURA")
    private String anio_apertura;

    @Column(name = "NUM_MATRICULADOS")
    private int num_matriculados;

    @Column(name = "NUM_PROFESORES")
    private int num_profesores;
}
