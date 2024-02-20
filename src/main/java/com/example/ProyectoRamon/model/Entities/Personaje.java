package com.example.ProyectoRamon.model.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Personaje")
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @Column
    private Long desbloqueoId;

    @Column
    private String urlImagen;

    public Personaje(Long id, String nombre, Long desbloqueoId, String urlImagen) {
        this.id = id;
        this.nombre = nombre;
        this.desbloqueoId = desbloqueoId;
        this.urlImagen = urlImagen;
    }

    public Personaje() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getDesbloqueoId() {
        return desbloqueoId;
    }

    public void setDesbloqueoId(Long desbloqueoId) {
        this.desbloqueoId = desbloqueoId;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
}