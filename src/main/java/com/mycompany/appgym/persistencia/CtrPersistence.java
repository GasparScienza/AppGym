package com.mycompany.appgym.persistencia;

import com.mycompany.appgym.logica.Alumno;
import com.mycompany.appgym.persistencia.exceptions.NonexistentEntityException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CtrPersistence {
    
    AlEntrJpaController alEntr = new AlEntrJpaController();
    AlumnoJpaController alu = new AlumnoJpaController();
    DebtJpaController deb = new DebtJpaController();
    FrequencyJpaController frec = new FrequencyJpaController();
    PriceListJpaController price = new PriceListJpaController();
    TrainingJpaController training = new TrainingJpaController();
    
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
    

    
}
