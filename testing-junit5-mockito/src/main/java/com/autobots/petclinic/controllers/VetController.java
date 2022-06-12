package com.autobots.petclinic.controllers;

import com.autobots.petclinic.fauxspring.Model;
import com.autobots.petclinic.services.VetService;

public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    public String listVets(Model model){

        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }
}
