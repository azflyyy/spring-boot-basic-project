package com.ensakh.sitegestion.entity;

import javax.persistence.*;

@Entity
public class Modalite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmt", nullable = false)
    private Long idmt;
    @Column (name="pr_cc", nullable = false)
    private int pr_cc;
    @Column (name="pr_tp", nullable = false)
    private int pr_tp;
    @Column (name="pr_projet", nullable = false)
    private int pr_projet;
    @ManyToOne
    @JoinColumn(name="elements_modalite")
    private Element elements0 ;


    public Modalite(Long idmt , int pr_cc , int pr_projet , int pr_tp) {
        this.idmt = idmt;
        this.pr_cc=pr_cc;
        this.pr_projet=pr_projet;
        this.pr_tp=pr_tp;
    }

    public Modalite() {
    }

    public Long getIdmt() {
        return idmt;
    }

    public void setIdmt(Long idmt) {
        this.idmt = idmt;
    }

    public int getPr_cc() {
        return pr_cc;
    }

    public void setPr_cc(int pr_cc) {
        this.pr_cc = pr_cc;
    }

    public int getPr_tp() {
        return pr_tp;
    }

    public void setPr_tp(int pr_tp) {
        this.pr_tp = pr_tp;
    }

    public int getPr_projet() {
        return pr_projet;
    }

    public void setPr_projet(int pr_projet) {
        this.pr_projet = pr_projet;
    }

    public Element getElements0() {
        return elements0;
    }

    public void setElements0(Element elements0) {
        this.elements0 = elements0;
    }
}
