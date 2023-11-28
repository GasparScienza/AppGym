package com.mycompany.appgym;

import com.mycompany.appgym.igu.Principal;
import com.mycompany.appgym.logica.AlEntr;
import com.mycompany.appgym.logica.Alumno;
import com.mycompany.appgym.logica.Frequency;
import com.mycompany.appgym.logica.Pago;
import com.mycompany.appgym.logica.PriceList;
import com.mycompany.appgym.logica.Training;
import com.mycompany.appgym.persistencia.CtrPersistence;
import java.util.Date;

public class AppGym {

    public static void main(String[] args) {
        
        CtrPersistence ctrP = new CtrPersistence();
        Date fechaActual = new Date();
        Alumno al = new Alumno(1,"Gaspar","Scienza","Hola",false,fechaActual);
        Alumno al1 = new Alumno(2,"Giuliana","Bracamonte","Hola",false, fechaActual);
        Training tr = new Training(1,"Personalizado","Pesas");
        Training tr1 = new Training(2,"Funcional","Funcional");
        Frequency frec = new Frequency(1,"8 Clases");
        Frequency frec1 = new Frequency(2,"12 Clases");
        Frequency frec2 = new Frequency(3,"Pase Libre");
        ctrP.addAl(al);
        ctrP.addAl(al1);
        ctrP.addF(frec);
        ctrP.addF(frec1);
        ctrP.addF(frec2);
        ctrP.addTr(tr);
        ctrP.addTr(tr1);
        
        /**
        AlEntr alE = new AlEntr(1, al1, tr, frec, false);
        AlEntr alE1 = new AlEntr(2, al, tr, frec1, false);
        ctrP.addAlE(alE);
        ctrP.addAlE(alE1);
        **/
        
        PriceList pr1 = new PriceList(1, frec, tr, 5000, fechaActual);
        PriceList pr2 = new PriceList(2, frec1, tr, 6000, fechaActual);
        PriceList pr3 = new PriceList(3, frec2, tr, 7000, fechaActual);
        
        PriceList pr4 = new PriceList(4, frec, tr1, 4000, fechaActual);
        PriceList pr5 = new PriceList(5, frec1, tr1, 4500, fechaActual);
        PriceList pr6 = new PriceList(6, frec2, tr1, 5500, fechaActual);
        
        ctrP.addPrice(pr1);
        ctrP.addPrice(pr2);
        ctrP.addPrice(pr3);
        ctrP.addPrice(pr4);
        ctrP.addPrice(pr5);
        ctrP.addPrice(pr6);
        
        /**
        Pago p = new Pago();
        
        p.setAlE(alE1);
        p.setDate(fechaActual);
        p.calMontoPPago(alE1);
        float monto = p.getMonto();
        p.setMonto(monto);
        System.out.println(" " + monto);
        ctrP.addPago(p);
        **/
        
        
        
        
        
       
        
                
        
        
   
        Principal prin = new Principal();
        prin.setVisible(true);
        prin.setLocationRelativeTo(null);
    }
}
