package com.mireyaserrano.tema04.fechas;

import java.time.MonthDay;
import java.util.Scanner;

public class Ejercicio4 {
   public enum Constelacion{
       ACUARIO, PISCIS, ARIES, TAURO, GEMINIS, CANCER, LEO, VIRGO, LIBRA, ESCORPIO, OFIUCO, SAGITARIO, CAPRICORNIO
   }

    /**
     * Se introduce la fecha de cumpeaños en formato monthday y así se puede comparar con el rango de fechas de las constelaciones y asignar una.
     * @param cumple La fecha de cumpleños solo con mes y día
     * @return devuelve la posicion del enum que corresponda
     */
   public static Constelacion fechas(MonthDay cumple){
       Constelacion signoZodiacal;
       if (cumple.isAfter(MonthDay.of(2, 17)) && cumple.isBefore(MonthDay.of(3, 12))){
            signoZodiacal = Constelacion.values()[0];
       } else if (cumple.isAfter(MonthDay.of(3, 12)) && cumple.isBefore(MonthDay.of(4, 17))){
           signoZodiacal = Constelacion.values()[1];
       } else if (cumple.isAfter(MonthDay.of(4, 16)) && cumple.isBefore(MonthDay.of(5, 15))) {
           signoZodiacal = Constelacion.values()[2];
       } else if (cumple.isAfter(MonthDay.of(5, 14)) && cumple.isBefore(MonthDay.of(6, 22))) {
           signoZodiacal = Constelacion.values()[3];
       }else if (cumple.isAfter(MonthDay.of(6, 21)) && cumple.isBefore(MonthDay.of(7, 20))) {
           signoZodiacal = Constelacion.values()[4];
       }else if (cumple.isAfter(MonthDay.of(7, 19)) && cumple.isBefore(MonthDay.of(8, 11))) {
           signoZodiacal = Constelacion.values()[5];
       }else if (cumple.isAfter(MonthDay.of(8, 10)) && cumple.isBefore(MonthDay.of(9, 17))) {
           signoZodiacal = Constelacion.values()[6];
       }else if (cumple.isAfter(MonthDay.of(9, 16)) && cumple.isBefore(MonthDay.of(10, 31))) {
           signoZodiacal = Constelacion.values()[7];
       }else if (cumple.isAfter(MonthDay.of(10, 30)) && cumple.isBefore(MonthDay.of(11, 23))) {
           signoZodiacal = Constelacion.values()[8];
       }else if (cumple.isAfter(MonthDay.of(11, 22)) && cumple.isBefore(MonthDay.of(11, 29))) {
           signoZodiacal = Constelacion.values()[9];
       }else if (cumple.isAfter(MonthDay.of(11, 28)) && cumple.isBefore(MonthDay.of(12, 18))) {
           signoZodiacal = Constelacion.values()[10];
       }else if (cumple.isAfter(MonthDay.of(12, 17)) && cumple.isBefore(MonthDay.of(1, 21))) {
           signoZodiacal = Constelacion.values()[11];
       }else {
           signoZodiacal = Constelacion.values()[12];
       }
       return signoZodiacal;
   }

   public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu fecha de nacimiento: (dd/mm/yyyy)");
        String fechaStr = scanner.nextLine();
        scanner.close();

        String day = String.valueOf(fechaStr.charAt(0) + String.valueOf(fechaStr.charAt(1)));
        String month = String.valueOf(fechaStr.charAt(3) + String.valueOf(fechaStr.charAt(4)));
        MonthDay monthday = MonthDay.parse("--"+month+"-"+day);
        System.out.println("Tu signo zodiacal es " + fechas(monthday));
   }
}
