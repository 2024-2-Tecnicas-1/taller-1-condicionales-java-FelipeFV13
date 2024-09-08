package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        // TODO: Coloca aquí el código del ejercicio 1: Set de tenis
        if(numVictoriasA >= 5 && numVictoriasB >= 5){
            if(numVictoriasA <= 7 && numVictoriasB <= 7){
                if(numVictoriasA == numVictoriasB){
                    return "Aún no termina";
                } else if (numVictoriasA == 7) {
                    return "Ganó A";
                } else if (numVictoriasB == 7) {
                    return "Ganó B";
                } else {
                    return "Aún no termina";
                }
            }else{
                return "Inválido";
            }

        }else{
            if(numVictoriasA <= 6 && numVictoriasB <= 6){
                if(numVictoriasA == 6 && (numVictoriasA - numVictoriasB) >= 2){
                    return "Ganó A";
                }else if (numVictoriasB == 6 && (numVictoriasB - numVictoriasA) >= 2){
                    return "Ganó B";
                } else{
                    return "Aún no termina";
                }
            }else{
                return "Inválido";
            }

        }
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Los juegos ganador por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVictoriasB = lector.nextInt();
        
        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}
