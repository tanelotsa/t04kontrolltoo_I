package com.company;
import java.io.*;
import java.util.Scanner;

public class Teine {

    static double summa(int kogus, int[] numbrid){

        double keskmine = 0;
        double summa = 0;

        for(int i=0;i<kogus;i++){
            if (i == 0){
                summa = summa + (numbrid[i]/2.0);
            } else if (i == numbrid.length-1){
                summa = summa + (numbrid[kogus-1]/2.0);
            } else {
                summa = summa + numbrid[i];
            }

        }
        return summa*1.0/(numbrid.length-1);
    }

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner (System.in);
        System.out.print("Mitu arvu tahad sisestada: ");
        int kogus = scan.nextInt();

        int[] numbrid = new int[kogus];
        int kordus=0;
        for(kordus=0;kordus<kogus;kordus++){
            System.out.println("Sisesta arv: ");
            numbrid[kordus] = scan.nextInt();
        }


        System.out.println("Vastus:"+summa(kogus,numbrid));

    }
}

/*
Kronoloogiline keskmine Teine punkt Tanel Otsa
Mitu arvu tahad sisestada: 4
Sisesta arv:
2
Sisesta arv:
4
Sisesta arv:
6
Sisesta arv:
8
Vastus:2.75
*/
