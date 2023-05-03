package com.ensakh.sitegestion.repository;
import com.ensakh.sitegestion.entity.Module;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleRepository extends JpaRepository<Module,Long> {
}
