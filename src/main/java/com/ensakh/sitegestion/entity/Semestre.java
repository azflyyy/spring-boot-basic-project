package com.ensakh.sitegestion.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Semestre {
    @Id
    @Column(name = "ids", nullable = false)
    private String ids;
    @Column(name = "nom" , nullable = false)
    private String nom ;
    @OneToMany(mappedBy="s",fetch= FetchType.LAZY)
    private List<Module> modules ;

    public Semestre(String ids) {
        this.ids = ids;
    }

    public Semestre() {
    }

    public String getIds() {
        return ids;
    }

    public void setId(String ids) {
        this.ids = ids;
    }
}