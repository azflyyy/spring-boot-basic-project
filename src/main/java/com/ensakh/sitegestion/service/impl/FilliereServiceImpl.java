package com.ensakh.sitegestion.service.impl;


import com.ensakh.sitegestion.entity.Filliere;
import com.ensakh.sitegestion.repository.FilliereRepository;
import com.ensakh.sitegestion.service.FilliereService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class FilliereServiceImpl implements FilliereService {
    private FilliereRepository filliereRepository;

    public FilliereServiceImpl(FilliereRepository filliereRepository) {
        this.filliereRepository = filliereRepository;
    }

    @Override
    public List<Filliere> getAll() {
        return filliereRepository.findAll();
    }
}