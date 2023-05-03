package com.ensakh.sitegestion.service.impl;

import com.ensakh.sitegestion.entity.Element;

import com.ensakh.sitegestion.entity.Element;
import com.ensakh.sitegestion.repository.ElementRepository;
import com.ensakh.sitegestion.service.ElementService;
import com.ensakh.sitegestion.service.FilliereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ElementServiceImpl implements ElementService {
    @Autowired
    private ElementRepository elementRepository;

    public ElementServiceImpl(ElementRepository elementRepository) {
        this.elementRepository = elementRepository;
    }

    @Override
    public List<Element> getAll() {
        return elementRepository.findAll();
    }

    @Override
    public void saveElement(Element element) {
        this.elementRepository.save(element);

    }

    @Override
    public Element getElementById(long id) {
        Optional<Element> optional = elementRepository.findById(id);
        Element element = null;
        if (optional.isPresent()) {
            element = optional.get();
        } else {
            throw new RuntimeException(" Element not found for id :: " + id);
        }
        return element;
    }

    @Override
    public void deleteElementById(long id) {
        this.elementRepository.deleteById(id);
    }

    @Override
    public Page<Element> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
                Sort.by(sortField).descending();

        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
        return this.elementRepository.findAll(pageable);
    }
}
