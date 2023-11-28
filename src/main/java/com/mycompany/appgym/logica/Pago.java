package com.mycompany.appgym.logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
    Controladora ctrP = new Controladora();
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @OneToOne
    private AlEntr alE;
    
    @Temporal(TemporalType.DATE)
    private Date date;
    
    @Basic
    private String obs;
    private float monto;
    
    public void calMontoPPago(AlEntr al) {
        // Obtener el entrenamiento y la frecuencia asociados a AlEntr
        Training entrenamiento = al.getEntr();
        Frequency frecuencia = al.getFrec();

        // Obtener la lista de precios específica para el entrenamiento y la frecuencia
        List<PriceList> preciosFiltrados = ctrP.findListPriceByTrainingAndFrequency(entrenamiento, frecuencia);

        if (!preciosFiltrados.isEmpty()) {
        // Obtener el último precio de la lista filtrada
            PriceList ultimoPrecio = preciosFiltrados.get(preciosFiltrados.size() - 1);
            float monto = ultimoPrecio.getAmount();
            this.monto = monto;
        }
    }
    
        
    
    public Pago() {
    }

    public Pago(int id, AlEntr alE, Date date, String obs, float monto) {
        this.id = id;
        this.alE = alE;
        this.date = date;
        this.obs = obs;
        this.monto = monto;
    }

    public Controladora getCtrP() {
        return ctrP;
    }

    public void setCtrP(Controladora ctrP) {
        this.ctrP = ctrP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AlEntr getAlE() {
        return alE;
    }

    public void setAlE(AlEntr alE) {
        this.alE = alE;
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

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
    
     
}
