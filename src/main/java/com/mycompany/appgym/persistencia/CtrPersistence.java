package com.mycompany.appgym.persistencia;

import com.mycompany.appgym.logica.AlEntr;
import com.mycompany.appgym.logica.Alumno;
import com.mycompany.appgym.logica.Frequency;
import com.mycompany.appgym.logica.Pago;
import com.mycompany.appgym.logica.PriceList;
import com.mycompany.appgym.logica.Training;
import com.mycompany.appgym.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CtrPersistence {
    
    AlEntrJpaController alEntr = new AlEntrJpaController();
    AlumnoJpaController alu = new AlumnoJpaController();
    FrequencyJpaController frec = new FrequencyJpaController();
    PriceListJpaController price = new PriceListJpaController();
    TrainingJpaController tr = new TrainingJpaController();
    PagoJpaController pag = new PagoJpaController();
    
    
    //-------------Alumno-------------
    public void addAl(Alumno al) {
        alu.create(al);
    }

    public void edAl(Alumno al) {
        try {
            alu.edit(al);
        } catch (Exception ex) {
            Logger.getLogger(CtrPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public Alumno findAlumno(int id) {
        return alu.findAlumno(id);
    }

    public ArrayList<Alumno> findListAlumno() {
        List<Alumno> l = alu.findAlumnoEntities();
        ArrayList<Alumno> listaAl = new ArrayList(l);
        return listaAl;
    }
    
    public ArrayList<Alumno> findAlLetra(String letra) {
        List<Alumno> l = alu.findAlLetra(letra);
        ArrayList<Alumno> listaAl = new ArrayList(l);
        return listaAl;
    }
    
    //-------------Frequency-------------
    public void addF(Frequency f) {
        frec.create(f);
    }
    public void delF(int id){
        try {
            frec.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(CtrPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void edF(Frequency f) {
        try {
            frec.edit(f);
        } catch (Exception ex) {
            Logger.getLogger(CtrPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public Frequency findFrequency(int id) {
        return frec.findFrequency(id);
    }

    public ArrayList<Frequency> findListFreq() {
        List<Frequency> l = frec.findFrequencyEntities();
        ArrayList<Frequency> listF = new ArrayList(l);
        return listF;
    }
    //-------------Training-------------
    public void addTr(Training t){
        tr.create(t);
    }
    public void delTr(int id){
        try {
            tr.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(CtrPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void edTr(Training t){
        try {
            tr.edit(t);
        } catch (Exception ex) {
            Logger.getLogger(CtrPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Training findTr(int id){
        return tr.findTraining(id);
    }
    public List<Training> findListTr() {
        return tr.findTrainingEntities();
    }
    //-------------AlEntr-------------
    public void addAlE(AlEntr a){
        alEntr.create(a);
    }
    public void edAlE(AlEntr a){
        try {
            alEntr.edit(a);
        } catch (Exception ex) {
            Logger.getLogger(CtrPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public AlEntr findAle(int id){
        return alEntr.findAlEntr(id);
    }
    public ArrayList<AlEntr> findListAle() {
        List<AlEntr> l = alEntr.findAlEntrEntities();
        ArrayList<AlEntr> listF = new ArrayList(l);
        return listF;
    }
    public ArrayList<AlEntr> findAlELetra(String letra) {
        List<AlEntr> l = alEntr.findAlELetra(letra);
        ArrayList<AlEntr> listaAlE = new ArrayList(l);
        return listaAlE;
    }
    //-------------PriceList-------------
    public void addPrice(PriceList p) {
        price.create(p);
    }

    public void edPrice(PriceList p) {
        try {
            price.edit(p);
        } catch (Exception ex) {
            Logger.getLogger(CtrPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public PriceList findPrice(int id) {
         return price.findPriceList(id);
    }

    public ArrayList<PriceList> findListPrice() {
        List<PriceList> l = price.findPriceListEntities();
        ArrayList<PriceList> listPrice = new ArrayList(l);
        return listPrice;
    }
    //-------------pago-------------
    public void addPago(Pago p) {
        pag.create(p);
    }

    public void edPago(Pago p) {
        try {
            pag.edit(p);
        } catch (Exception ex) {
            Logger.getLogger(CtrPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public Pago findPago(int id) {
         return pag.findPago(id);
    }

    public List<Pago> findListPago() {
        return pag.findPagoEntities();
    }

    public List<PriceList> findListPriceByTrainingAndFrequency(Training entrenamiento, Frequency frecuencia) {
        return pag.findListPriceByTrainingAndFrequency(entrenamiento, frecuencia);
    }
    public Pago obtenerUltimoPagoPorAlumno(int idAlumno){
        return pag.obtenerUltimoPagoPorAlumno(idAlumno);
    }
    public ArrayList<Pago> findPagoEntities(AlEntr al){
        List<Pago> l = pag.findPagoEntities(al);
        ArrayList<Pago> listaAlE = new ArrayList(l);
        return listaAlE;
    }
}
