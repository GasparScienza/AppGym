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
public class Pago implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @OneToOne
    private AlEntr al;
    
    @Temporal(TemporalType.DATE)
    private Date date;
    
    @Basic
    private String obs;

    public Pago() {
    }

    public Pago(int id, AlEntr al, Date date, String obs) {
        this.id = id;
        this.al = al;
        this.date = date;
        this.obs = obs;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public AlEntr getAl() {
        return al;
    }
    public void setAl(AlEntr al) {
        this.al = al;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getObs() {
        return obs;
    }
    public void setObs(String obs) {
        this.obs = obs;
    }        
}
