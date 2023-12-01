package com.mycompany.appgym;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.mycompany.appgym.igu.Principal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class AppGym {

    public static void main(String[] args) {
        try {    
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(AppGym.class.getName()).log(Level.SEVERE, null, ex);
        }  
        Principal prin = new Principal();
        prin.setVisible(true);
        prin.setLocationRelativeTo(null);
    }
}
