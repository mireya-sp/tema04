package com.mireyaserrano.tema04.recursividad;

import java.util.Scanner;

public class Ejercicio1 {

    public static void cuentaAtras(int num){
        if (num < 1) {
            return;
        }

        System.out.println(num + " ");
        cuentaAtras(num - 1);

    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = Integer.parseInt(scanner.nextLine());
        cuentaAtras(num);
    }
}
