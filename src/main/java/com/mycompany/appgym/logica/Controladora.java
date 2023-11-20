package com.mycompany.appgym.logica;

import com.mycompany.appgym.persistencia.CtrPersistence;
import com.mycompany.appgym.persistencia.exceptions.NonexistentEntityException;

public class Controladora {
    CtrPersistence  ctrP = new CtrPersistence();
    
    public void addAl(Alumno al){
        ctrP.addAl(al);
    }
    
    public void edAl(Alumno al){
        ctrP.edAl(al);
    }
    
}
