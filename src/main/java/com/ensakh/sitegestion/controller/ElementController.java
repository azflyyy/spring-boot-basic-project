package com.ensakh.sitegestion.controller;

import com.ensakh.sitegestion.service.ElementService;
import com.ensakh.sitegestion.service.FilliereService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ElementController {
    private ElementService elementService;

    public ElementController(ElementService elementService) {
        this.elementService = elementService;
    }


    @GetMapping("/element")
    public String listElements(Model model) {
        model.addAttribute("listElements", elementService.getAll());
        System.out.println(elementService.getAll());
        return "Module";

    }


}
