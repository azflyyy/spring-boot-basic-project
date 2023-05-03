package com.ensakh.sitegestion.entity;

import javax.persistence.*;

@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ide", nullable = false)
    private Long  ide;
    @Column (name="nom" , nullable=false)
    private String nom ;
    @Column (name="prenom" , nullable=false)
    private String prenom ;
    @ManyToOne
    @JoinColumn(name="filliere_etud")
    private Filliere fill ;


    public Etudiant() {
    }
    public Etudiant(Long ide , String nom , String prenom) {
        this.ide=ide ;
        this.nom=nom;
        this.prenom=prenom;

    }

    public Long getIde() {
        return ide;
    }

    public void setIde(Long ide) {
        this.ide = ide;
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
}