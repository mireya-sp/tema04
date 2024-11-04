package com.mireyaserrano.tema04.fechas;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Timer;
import java.util.TimerTask;

public class Ejercicio6 {
    public static void main(String args[]){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime ahora = LocalDateTime.now();
        String ahoraString = ahora.format(formatter);//Fecha y hora exacta del momento en que se ejecuta.
        System.out.println(ahoraString);



        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                LocalDateTime anioNuevo = LocalDateTime.parse("01/01/2025 00:00:00", formatter);
                LocalDateTime ahoraActualizado = LocalDateTime.now();
                double segundosTotales = ChronoUnit.SECONDS.between(ahoraActualizado, anioNuevo);
                double dias  = segundosTotales / 86400;
                double horas = (dias - (int)dias) * 24;
                double minutos = (horas - (int)horas) * 60;
                double segundos = (minutos - (int)minutos) * 60;
                System.out.printf("\u001B[s\u001B[2K%d dias %d horas %d minutos %d segundos\u001B[u", (int)dias, (int)horas, (int)minutos, (int)segundos);

            }
        }, 0, 1000);
    }
}
