package com.mireyaserrano.tema04;

import java.util.Scanner;

public class Ejercicio13 {
    public static String idioma(String lenguaje){
        String saludo = "No te entiendo";
        if (lenguaje.equals("a")){
            saludo = "Bon dia";
        } else if (lenguaje.equals("b")){
            saludo = "Buenos días";
        }else if (lenguaje.equals("c")){
            saludo = "Good morning";
        }
        return saludo;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String name = scanner.nextLine();
        System.out.println("Eligue tu idioma (introduce a, b, c)");
        System.out.println("a) Valenciano");
        System.out.println("b) Castellano");
        System.out.println("c) Inglés");
        String lenguaje = scanner.nextLine();
        scanner.close();

        System.out.println(idioma(lenguaje) + " " + name);
    }
}
