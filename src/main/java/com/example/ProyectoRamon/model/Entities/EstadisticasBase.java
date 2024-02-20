package com.example.ProyectoRamon.model.Entities;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "EstadisticasBase")
public class EstadisticasBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer vida;

    @Column
    private Integer daño;

    @Column
    private Integer velocidad;

    @Column
    private Integer velocidadAtaque;

    @Column
    private Integer suerte;

    public EstadisticasBase(Integer id, Integer vida, Integer daño, Integer velocidad, Integer velocidadAtaque, Integer suerte) {
        this.id = id;
        this.vida = vida;
        this.daño = daño;
        this.velocidad = velocidad;
        this.velocidadAtaque = velocidadAtaque;
        this.suerte = suerte;
    }

    public EstadisticasBase() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getDaño() {
        return daño;
    }

    public void setDaño(Integer daño) {
        this.daño = daño;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public Integer getVelocidadAtaque() {
        return velocidadAtaque;
    }

    public void setVelocidadAtaque(Integer velocidadAtaque) {
        this.velocidadAtaque = velocidadAtaque;
    }

    public Integer getSuerte() {
        return suerte;
    }

    public void setSuerte(Integer suerte) {
        this.suerte = suerte;
    }
}