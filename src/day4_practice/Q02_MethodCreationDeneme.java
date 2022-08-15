package day4_practice;

import java.util.Scanner;

public class Q02_MethodCreationDeneme {
    /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen cm olarak bir uzunluk giriniz :");
        double value = sc.nextDouble();

        cevir(value);

    }

    public static void cevir(double value) {
        double metre = value/100;
        double kMetre = value/100000;

        System.out.println("Girilen uzunluk " + metre + " metre, " + kMetre + " km'dir.");
    }
}
