package com.mireyaserrano.tema04;

import java.util.Scanner;

public class Ejercicio3 {
    public static int mayorNum(int num1, int num2){
        int mayor;
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
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("introduce el segundo número");
        int y = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println("el número mayor es " + mayorNum(x,y));
    }
}
