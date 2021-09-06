
package logica;

import gui.Pantalla;
import javax.swing.JOptionPane;


public class Veterinaria {
    
    public static void main(String args[]) {
 

        
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);                
            }
        });
    }
    
}
