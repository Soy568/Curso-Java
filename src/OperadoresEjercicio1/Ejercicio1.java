package OperadoresEjercicio1;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Mario tiene N dolares, Camilo tiene la mitad de lo que posee Mario.
        // Cristian tiene la mitad de lo que posee Camilo y Mario juntos.
        // Cuanto dinero tienen entre los tres.

        float Mario, Cristian, Camilo, Total;

        System.out.print("    Digite cuanto dinero tiene Mario : ");
        Mario = input.nextFloat();
        Camilo = Mario/2;
        Cristian = ( Camilo + Mario )/2;
        Total = Mario + Camilo + Cristian;
        System.out.println("El total entre los tres es : " + Total);


    }
}
