
/**
 * -------------------------
 * Fecha: 23/02/2018
 * @author: Diego Alexander Ortiz Diaz
 * -------------------------
 */

package modelo;

import javax.swing.JOptionPane;

public class Aplicacion {

    public static void main (String [] args){
        
        String text=JOptionPane.showInputDialog("Digite el texto a evaluar: ");
        
        if(Panagram.isValidPanagram(text)){
            JOptionPane.showMessageDialog(null, "El texto ingresado SI es un Panagram");
        }else{
            JOptionPane.showMessageDialog(null, "El texto ingresado NO es un Panagram");
        }
    }

}




