package com.company;
import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.lang.*;

public class Main {

  static double keskmine(double esimene, double teine, double kolmas){
    return ((esimene+kolmas)/2+teine)/2;
  }


    public static void main(String[] args) throws IOException {

        System.out.println("Sisesta kolm arvu");

        Scanner scan = new Scanner (System.in);

        System.out.print("Palun sisesta esimene arv: ");
        double esimene = scan.nextDouble();

        System.out.print("Palun sisesta teine arv: ");
        double teine = scan.nextDouble();

        System.out.print("Palun sisesta kolmas arv: ");
        double kolmas = scan.nextDouble();

        /*double keskmine = ((esimene+kolmas)/2+teine)/2;*/

        System.out.println("Vastus: "+keskmine(esimene,teine,kolmas));

    }
}


/*
Sisesta kolm arvu
Palun sisesta esimene arv: 2
Palun sisesta teine arv: 4
Palun sisesta kolmas arv: 6
Vastus: 4.0
*/
