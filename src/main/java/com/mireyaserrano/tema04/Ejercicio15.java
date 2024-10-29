package com.mireyaserrano.tema04;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio15 {


    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Random rng = new Random();
        int crupier;
        int porraCrupier = 0;
        int jugador;
        int porraJugador = 0;
        int dado;

        do {
            dado = rng.nextInt(1,7);
            crupier = 0;
            jugador = 0;

            System.out.println("Tu puntación total (porra) actual es de "+ porraJugador);
            System.out.println("La puntación total (porra) actual del Crupier es de "+ porraCrupier);
            System.out.println("---------------------------------------");
            jugador += dado;
            System.out.println("Tu puntos son los siguientes: "+jugador);
            System.out.println("¿Que quieres hacer? [1]Jugar | [2]Plantar");

            int decision = Integer.parseInt(input.nextLine());

            switch (decision){
                case 1:

                    while (jugador <=11){
                        dado = rng.nextInt(1,7);
                        System.out.println("Ha salido un: "+dado);
                        jugador += dado;
                        System.out.println("Por lo que actualmente tienes un total de "+jugador);

                        if (jugador>11){
                            System.out.println("Has perdido esta ronda, por lo que gana el Crupier");
                            porraCrupier+= 1;
                            break;
                        }
                        else {
                            if (jugador == 11){
                                System.out.println("Has obtenido 11 puntos, por lo tanto, has ganado");
                                porraJugador += 2;
                                break;
                            }else{
                                System.out.println("¿Que quieres hacer? [1]Jugar | [2]Plantar");
                                decision = Integer.parseInt(input.nextLine());
                                if (decision == 2){
                                    break;
                                }
                            }
                        }
                    }

                case 2:
                    do {
                        dado = rng.nextInt(1,7);
                        crupier += dado;
                        System.out.println("Ha salido un: "+dado);
                        System.out.println("Por lo que actualmente tienes un total de "+crupier);

                        if (crupier>11){
                            System.out.println("Has ganado la ronda porque el Crupier tiene "+crupier);
                            porraJugador += 1;
                        }
                        else {
                            if (crupier == 11){
                                System.out.println("El crupier ha ganado la ronda con 11 puntos");
                                crupier += 2;
                            }
                            else {
                                System.out.println("El crupier ha ganado, ya que tiene "+crupier);
                                crupier +=1;
                            }
                        }
                    } while (crupier <= jugador && crupier <= 11);

                default: //BlackJack;
            }
        }while (porraJugador < 5 || porraCrupier < 5);
        if (porraJugador == 5){
            System.out.println("Has ganado porque has llegado hasta 5 porras ganadas");
        }
        else {
            System.out.println("Has perdido, ya que el crupier ha ganado 5 porras");
        }
        input.close();
    }
}
