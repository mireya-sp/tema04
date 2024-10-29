package com.mireyaserrano.tema04;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {

    private static Integer aleatorio(int max, int min){
        Random aleatorio = new Random();
        int goles;
        do {
            goles = aleatorio.nextInt(max);
        }while (goles < min);
        return goles;
    }

    public static String resultado(int maxGoles, int minGoles){
        String total;
        int equipoLocal = aleatorio(maxGoles, minGoles);
        int equipoVisitante = aleatorio(maxGoles, minGoles);
        if (equipoLocal == equipoVisitante){
            total = "x";
        } else if (equipoLocal > equipoVisitante) {
            total = "1";
        }else {
            total = "2";
        }
        return total;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el valor mínimo que pueden tener los goles");
        int minGoles = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduce el valor máximo que pueden tener los goles");
        int maxGoles = Integer.parseInt(scanner.nextLine());
        scanner.close();
        for (int i = 1; i <= 15; i++){
            System.out.printf("Partido" + i + "%8s\n", resultado(maxGoles, minGoles));
        }
    }
}
