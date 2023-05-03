package com.ensakh.sitegestion.entity;

import javax.persistence.*;
import java.util.List;
@Table(name="Filliere")

@Entity
public class Filliere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name="nom" , nullable = false)
    private String nom ;
    @OneToMany(mappedBy="fill",fetch= FetchType.LAZY)
    private List<Etudiant> etudiants ;
    @OneToMany(mappedBy="fill1",fetch= FetchType.LAZY)
    private List<Module> modules ;

    public Filliere( String nom)  {
        this.nom=nom;
    }

    public Filliere() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
