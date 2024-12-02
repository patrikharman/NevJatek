package hu.szamalk;

import hu.szamalk.modell.NevStatisztika;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        NevStatisztika statisztika = new NevStatisztika("@", "Patrik");


        System.out.println("A név kezdőbetűje:");
        statisztika.kirajzol();

        System.out.println("Hány jel van az első sorban? " + statisztika.hanyJelVanSorban(0));
        System.out.println("Hány jel van az első oszlopban? " + statisztika.hanyJelVanOszlopban(0));
        System.out.println("Teli van-e az első sor? " + statisztika.teliVanSor(0));


        try {
            statisztika.fajlbaIr("Nev.txt");
            System.out.println("A képet sikeresen kiírtuk az Nev.txt fájlba!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }


