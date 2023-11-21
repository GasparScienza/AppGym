
package com.mycompany.appgym.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Alumno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    private String name;
    private String surname;  
    private String obs;
    private boolean bajaA;
    
    @Temporal(TemporalType.DATE)
    private Date date;

    public Alumno() {
    }
    public Alumno(int id, String name, String surname, String obs, Date date) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.obs = obs;
        this.bajaA = false;
        this.date = date;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getObs() {
        return obs;
    }
    public void setObs(String obs) {
        this.obs = obs;
    }
    public boolean isBajaA() {
        return bajaA;
    }
    public void setBajaA(boolean bajaA) {
        this.bajaA = bajaA;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }    
}
