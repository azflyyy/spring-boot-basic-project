package com.ensakh.sitegestion.repository;
import com.ensakh.sitegestion.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Integer> {
}
