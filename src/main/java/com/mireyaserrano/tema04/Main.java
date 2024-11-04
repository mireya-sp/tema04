package com.mireyaserrano.tema04;

//import com.mireyaserrano.tema04.lib.IO;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String args[]){
       // String nombreProducto = IO.solicitarString("Indica nombre", 5, 30);
        //System.out.print(nombreProducto);


        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                System.out.print(" Hola mundo");
                System.out.printf("\033[H\033[2J");
                System.out.flush();
            }
        }, 0, 1000);
    }



}
