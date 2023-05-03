package com.ensakh.sitegestion.entity;

import javax.persistence.*;
import java.util.List;
@Table(name="Professeur")

@Entity
public class Professeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "nom_prof",nullable = false)
    private String nom;
    @Column(name = "prenom_prof",nullable = false)
    private String prenom;
    @Column(name = "code_prof",nullable = false)
    private String code;
    @Column(name = "spec_prof",nullable = false)
    private String specialite;
    @OneToMany(mappedBy="p",fetch= FetchType.LAZY)
    private List<Element> Elements;


    public Professeur() {
    }

    public Professeur(String nom, String prenom, String code, String specialite) {
        this.nom = nom;
        this.prenom = prenom;
        this.code = code;
        this.specialite = specialite;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

}
