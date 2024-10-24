package com.mireyaserrano.tema04;

import java.util.Scanner;

public class Ejercicio14 {
    public static Float resultado(int n, int m){
        int resta = n - m;
        int factN = Ejercicio7.factorial(n);
        int factM = Ejercicio7.factorial(m);
        int factNM = Ejercicio7.factorial(resta);
        float resultado = factN / (factM * factNM);
        return resultado;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce n");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduce m");
        int m = Integer.parseInt(scanner.nextLine());
        scanner.close();

        System.out.println("El resultado del número combinatorio es " + resultado(n,m));
    }
}
