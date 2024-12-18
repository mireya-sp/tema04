package com.mireyaserrano.tema04.lib;

import java.util.Scanner;

public class IO {
    /**
     * Solicita un texto y valida que su longitud este comprendida entre longitudMinima y longitudMaxima
     * @param mensaje Mensaje que se le mostrará al usuario
     * @param longitudMinima Número mínimo de caracteres que debe tener el texto
     * @param longitudMaxima Número máximo de caracteres que debe tener el texto
     * @return El texto leido validado
     */
    public static String solicitarString(String mensaje, int longitudMinima, int longitudMaxima){
        Scanner scanner = new Scanner(System.in);
        String texto;
        boolean valido;
        do {
            System.out.println(mensaje);
            texto = scanner.nextLine();
            valido = texto.length() >= longitudMinima && texto.length() <= longitudMaxima;
            if (!valido){
                System.err.printf("La longitud debe estar comprendida entre [%d - %d]\n", longitudMinima, longitudMaxima);
            }
        }while (!valido);
        scanner.close();
        return texto;
    }

    public static int solicitarEnteros(String mensaje, int valorMinimo, int valorMaximo){
        int valorLeido;
        boolean valido;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(mensaje);
            valorLeido = Integer.parseInt(scanner.nextLine());
            valido = valorLeido >= valorMinimo && valorLeido <= valorMaximo;
            if (!valido){
                System.err.printf("El valor debe estar comprendido entre [%d - %d]\n", valorMinimo, valorMaximo);
            }
        }while (!valido);
        scanner.close();
        return valorLeido;
    }
}
