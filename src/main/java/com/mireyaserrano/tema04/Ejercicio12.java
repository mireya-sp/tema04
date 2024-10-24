package com.mireyaserrano.tema04;

import java.util.Random;

public class Ejercicio12 {

    public static Calificaciones notas(double nota){
        Calificaciones notas;
        if (nota>=0 && nota<5){
            notas = Calificaciones.INSUFICIENTE;
        } else if (nota>=5 && nota<6) {
            notas = Calificaciones.SUFICIENTE;
        } else if (nota>=6 && nota<7) {
            notas = Calificaciones.BIEN;
        } else if (nota>=7 && nota<=8) {
            notas = Calificaciones.NOTABLE;
        }else {
            notas = Calificaciones.EXCELENTE;
        }
        return notas;
    }

    public enum Calificaciones{
        INSUFICIENTE, SUFICIENTE, BIEN, NOTABLE, EXCELENTE
    }

    public static void main(String args[]){
        Random aleatorio = new Random();
        double nota;
        for (int i = 1; i <= 50; i++){
            nota = aleatorio.nextDouble(0,11);
            System.out.println(nota + " = " + notas(nota));
        }
    }
}
