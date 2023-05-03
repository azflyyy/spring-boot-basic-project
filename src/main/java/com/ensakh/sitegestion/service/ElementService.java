package com.ensakh.sitegestion.service;

import com.ensakh.sitegestion.entity.Element;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ElementService {
    List<Element> getAll();
    void saveElement(Element employee);

    Element getElementById(long id);

    void deleteElementById(long id);

    Page<Element> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
