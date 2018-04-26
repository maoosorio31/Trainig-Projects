
/**
 * -------------------------
 * Fecha: 23/02/2018
 * @author: Diego Alexander Ortiz Diaz
 * -------------------------
 */

package modelo;

import javax.swing.JOptionPane;
import java.util.*;

public class Panagram {

    public static boolean isValidPanagram(String text){
        
      //1. Declaración de atributos.
        char [] arregloCaracteres;
        List<Integer> listaLetras = new ArrayList<Integer>();
        int caracter =0;
        
      //2. Las letras del argumento tipo String recibido son convertidas a minusculas y se eliminan espacios al 
      //   inicio y final de dicho argumento.
      //3. Se genera un arreglo de caracteres con el método <<toCharArray()>> y se almacena en un arreglo 
      //   tipo char <<arregloCaracteres[]>>.
      
        arregloCaracteres=text.toLowerCase().trim().toCharArray();
    
      //4. Se recorre el arreglo <<arregloCaracteres[]>> para proceder a almacenar sus elementos en un ArrayList.
      //5. El elemento obtenido en cada iteración es casteado a tipo numerico para ser evaluado en el rango 
      //   de letras minusculas con relacion al código ascii (entre 97 a 122).
      //6. Se evalua la longitud del ArrayList en donde si es cero (0) se adicionará el primer dato.
      //7. Si su longitud no es cero (0) pero es menor a 26 (correspondiente a la cantidad de letras del abecedario)
      //   se procede a recorrer el ArraList evaluando si el nuevo dato a ingresar no existe ya en dicho Array.
      //8. Cuando se complete el ciclo del ArraList se evalua su longitud final obtenida en donde si su tamaño es menor
      //   a 26 se obtendra el valor de "false" de lo contrario "true"
      
        for (int i = 0; i < arregloCaracteres.length;i++) {
           
            int repetir = 0;
            caracter=(int)arregloCaracteres[i];
           
            if (caracter>=97 && caracter<= 122){
                if(listaLetras.size()==0){
                    listaLetras.add(caracter);
                }else if(listaLetras.size()<26){
                    for (int j = 0; j < listaLetras.size(); j++) {
                        Integer e = listaLetras.get(j);
                        if (caracter==e) {
                            repetir+=1;
                        }  
                    }
                    if (repetir==0){
                        listaLetras.add(caracter);
                    }
                }
            }
        }
        
       if(listaLetras.size()<26){
           return false;
       }else{
           return true;
       }   
    }
}






