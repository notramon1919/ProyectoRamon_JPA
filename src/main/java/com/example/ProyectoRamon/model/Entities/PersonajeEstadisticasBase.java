package com.example.ProyectoRamon.model.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Personaje_EstadisticasBase")
public class PersonajeEstadisticasBase {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "personajeId")
    private Personaje personaje;

    @ManyToOne
    @JoinColumn(name = "estadisticasBaseId")
    private EstadisticasBase estadisticasBase;

    public PersonajeEstadisticasBase(Long id, Personaje personaje, EstadisticasBase estadisticasBase) {
        this.id = id;
        this.personaje = personaje;
        this.estadisticasBase = estadisticasBase;
    }

    public PersonajeEstadisticasBase() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public EstadisticasBase getEstadisticasBase() {
        return estadisticasBase;
    }

    public void setEstadisticasBase(EstadisticasBase estadisticasBase) {
        this.estadisticasBase = estadisticasBase;
    }
}
