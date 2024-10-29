package com.mireyaserrano.tema04.fechas;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Ejercicio1 {
    /**
     * Introduce una fecha de nacimiento y te dice cuantos años han pasado hasta la fecha de hoy
     * @param fechaNacimiento La fecah de nacimiento del usuario
     * @return
     */
    public static int calcularEdad(LocalDate fechaNacimiento){
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, hoy);
        return periodo.getYears();
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu fecha de nacimiento (dd/MM/yyyy):");
        String fechaStr = scanner.nextLine();
        scanner.close();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaStr, formatter);
        System.out.printf("Tienes %d años\n ", calcularEdad(fechaNacimiento));
    }
}
