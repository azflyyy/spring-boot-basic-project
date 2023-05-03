package com.ensakh.sitegestion.controller ;
import com.ensakh.sitegestion.service.FilliereService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FilliereController {
    private FilliereService  filliereService;

    public FilliereController(FilliereService filliereService) {
        this.filliereService = filliereService;
    }


    @GetMapping("/Filliere")
    public String listFilliere(Model model) {
        model.addAttribute("listFillieres", filliereService.getAll());
        System.out.println(filliereService.getAll());
        return "Filliere";

    }

}
