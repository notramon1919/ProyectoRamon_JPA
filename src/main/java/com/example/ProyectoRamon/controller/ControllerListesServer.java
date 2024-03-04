package com.example.ProyectoRamon.controller;

import com.example.ProyectoRamon.model.Entities.Items;
import com.example.ProyectoRamon.model.Entities.Personaje;
import com.example.ProyectoRamon.model.repositories.ItemRepository;
import com.example.ProyectoRamon.model.repositories.PersonajeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ControllerListesServer {
    private final PersonajeRepository personajeRepository;
    private final ItemRepository itemRepository;

    public ControllerListesServer(
            PersonajeRepository personajeRepository,
            ItemRepository itemRepository) {
        this.personajeRepository = personajeRepository;
        this.itemRepository = itemRepository;
    }

    @GetMapping("/personajes")
    public String llistarPersonajes(Model model) {
        Iterable<Personaje> personajes = personajeRepository.findAll();
        model.addAttribute("nomEntitat", "Personajes");
        model.addAttribute("entitat", personajes);
        return "LlistatGeneral";
    }

    @GetMapping("/items")
    public String llistarItems(Model model) {
        Iterable<Items> items = itemRepository.findAll();
        model.addAttribute("nomEntitat", "Items");
        model.addAttribute("entitat", items);
        return "LlistatGeneral";
    }

}
