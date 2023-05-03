package com.ensakh.sitegestion.repository;

import com.ensakh.sitegestion.entity.Element;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElementRepository extends JpaRepository<Element,Long> {
}
