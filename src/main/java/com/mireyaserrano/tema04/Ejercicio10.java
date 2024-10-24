package com.mireyaserrano.tema04;

import java.util.Scanner;

public class Ejercicio10 {
    public static void tablaMulti(int num){
        for (int i = 1; i <= 10; i++){
            int resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número de la tabla de multiplicar que quieres imprimir");
        int x = Integer.parseInt(scanner.nextLine());
        while (x >= 0){
            tablaMulti(x);
            System.out.println("Introduce el número de la tabla de multiplicar que quieres imprimir");
            x = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();
    }
}
