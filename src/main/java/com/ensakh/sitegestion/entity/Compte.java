package com.ensakh.sitegestion.entity;

import javax.persistence.*;

@Entity
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idc", nullable = false)
    private Long idc;
    @Column(name="user" , nullable =false)
    private String user ;
    @Column(name="password" , nullable =false)
    private String password ;
    @Column(name="role" , nullable =false)
    private String role ;

    public Compte(Long idc , String user)  {
        this.idc = idc;
        this.user=user;
    }

    public Compte() {
    }

    public Long getIdc() {
        return idc;
    }

    public void setIdc(Long idc) {
        this.idc = idc;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
