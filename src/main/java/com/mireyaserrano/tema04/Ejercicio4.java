package com.mireyaserrano.tema04;

import java.util.Scanner;

public class Ejercicio4 {
    public static int mayor(int a, int b, int c, int d){
        int mayor1 = Ejercicio3.mayorNum(a,b);
        int mayor2 = Ejercicio3.mayorNum(c,d);
        return Ejercicio3.mayorNum(mayor1, mayor2);
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce el primer número");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("introduce el segundo número");
        int y = Integer.parseInt(scanner.nextLine());
        System.out.println("introduce el tercer número");
        int z = Integer.parseInt(scanner.nextLine());
        System.out.println("introduce el cuarto número");
        int p = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println("El número mayor es " + mayor(x, y, z, p));
    }
}
