package com.mireyaserrano.tema04;

public class Ejercicio5 {
    public static String repetir(char imprimir, int n){
        if (n <= 0){
            return null;
        }
        String resultado = "";
        for (int i = n; i > 0; i--){
            resultado += imprimir;
        }
        return resultado;
    }

    public static void main(String args[]){
        String texto = repetir('B',5);
        if (texto == null){
            System.err.println("Debes indicar un número positivo");
        }else {
            System.out.println(texto);
        }
    }
}
