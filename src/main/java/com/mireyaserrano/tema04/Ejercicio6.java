package com.mireyaserrano.tema04;

public class Ejercicio6 {
    public static String repetir(char caracter, int filas, int columnas){
        String resultado = "";
        for (int i = 0; i < filas; i++){
            resultado += repetir(caracter, columnas) + "\n";
        }
        return resultado;
    }

    public static String repetir(char caracter, int columnas){
        if (columnas <= 0){
            return null;
        }
        String resultado = "";
        for (int i = columnas; i > 0; i--){
            resultado += caracter;
        }
        return resultado;
    }

    public static void main(String args[]){
        String texto = repetir('B', 4, 5);
        System.out.println(texto);
    }
}
