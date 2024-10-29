package com.mireyaserrano.tema04.fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio2 {

    public static long calcularDias(LocalDate fechaNacimiento){
        LocalDate hoy = LocalDate.now();
        return ChronoUnit.DAYS.between(fechaNacimiento, hoy);
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu fecha de nacimiento (dd/MM/yyyy):");
        String fechaStr = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaStr, formatter);
        System.out.printf("Tienes %d dias\n ", calcularDias(fechaNacimiento));
    }
}
