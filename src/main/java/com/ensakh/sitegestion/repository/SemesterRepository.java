package com.ensakh.sitegestion.repository;
import com.ensakh.sitegestion.entity.Semestre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SemesterRepository extends JpaRepository<Semestre,String> {
}
