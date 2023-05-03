package com.ensakh.sitegestion.controller;

import com.ensakh.sitegestion.service.FilliereService;
import com.ensakh.sitegestion.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ModuleController {
    @Autowired
    private ModuleService moduleService;
    public ModuleController(ModuleService moduleService) {
        this.moduleService = moduleService;
    }



    @GetMapping("/module")
    public String listFilliere(Model model) {
        model.addAttribute("listModules", moduleService.getAll());
        System.out.println(78787878);
        return "Module";

    }
}
