package OperadoresEjercicio1;

import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args){
        //Pedir dos numeros y mostrar cual es el mayor o si son iguales.
        int num1,num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(" Digite un numero :"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(" Digite otro numero"));
        if(num1 > num2){
            JOptionPane.showMessageDialog(null," El numero "+num1+ " es el mayor.");
        }
        else if(num1 == num2){
            JOptionPane.showMessageDialog(null," Son numeros iguales");
        }else{
            JOptionPane.showMessageDialog(null," El numero "+num2+ " es el mayor.");
        };

    }
}
