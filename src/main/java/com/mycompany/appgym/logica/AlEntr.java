package com.mycompany.appgym.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AlEntr implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @OneToOne
    private Alumno alu;
    private Training entr;
    private Frequency frec;

    public AlEntr() {
    }

    public AlEntr(int id, Alumno alu, Training entr, Frequency frec) {
        this.id = id;
        this.alu = alu;
        this.entr = entr;
        this.frec = frec;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Alumno getAlu() {
        return alu;
    }
    public void setAlu(Alumno alu) {
        this.alu = alu;
    }
    public Training getEntr() {
        return entr;
    }
    public void setEntr(Training entr) {
        this.entr = entr;
    }
    public Frequency getFrec() {
        return frec;
    }
    public void setFrec(Frequency frec) {
        this.frec = frec;
    }
}
