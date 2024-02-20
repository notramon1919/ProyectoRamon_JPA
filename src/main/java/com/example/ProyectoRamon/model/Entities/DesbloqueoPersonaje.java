package com.example.ProyectoRamon.model.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "DesbloqueoPersonaje")
public class DesbloqueoPersonaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String requerimiento;

    @Column
    private Integer nivelNecesario;

    @OneToOne
    @JoinColumn(name = "id")
    private Personaje personaje;

    public DesbloqueoPersonaje(Long id, String requerimiento, Integer nivelNecesario, Personaje personaje) {
        this.id = id;
        this.requerimiento = requerimiento;
        this.nivelNecesario = nivelNecesario;
        this.personaje = personaje;
    }

    public DesbloqueoPersonaje() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(String requerimiento) {
        this.requerimiento = requerimiento;
    }

    public Integer getNivelNecesario() {
        return nivelNecesario;
    }

    public void setNivelNecesario(Integer nivelNecesario) {
        this.nivelNecesario = nivelNecesario;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }
}
