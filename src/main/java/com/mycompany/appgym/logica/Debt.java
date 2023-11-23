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
public class Debt implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @OneToOne
    private AlEntr alEntr;
    private PriceList price;
    
    @Basic
    private float amount;
    
    @Temporal(TemporalType.DATE)
    private Date date;

    public Debt() {
    }
    public Debt(int id, AlEntr alEntr, PriceList price, float amount, Date date) {
        this.id = id;
        this.alEntr = alEntr;
        this.price = price;
        this.amount = amount;
        this.date = date;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public AlEntr getAlEntr() {
        return alEntr;
    }
    public void setAlEntr(AlEntr alEntr) {
        this.alEntr = alEntr;
    }
    public PriceList getPrice() {
        return price;
    }
    public void setPrice(PriceList price) {
        this.price = price;
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
