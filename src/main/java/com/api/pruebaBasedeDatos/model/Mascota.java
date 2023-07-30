package com.api.pruebaBasedeDatos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String especie;
    private String color;

    public Mascota() {
    }

    public Mascota(Long id, String nombre, String especie, String color) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.color = color;
    }
}
