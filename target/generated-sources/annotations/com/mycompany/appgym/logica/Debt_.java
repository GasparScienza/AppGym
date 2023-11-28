package com.mycompany.appgym.logica;

import com.mycompany.appgym.logica.AlEntr;
import com.mycompany.appgym.logica.PriceList;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-28T16:24:04", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Debt.class)
public class Debt_ { 

    public static volatile SingularAttribute<Debt, Date> date;
    public static volatile SingularAttribute<Debt, Float> amount;
    public static volatile SingularAttribute<Debt, PriceList> price;
    public static volatile SingularAttribute<Debt, Integer> id;
    public static volatile SingularAttribute<Debt, AlEntr> alEntr;

}