package com.company;
import java.io.*;

public class Kolmas {

    static double summa (double a1,double a2,double a3,double a4,double a5){
        return ((a1/2.0)+a2+a3+a4+(a5/2.0))/4.0;
    }

    public static void main(String[] arg) throws IOException {

        BufferedReader lugeja = new BufferedReader(
                new FileReader("kuup2ev.txt")
        );

        PrintWriter kirjutaja = new PrintWriter(new FileWriter("kuup2ev2.txt"));

        String rida = lugeja.readLine();
        double summa = 0;

        while(rida!=null) {
            String[] m = rida.split(";");

            double a1 = Integer.parseInt(m[1]);
            double a2 = Integer.parseInt(m[2]);
            double a3 = Integer.parseInt(m[3]);
            double a4 = Integer.parseInt(m[4]);
            double a5 = Integer.parseInt(m[5]);

           /* summa = (a1/2.0)+a2+a3+a4+(a5/2.0); */
            kirjutaja.println("Kuupäev: "+m[0]+" Keskmine temp: "+summa(a1,a2,a3,a4,a5));
            rida = lugeja.readLine();

        }
        lugeja.close();
        kirjutaja.close();
    }
}

/*
Väljatrükk faili
Kuupäev: 01-02 Keskmine temp: 0.8
Kuupäev: 02-02 Keskmine temp: 0.7
Kuupäev: 03-02 Keskmine temp: 0.8
Kuupäev: 04-02 Keskmine temp: 3.3
Kuupäev: 05-02 Keskmine temp: 2.1



*/
