package com.mycompany.appgym;

import com.mycompany.appgym.igu.Principal;
import com.mycompany.appgym.logica.AlEntr;
import com.mycompany.appgym.logica.Alumno;
import com.mycompany.appgym.logica.Frequency;
import com.mycompany.appgym.logica.Training;
import com.mycompany.appgym.persistencia.CtrPersistence;
import java.util.Date;

public class AppGym {

    public static void main(String[] args) {
        
        CtrPersistence ctrP = new CtrPersistence();
        Date fechaActual = new Date();
        Alumno al = new Alumno(1,"Gaspar","Scienza","Hola", fechaActual);
        Alumno al1 = new Alumno(2,"Giuliana","Bracamonte","Hola", fechaActual);
        Training tr = new Training(1,"Personalizado","Pesas");
        Training tr1 = new Training(2,"Funcional","Funcional");
        Frequency frec = new Frequency(1,"8 Clases");
        Frequency frec1 = new Frequency(2,"12 Clases");
        Frequency frec2 = new Frequency(3,"Pase Libre");
        
        AlEntr alE = new AlEntr(1, al1, tr, frec, false);
        AlEntr alE1 = new AlEntr(2, al, tr1, frec1, false);
        
        
        ctrP.addAl(al);
        ctrP.addAl(al1);
        ctrP.addF(frec);
        ctrP.addF(frec1);
        ctrP.addF(frec2);
        ctrP.addTr(tr);
        ctrP.addTr(tr1);
                
        ctrP.addAlE(alE);
        ctrP.addAlE(alE1);
        
        /**
        Principal p = new Principal();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        * **/
    }
}
