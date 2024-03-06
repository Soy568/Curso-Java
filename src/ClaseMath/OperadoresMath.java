package ClaseMath;
import java.util.Scanner;
public class OperadoresMath {
    public static void main(String[] args) {
        //***** METODOS DE LA CLASE MATH *****

        //      Math.método(parámetros);

        // Metodos:
        //      abs     Devuelve el valor absoluto de un número.
        //      arcos   Devuelve el arco coseno de un ángulo en radianes.
        //      asin    Devuelve el arco seno de un ángulo en radianes.
        //      atan    Devuelve el arco tangente entre -PI/2 y PI/2.
        //      atan2   Devuelve el arco tangente entre -PI y PI.
        //      ceil    Devuelve el número entero más cercano por arriba.
        //      floor   Devuelve el número entero más cercano por abajo.
        //      round   Devuelve el entero más cercano.
        //      cos     Devuelve el coseno de un ángulo.
        //      sin     Devuelve el seno de un angulo.
        //      tan     Devuelve la tangente de un ángulo.
        //      exp     Devuelve el exponencial de un número.
        //      log     Devuelve el logaritmo natural en base de un número.
        //      max     Devuelve el mayor entre dos valores.
        //      min     Devuelve el menor entre dos valores.
        //      random  Devuelve un número aleatorio entre 0 y 1.
        //      sqrt    Devuelve la raíz cuadrada de un número.
        //      pow     Devuelve un número elevado a un exponente.
        //      cbrt    Devuelve la raíz cubica de un número.
        //      ln      Devuelve el logaritmo natural de un número.

        // Constante:
        //      PI      Devuelve el número pi.
        //      E       Devuelve el número e.
        //      LN10    Devuelve el logaritmo natural de 10.
        //      LN2     Devuelve el logaritmo natural de 2.
        //      LOG2E   Devuelve el logaritmo natural de 2 elevado a 10.
        //      LOG10E  Devuelve el logaritmo natural de 10 elevado a 10.
        //      SQRT2   Devuelve la raíz cuadrada de 2.
        //      SQRT1_2 Devuelve la raíz cuadrada de 1/2.
        //      SQRT3   Devuelve la raíz cuadrada de 3.




        double raiz = Math.sqrt(81);

        double base = 5, exponente = 2;
        double resultado = Math.pow(5,2);

        double num1 = 4.56;
        long redondeo = Math.round(num1);

        double num2 = Math.random();


        System.out.println("La raiz es : "+raiz);
        System.out.println("La potencia es : "+resultado);
        System.out.println("El redondeo es : "+redondeo);
        System.out.println("El número random es : "+num2);
    }
}
