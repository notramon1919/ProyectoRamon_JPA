package com.example.ProyectoRamon.model.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="authorities")
public class Authority {
    @Id
    public String username;
    public String authority;
}
