package com.mycompany.appgym.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class PriceList implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @OneToOne
    private Frequency frec;
    private Training en;
    
    @Basic
    private float amount;  
    
    @Temporal(TemporalType.DATE)
    private Date date;

    public PriceList() {
    }
    public PriceList(int id, Frequency frec, Training en, float amount, Date date) {
        this.id = id;
        this.frec = frec;
        this.en = en;
        this.amount = amount;
        this.date = date;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Frequency getFrec() {
        return frec;
    }
    public void setFrec(Frequency frec) {
        this.frec = frec;
    }
    public Training getEn() {
        return en;
    }
    public void setEn(Training en) {
        this.en = en;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }     
}
