package com.mireyaserrano.tema04;

import java.util.Scanner;

public class Ejercicio3 {
    public static Float mayorNum(float num1, float num2){
        float mayor;
        if (num1>num2){
            mayor = num1;
        }else {
            mayor = num2;
        }
        return mayor;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce el primer número");
        float x = Float.parseFloat(scanner.nextLine());
        System.out.println("introduce el segundo número");
        float y = Float.parseFloat(scanner.nextLine());
        scanner.close();
        System.out.println("el número mayor es " + mayorNum(x,y));
    }
}
