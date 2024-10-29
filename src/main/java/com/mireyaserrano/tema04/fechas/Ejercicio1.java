package com.mireyaserrano.tema04.fechas;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Ejercicio1 {
    public static int calcularEdad(LocalDate fechaNacimiento){
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, hoy);
        return periodo.getYears();
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu fecha de nacimiento (dd/MM/yyyy):");
        String fechaStr = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaStr, formatter);
        System.out.printf("Tienes %d años\n ", calcularEdad(fechaNacimiento));
    }
}
