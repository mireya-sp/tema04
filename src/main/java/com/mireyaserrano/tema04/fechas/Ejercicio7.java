package com.mireyaserrano.tema04.fechas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int menuPrincipal, menuSecundario;
        LocalDate fecha = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        do {
            System.out.printf("*********************************\n*** FECHA CALCULADA: %s ***\n*********************************\n1. Modificar fecha calculada\n2. Operaciones...\n------------------------------------------\n0. Salir del programa\n", fecha);
            menuPrincipal = Integer.parseInt(scanner.nextLine());
            do {
                int opcion = switch (menuPrincipal) {
                    case 0 -> 0;
                    case 1 -> 1;
                    case 2 -> 2;
                    default -> -1;
                };
                if (opcion == -1) {
                    System.err.println("ERROR, Introduce una opción válida:");
                    menuPrincipal = Integer.parseInt(scanner.nextLine());
                }
            } while (menuPrincipal !=0 && menuPrincipal !=1 && menuPrincipal !=2);
            if (menuPrincipal == 1) {
                System.out.println("Introduce la fecha a la que quieres cambiar: (dd/MM/yyyy)");
                String fechaModificada = scanner.nextLine();
                fecha = LocalDate.parse(fechaModificada, formatter);
            } else if (menuPrincipal == 2) {
                System.out.printf("*********************************\n*** OPERACIONES ***\n*** FECHA CALCULADA: %s ***\n*********************************\n1. Sumar años\n2. Sumar meses\n3. Sumar meses\n4. Restar años\n5. Restar meses\n6. Restar días\n------------------------------------------\n0. Volver al menú principal\n", fecha);
                menuSecundario = Integer.parseInt(scanner.nextLine());
                do {
                    int opcion = switch (menuSecundario) {
                        case 0 -> 0;
                        case 1 -> 1;
                        case 2 -> 2;
                        case 3 -> 3;
                        case 4 -> 4;
                        case 5 -> 5;
                        case 6 -> 6;
                        default -> -1;
                    };
                    if (opcion == -1) {
                        System.err.println("ERROR, Introduce una opción válida:");
                        menuSecundario = Integer.parseInt(scanner.nextLine());
                    }
                } while (menuSecundario < 0 || menuSecundario > 6);
                if (menuSecundario == 1){//Sumar años
                    System.out.println("Introduce el número de años que quieres sumar:");
                    int aniosSumar = Integer.parseInt(scanner.nextLine());
                    Period sumarAnios = Period.of(aniosSumar, 0, 0);
                    fecha = fecha.plus(sumarAnios);
                } else if (menuSecundario == 2) {//Sumar  meses
                    System.out.println("Introduce el número de meses que quieres sumar:");
                    int mesesSumar = Integer.parseInt(scanner.nextLine());
                    Period sumarMeses = Period.of(0, mesesSumar, 0);
                    fecha = fecha.plus(sumarMeses);
                } else if (menuSecundario == 3) {//Sumar días
                    System.out.println("Introduce el número de dias que quieres sumar:");
                    int diasSumar = Integer.parseInt(scanner.nextLine());
                    Period sumarDias = Period.of(0, 0, diasSumar);
                    fecha = fecha.plus(sumarDias);
                } else if (menuSecundario == 4) {
                    System.out.println("Introduce el número de años que quieres restar:");
                    int aniosRestar = Integer.parseInt(scanner.nextLine());
                    Period restarAnios = Period.of(aniosRestar, 0, 0);
                    fecha = fecha.plus(restarAnios);
                } else if (menuSecundario == 5) {
                    System.out.println("Introduce el número de meses que quieres restar:");
                    int mesesRestar = Integer.parseInt(scanner.nextLine());
                    Period restarMeses = Period.of(mesesRestar, 0, 0);
                    fecha = fecha.plus(restarMeses);
                } else if (menuSecundario == 6) {
                    System.out.println("Introduce el número de días que quieres restar:");
                    int diasRestar = Integer.parseInt(scanner.nextLine());
                    Period restarDias = Period.of(diasRestar, 0, 0);
                    fecha = fecha.plus(restarDias);
                }else {
                    System.out.println("Volviendo al inicio...");
                }
            }
        }while (menuPrincipal != 0);
    }
}