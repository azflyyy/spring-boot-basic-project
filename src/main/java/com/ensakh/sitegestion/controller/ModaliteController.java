package com.ensakh.sitegestion.controller;

import com.ensakh.sitegestion.service.ModaliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ModaliteController {
    @Autowired
    private ModaliteService modaliteService;

    public ModaliteController(ModaliteService filliereService) {
        this.modaliteService = modaliteService;
    }


    @GetMapping("/modalite")
    public String listModalite(Model model) {
        model.addAttribute("listModalite", modaliteService.getAll());
        return "Modalite";

    }

}
