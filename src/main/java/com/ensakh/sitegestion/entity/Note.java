package com.ensakh.sitegestion.entity;

import javax.persistence.*;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "valeur", nullable = false)
    private int valeur;
    @OneToOne
    @JoinColumn(name="Nom_etudiant")
    private Etudiant Nom ;
    @OneToOne
    @JoinColumn(name="Nom_element")
    private Element nom ;


    public Note( int id ,int valeur) {

        this.valeur = valeur;
        this.id=id;
    }

    public Note() {
    }

    public int getValeur() {
        return valeur;
    }

    public void setId(int valeur) {
        this.valeur = valeur;
    }
}