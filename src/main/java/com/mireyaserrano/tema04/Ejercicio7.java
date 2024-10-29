package com.mireyaserrano.tema04;

import java.util.Scanner;

public class Ejercicio7 {
    public static int factorial(int num) {
        int resultado = 1;
        for (int i = 1; i <= num; i++){
            resultado = i * resultado;
        }
        return resultado;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        boolean valido;
        int a;
        do {
            System.out.println("Introduce un número y imprimo su factorial");
            a = Integer.parseInt(scanner.nextLine());
            valido = a>0;
            if (a <= 0) {
                System.err.println("Introduce un número positivo");
            }
        }while (!valido);
        System.out.println("El fatorial del número introducido es " + factorial(a));
    }
}
