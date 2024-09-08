
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class LetraONumero {
    public static String evaluar(char caracter) {
        // TODO: Coloca aquí el código del ejercicio 4: Letra o número
        if((int) caracter >= 48 && caracter <= 57){
            return "Es número";
        } else if (caracter >= 65 && caracter <= 90) {
            return "Es letra mayúscula";
        } else if (caracter >= 97 && caracter <= 122) {
            return "Es letra minúscula";
        } else {
            return "No es letra ni número";
        }
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Caracter:");
        char caracter = lector.next().charAt(0);
        
        String respuesta = evaluar(caracter);
        System.out.println(respuesta);
    }
}
