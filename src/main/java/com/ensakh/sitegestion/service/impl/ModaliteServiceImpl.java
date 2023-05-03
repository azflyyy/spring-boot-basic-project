package com.ensakh.sitegestion.service.impl;


import com.ensakh.sitegestion.entity.Modalite;
import com.ensakh.sitegestion.repository.ModaliteRepository;
import com.ensakh.sitegestion.service.ModaliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ModaliteServiceImpl implements ModaliteService {
    @Autowired
    private ModaliteRepository modaliteRepository;

    public ModaliteServiceImpl(ModaliteRepository filliereRepository) {
        this.modaliteRepository = filliereRepository;
    }

    @Override
    public List<Modalite> getAll() {
        return modaliteRepository.findAll();
    }
}