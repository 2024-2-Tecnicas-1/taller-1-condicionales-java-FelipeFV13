package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Triangulo {
    public static String evaluar(double a, double b, double c) {
        // TODO: Coloca aquí el código del ejercicio 7: Triángulos
        boolean rabc = !(c > (a+b));
        boolean racb = !(b > (a+c));
        boolean rbca = !(a > (b+c));

        if(rabc && racb && rbca){
            if(a==b && a==c){
                return "El triángulo es equilátero";
            } else if (a==b || a== c || b== c) {
                return "El triángulo es isósceles";
            } else {
                return "El triángulo es escaleno";
            }
        }else {
            return "No es un triángulo válido";
        }

    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("a:");
        double a = lector.nextDouble();
        System.out.print("b:");
        double b = lector.nextDouble();
        System.out.print("c:");
        double c = lector.nextDouble();
        
        String respuesta = evaluar(a, b, c);
        System.out.println(respuesta);
    }
}
