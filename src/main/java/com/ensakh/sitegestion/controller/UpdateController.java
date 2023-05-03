package com.ensakh.sitegestion.controller;

import com.ensakh.sitegestion.entity.Element;
import com.ensakh.sitegestion.service.ElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UpdateController {

    @Autowired
    private ElementService elementService;

    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model) {
        // create model attribute to bind form data
        Element element = new Element();
        model.addAttribute("element", element);
        return "new_employee";
    }

    @PostMapping("/saveElement")
    public String saveEmployee(@ModelAttribute("element") Element employee) {
        // save employee to database
        elementService.saveElement(employee);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

        // get employee from the service
        Element element = elementService.getElementById(id);

        // set employee as a model attribute to pre-populate the form
        model.addAttribute("element", element);
        return "update_employee";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteElement(@PathVariable(value = "id") long id) {

        // call delete employee method
        this.elementService.deleteElementById(id);
        return "redirect:/";
    }


    @GetMapping("/page/{pageNo}")
    public String findPaginated(@PathVariable(value = "pageNo") int pageNo,
                                @RequestParam("sortField") String sortField,
                                @RequestParam("sortDir") String sortDir,
                                Model model) {
        int pageSize = 5;

        Page<Element> page = elementService.findPaginated(pageNo, pageSize, sortField, sortDir);
        List<Element> listEmployees = page.getContent();

        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());

        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDir", sortDir);
        model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");

        model.addAttribute("listEmployees", listEmployees);
        return "index";
    }

}
