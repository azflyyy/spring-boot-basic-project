package com.ensakh.sitegestion.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Element {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idel", nullable = false)
    private Long idel;
    @Column(name="nom" , nullable =false)
    private String nom ;
    @Column(name="coefficient",nullable = false)
    private int coefficient;
    @ManyToOne
    @JoinColumn(name="professeur_elements")
    private Professeur p ;
    @OneToMany(mappedBy="elements0",fetch= FetchType.LAZY)
    private List<Modalite> modalites ;

    @ManyToOne
    @JoinColumn(name="code_module")
    private Module module01 ;



    public Element(Long idel , String nom , int coefficient ) {
        this.idel = idel;
        this.coefficient=coefficient;
        this.nom=nom;
    }

    public Element() {
    }

    public Long getIdel() {
        return idel;
    }

    public void setIdel(Long ide) {
        this.idel = idel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public Professeur getP() {
        return p;
    }

    public void setP(Professeur p) {
        this.p = p;
    }

    public List<Modalite> getModalites() {
        return modalites;
    }

    public void setModalites(List<Modalite> modalites) {
        this.modalites = modalites;
    }



    public Module getModule01() {
        return module01;
    }

    public void setModule01(Module module01) {
        this.module01 = module01;
    }
}
