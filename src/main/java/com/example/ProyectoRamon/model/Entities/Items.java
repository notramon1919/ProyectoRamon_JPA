package com.example.ProyectoRamon.model.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Items")
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idPersonaje")
    private Personaje personaje;

    @Column
    private String nombre;

    @Column
    private Integer calidad;

    @Column
    private String urlImagen;

    public Items(Long id, Personaje personaje, String nombre, Integer calidad, String urlImagen) {
        this.id = id;
        this.personaje = personaje;
        this.nombre = nombre;
        this.calidad = calidad;
        this.urlImagen = urlImagen;
    }

    public Items() {
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCalidad() {
        return calidad;
    }

    public void setCalidad(Integer calidad) {
        this.calidad = calidad;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
}