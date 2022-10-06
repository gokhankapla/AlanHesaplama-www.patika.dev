package com.gokhankaplan.alanhesaplama;

import java.util.Scanner;

public class Alan {

        public static void main(String[] args) {

            int d, e, f, u;
            double alan;
            Scanner input = new Scanner(System.in);
            System.out.println("d kenarını giriniz: ");
            d = input.nextInt();
            System.out.println("e kenarını giriniz: ");
            e = input.nextInt();
            System.out.println("f kenarını giriniz: ");
            f = input.nextInt();
            u = (d + e + f)/2;
            System.out.println("Ucgenin cevresi: " + u);
            alan = Math.sqrt(u*(u-d)*(u-e)*(u-f));
            System.out.println("Ucgenin alanı: "+ alan);

        }
    }

