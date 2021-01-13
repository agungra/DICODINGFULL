package com.dicoding.javafundamental.basic;

import Kendaraan.Mobil;
import Kendaraan.Motor;
import com.dicoding.javafundamental.basic.kendaraan.Kereta;
import com.dicoding.javafundamental.basic.musik.Gitar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        Gitar.bunyi();
        
        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();
    }
}
