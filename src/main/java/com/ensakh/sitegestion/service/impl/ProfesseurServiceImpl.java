package com.ensakh.sitegestion.service.impl;

import com.ensakh.sitegestion.entity.Professeur;
import com.ensakh.sitegestion.repository.ProfesseurRepository;
import com.ensakh.sitegestion.service.ProfesseurService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ProfesseurServiceImpl implements ProfesseurService {
    private ProfesseurRepository professeurRepository;

    public ProfesseurServiceImpl(ProfesseurRepository professeurRepository) {
        this.professeurRepository = professeurRepository;
    }

    @Override
    public List<Professeur> getAll() {
        return professeurRepository.findAll();
    }
}

