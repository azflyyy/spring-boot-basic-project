package com.ensakh.sitegestion.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Idm", nullable = false)
    private Long Idm;
    @Column(name="nom" , nullable=false)
    private String nom ;
    @ManyToOne
    @JoinColumn(name="filliere_module")
    private Filliere fill1 ;
    @OneToMany(mappedBy="module01",fetch= FetchType.LAZY)
    private List<Element> elements02 ;
    @ManyToOne
    @JoinColumn(name="Semestre")
    private Semestre s ;


    public Module(Long Idm , String nom) {
        this.Idm = Idm;
        this.nom=nom;
    }

    public Module() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getIdm() {
        return Idm;
    }
}
