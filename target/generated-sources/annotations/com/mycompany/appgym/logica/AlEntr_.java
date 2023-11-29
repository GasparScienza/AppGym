package com.mycompany.appgym.logica;

import com.mycompany.appgym.logica.Alumno;
import com.mycompany.appgym.logica.Frequency;
import com.mycompany.appgym.logica.Training;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-28T22:29:13", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(AlEntr.class)
public class AlEntr_ { 

    public static volatile SingularAttribute<AlEntr, Boolean> baja;
    public static volatile SingularAttribute<AlEntr, Training> entr;
    public static volatile SingularAttribute<AlEntr, Frequency> frec;
    public static volatile SingularAttribute<AlEntr, Integer> id;
    public static volatile SingularAttribute<AlEntr, Alumno> alu;

}