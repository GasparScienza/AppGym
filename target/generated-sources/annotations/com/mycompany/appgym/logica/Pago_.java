package com.mycompany.appgym.logica;

import com.mycompany.appgym.logica.Alumno;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-26T19:18:40", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Pago.class)
public class Pago_ { 

    public static volatile SingularAttribute<Pago, Date> date;
    public static volatile SingularAttribute<Pago, String> obs;
    public static volatile SingularAttribute<Pago, Integer> id;
    public static volatile SingularAttribute<Pago, Alumno> al;

}