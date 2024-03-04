package com.example.ProyectoRamon.controller;

import com.example.ProyectoRamon.model.Entities.*;
import com.example.ProyectoRamon.model.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@CrossOrigin(origins = "*")
@RestController
public class ControllerLlistes {

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private PersonajeRepository personajeRepository;
    @Autowired
    private EstadisticasBaseRepository estadisticasBaseRepository;
    @Autowired
    private DesbloqueoPersonajeRepository desbloqueoPersonajeRepository;
    @Autowired
    private PersonajeEstadisticasBaseRepository personajeEstadisticasBaseRepository;

    @GetMapping("/items")
    public List<Items> sacarItems() {
        return (List<Items>) itemRepository.findAll();
    }

    @GetMapping("/personajes")
    public List<Personaje> sacarPersonajes() {
        return (List<Personaje>) personajeRepository.findAll();
    }

    @GetMapping("/estadisticasBase")
    public List<EstadisticasBase> sacarEstadisticasBase() {
        return (List<EstadisticasBase>) estadisticasBaseRepository.findAll();
    }

    @GetMapping("/desbloqueoPersonaje")
    public List<DesbloqueoPersonaje> sacarDesbloqueos() {
        return (List<DesbloqueoPersonaje>) desbloqueoPersonajeRepository.findAll();
    }

    @GetMapping("/personajeEstadisticasBase")
    public List<PersonajeEstadisticasBase> sacarPersonajeEstadisticas() {
        return (List<PersonajeEstadisticasBase>) personajeEstadisticasBaseRepository.findAll();
    }









}
