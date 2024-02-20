package com.example.ProyectoRamon.controller;

import com.example.ProyectoRamon.model.Entities.*;
import com.example.ProyectoRamon.model.repositories.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerLlistes {
    private final PersonajeRepository personajeRepository;
    private final ItemRepository itemsRepository;
    private final DesbloqueoPersonajeRepository desbloqueoPersonajeRepository;
    private final EstadisticasBaseRepository estadisticasBaseRepository;
    private final PersonajeEstadisticasBaseRepository personajeEstadisticasBaseRepository;

    public ControllerLlistes(
            PersonajeRepository personajeRepository,
            ItemRepository itemsRepository ,
            DesbloqueoPersonajeRepository desbloqueoPersonajeRepository,
            EstadisticasBaseRepository estadisticasBaseRepository,
            PersonajeEstadisticasBaseRepository personajeEstadisticasBaseRepository
            ) {
        this.personajeRepository = personajeRepository;
        this.itemsRepository = itemsRepository;
        this.desbloqueoPersonajeRepository = desbloqueoPersonajeRepository;
        this.estadisticasBaseRepository = estadisticasBaseRepository;
        this.personajeEstadisticasBaseRepository = personajeEstadisticasBaseRepository;
    }

    @GetMapping("/personajes")
    public String llistatCiutats(Model model) {
        Iterable<Personaje> personajes = personajeRepository.findAll();
        model.addAttribute("nomEntitat", "Personajes");
        model.addAttribute("entitatList", personajes);
        return "LlistatGeneral";
    }

    @GetMapping("/items")
    public String llistatItems(Model model) {
        Iterable<Items> items = itemsRepository.findAll();
        model.addAttribute("nomEntitat", "Items");
        model.addAttribute("entitatList", items);
        return "LlistatGeneral";
    }

    @GetMapping("/desbloqueoPersonajes")
    public String desbloqueoPersonajes(Model model) {
        Iterable<DesbloqueoPersonaje> desbloqueoPersonajes = desbloqueoPersonajeRepository.findAll();
        model.addAttribute("nomEntitat", "DesbloqueosPersonajes");
        model.addAttribute("entitatList", desbloqueoPersonajes);
        return "DesbloqueoPersonajesAll";
    }

    @GetMapping("/estadisticasBase")
    public String estadisticasBase(Model model) {
        Iterable<EstadisticasBase> estadisticasBases = estadisticasBaseRepository.findAll();
        model.addAttribute("nomEntitat", "EstadisticasBase");
        model.addAttribute("entitatList", estadisticasBases);
        return "EstadisticasBaseAll";
    }

    @GetMapping("/personajeEstadisticasBase")
    public String personajeEstadisticasBase(Model model) {
        Iterable<PersonajeEstadisticasBase> personajeEstadisticasBases = personajeEstadisticasBaseRepository.findAll();
        model.addAttribute("nomEntitat", "PersonajeEstadisticasBase");
        model.addAttribute("entitatList", personajeEstadisticasBases);
        return "PersonajeEstadisticasBaseAll";
    }





}
