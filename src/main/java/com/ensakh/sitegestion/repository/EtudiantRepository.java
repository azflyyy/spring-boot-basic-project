package com.ensakh.sitegestion.repository;
import com.ensakh.sitegestion.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
