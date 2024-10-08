
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Ordenamiento {
    public static String evaluar(int numero1, int numero2, int numero3, int numero4) {
        // TODO: Coloca aquí el código del ejercicio 5: Ordenamiento
        int [] array = {numero1,numero2,numero3,numero4};
        String mensaje  = "";

        // ordenamiento por seleccion
        for (int i = 0; i < array.length; i++) {
            int indiMin = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j] < array[indiMin]){
                    indiMin = j;
                }
            }
            int auxiliar = array[i];
            array[i] = array[indiMin];
            array[indiMin] = auxiliar;
        }

        // concatenar el arreglo en una variable string
        for (int i = 0; i < array.length; i++) {
            mensaje += array[i]+" ";
        }

        return mensaje.trim();
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Número 1:");
        int numero1 = lector.nextInt();
        System.out.print("Número 2:");
        int numero2 = lector.nextInt();
        System.out.print("Número 3:");
        int numero3 = lector.nextInt();
        System.out.print("Número 4:");
        int numero4 = lector.nextInt();
        
        String respuesta = evaluar(numero1, numero2, numero3, numero4);
        System.out.println(respuesta);
    }
}
