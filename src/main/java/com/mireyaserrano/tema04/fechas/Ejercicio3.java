package com.mireyaserrano.tema04.fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio3 {
    public enum Planeta{
        MERCURIO, VENUS, TIERRA, MARTE, JUPITER, SATURNO, URANO, NEPTUNO
    }

    /**
     * A partir de la fecha de nacmiento del usuario calcula cuantos días de vida tiene
     * @param fechaNacimiento La fecha de nacimiento del usuario
     * @return
     */
    public static long calcularDias(LocalDate fechaNacimiento){
        LocalDate hoy = LocalDate.now();
        return ChronoUnit.DAYS.between(fechaNacimiento, hoy);
    }

    /**
     * Según el planeta eleguido devuelve en cuantos días pasa un año
     * @param planeta El planeta eleguido
     * @return
     */
    public static double dias(Planeta planeta){
        double orbitDays;
        orbitDays = switch (planeta){
            case MERCURIO -> 87.9;
            case VENUS -> 224.7;
            case TIERRA -> 365.25;
            case MARTE -> 687;
            case JUPITER -> 4333;
            case SATURNO -> 10759;
            case URANO -> 30668;
            case NEPTUNO -> 60182;
        };
        return orbitDays;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu fecha de nacimiento (dd/MM/yyyy):");
        String fechaStr = scanner.nextLine();
        System.out.println("Introduce el planeta");

        for (int i =0; i < Planeta.values().length; i++) {
            System.out.println((i +1) + ". " + Planeta.values()[i].toString());
        }
        int numPlaneta = Integer.parseInt(scanner.nextLine());
        scanner.close();
        Planeta planeta = Planeta.values()[numPlaneta -1];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaStr, formatter);
        double year = calcularDias(fechaNacimiento)/dias(planeta);
        System.out.printf("Tienes %.2f años en " + planeta, year);
    }
}
