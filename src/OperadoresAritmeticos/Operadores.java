package OperadoresAritmeticos;
import java.util.Scanner;
public class Operadores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1,num2,suma,resta,producto,division,residuo;

        System.out.print(" Digite dos numeros : ");
        num1 = input.nextFloat();
        num2 = input.nextFloat();

        suma = num1 + num2;
        resta = num1 - num2;
        producto = num1 * num2;
        division = num1 / num2;
        residuo = num1 % num2;

        System.out.println("La suma es : " + suma);
        System.out.println("La resta es : " + resta);
        System.out.println("El producto es : " + producto);
        System.out.println("La division es : " + division);
        System.out.println("El residuo es : " + residuo);
    }
}
