package com.mireyaserrano.tema04;

import com.mireyaserrano.tema04.lib.IO;

public class Main {
    public static void main(String args[]){
        String nombreProducto = IO.solicitarString("Indica nombre", 5, 30);
                System.out.print(nombreProducto);
    }
}