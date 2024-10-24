package com.mireyaserrano.tema04;

import java.util.Scanner;

public class Ejercicio8 {
    private static boolean capicua(String cadena){
        boolean valido;
        int n1, n2, n3, n4;
        n1 = cadena.charAt(0);
        n2 = cadena.charAt(1);
        n3 = cadena.charAt(2);
        n4 = cadena.charAt(3);
        valido = (n1 == n4) && (n2 == n3);
        return valido;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String numeros;
        boolean correcto;
        do{
            System.out.println("Introduce una cadena de CUATRO NÚMEROS");
            numeros = scanner.nextLine();
            correcto = (numeros.length() == 4);
            if (!correcto){
                System.err.println("LA CADENA DEBE SER DE CUATRO CARACTERES");
            }
        }while (!correcto);
        scanner.close();
        if (capicua(numeros) == true){
            System.out.println("El número es capicua");
        }else {
            System.out.println("El número no es capicua");
        }
    }
}