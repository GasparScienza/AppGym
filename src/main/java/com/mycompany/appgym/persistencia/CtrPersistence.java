package com.mycompany.appgym.persistencia;

import com.mycompany.appgym.logica.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CtrPersistence {
    
    AlEntrJpaController alEntr = new AlEntrJpaController();
    AlumnoJpaController alu = new AlumnoJpaController();
    DebtJpaController deb = new DebtJpaController();
    FrequencyJpaController frec = new FrequencyJpaController();
    PriceListJpaController price = new PriceListJpaController();
    TrainingJpaController training = new TrainingJpaController();
    
    
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
    
    public ArrayList<Alumno> buscarAlumnosLetra(String letra) {
        List<Alumno> l = alu.findAlLetra(letra);
        ArrayList<Alumno> listaAl = new ArrayList(l);
        return listaAl;
    }
    
    //-------------Alumno-------------
    
}
