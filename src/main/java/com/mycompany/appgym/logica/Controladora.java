package com.mycompany.appgym.logica;

import com.mycompany.appgym.persistencia.CtrPersistence;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Controladora implements Serializable{
    CtrPersistence  ctrP = new CtrPersistence();
    //-------------Alumno-------------
    public void addAl(Alumno al){
        ctrP.addAl(al);
    }  
    public void edAl(Alumno al){
        ctrP.edAl(al);
    }
    public Alumno findAlumno(int id){
       return ctrP.findAlumno(id);
    }
   public ArrayList<Alumno> findListAlumno(){
       return ctrP.findListAlumno();
    }
   
   public ArrayList<Alumno> findAlLetra(String letra) {
        return ctrP.findAlLetra(letra);
    }
   //-------------Frequency-------------
   public void addF(Frequency f){
        ctrP.addF(f);
    }
    public void delF(int id){
        ctrP.delF(id);
    }
    public void edF(Frequency f){
        ctrP.edF(f);
    }  
    public Frequency findFrequency(int id){
       return ctrP.findFrequency(id);
   }  
   public ArrayList<Frequency> findListFreq(){
       return ctrP.findListFreq();
   }
   //-------------Training-------------
   public void addTr(Training t){
        ctrP.addTr(t);
    }
    public void delTr(int id){
        ctrP.delTr(id);
    }
    public void edTr(Training t){
        ctrP.edTr(t);
    }   
    public Training findTr(int id){
       return ctrP.findTr(id);
   }   
   public List<Training> findListTr(){
       return ctrP.findListTr();
   }
   //-------------AlEntr-------------
   public void addAlE(AlEntr a){
        ctrP.addAlE(a);
    }
    public void edAlE(AlEntr a){
        ctrP.edAlE(a);
    }
    public AlEntr findAlE(int id){
       return ctrP.findAle(id);
   }
   public ArrayList<AlEntr> findListAlE(){
       return ctrP.findListAle();
   }
    public ArrayList<AlEntr> findAlELetra(String letra) {
        return ctrP.findAlELetra(letra);
    }
   //-------------PriceList-------------
   public void addPrice(PriceList p){
        ctrP.addPrice(p);
    }
    public void edPrice(PriceList p){
        ctrP.edPrice(p);
    }   
    public PriceList findPrice(int id){
       return ctrP.findPrice(id);
    }   
   public List<PriceList> findListPrice(){
       return ctrP.findListPrice();
    }
   //-------------Pago-------------
   public void addPago(Pago p){
        ctrP.addPago(p);
    }
    public void edPago(Pago p){
        ctrP.edPago(p);
    }   
    public Pago findPago(int id){
       return ctrP.findPago(id);
    }
    public List<Pago> findListPago(){
       return ctrP.findListPago();
    }

    public List<PriceList> findListPriceByTrainingAndFrequency(Training en, Frequency frec) {
        return ctrP.findListPriceByTrainingAndFrequency(en, frec);
    }
}
