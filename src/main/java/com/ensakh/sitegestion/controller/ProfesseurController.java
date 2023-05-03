package com.ensakh.sitegestion.controller;

import com.ensakh.sitegestion.entity.Professeur;
import com.ensakh.sitegestion.service.FilliereService;
import com.ensakh.sitegestion.service.ProfesseurService;
import com.ensakh.sitegestion.service.impl.ProfesseurServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProfesseurController {
    @Autowired
    private ProfesseurServiceImpl professeurServiceImpl;
    private ProfesseurService professeurService;

    public ProfesseurController(ProfesseurService professeurService) {
        this.professeurService = professeurService;
    }

    @RequestMapping("/dashboard")
    public String home(Model model) {
        return "Dashboard";

    }

    @GetMapping("/Professeur")
    public String listProfesseur(Model model) {
        model.addAttribute("listProfs", professeurService.getAll());
        System.out.println(professeurService.getAll());
        return "Professeur";

    }



}

