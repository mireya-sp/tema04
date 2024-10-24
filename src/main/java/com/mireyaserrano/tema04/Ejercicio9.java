package com.mireyaserrano.tema04;

import java.util.Scanner;

public class Ejercicio9 {
    private static Integer sumatorio(int num){
        int resultado = 0;
        for (int i = num; i > 0; i--){
            resultado += i;
        }
        return resultado;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número y se calculará el sumatorio de los números anteriores");
        int x = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println("El sumatorio de " + x + " hasta el 1 es " + sumatorio(x));
    }
}
