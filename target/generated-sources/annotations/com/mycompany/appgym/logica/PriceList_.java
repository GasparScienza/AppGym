package com.mycompany.appgym.logica;

import com.mycompany.appgym.logica.Frequency;
import com.mycompany.appgym.logica.Training;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-28T22:29:13", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(PriceList.class)
public class PriceList_ { 

    public static volatile SingularAttribute<PriceList, Date> date;
    public static volatile SingularAttribute<PriceList, Float> amount;
    public static volatile SingularAttribute<PriceList, Training> en;
    public static volatile SingularAttribute<PriceList, Frequency> frec;
    public static volatile SingularAttribute<PriceList, Integer> id;

}