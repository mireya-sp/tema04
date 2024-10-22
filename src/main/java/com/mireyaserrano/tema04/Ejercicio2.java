package com.mireyaserrano.tema04;

import java.util.Scanner;

public class Ejercicio2 {
    public static double area(double x){
        return Math.PI * x * x;
    }
    public static double longitud(double x){
        return 2 * Math.PI * x;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el radio de la circunferencia");
        float radio = Float.parseFloat(scanner.nextLine());
        scanner.close();
        double resultarea = area(radio);
        System.out.println("El area de la circunferencia es " + resultarea + " u2");
        double resultlong = longitud(radio);
        System.out.println("La longitud de la circunferencia es " + resultlong + " unidades");
    }
}
