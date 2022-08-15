package day4_practice;

import java.util.Scanner;

public class Q02_MethodCreation {
      /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */
      public static void main(String[] args) {

          Scanner scan = new Scanner(System.in);
          System.out.print("Lutfen cm olarak bir sayi giriniz : ");
          double value = scan.nextDouble();

          convertCm(value);

      }

    public static void convertCm(double value) {
          double meter = value/100;
          double kMeter = value/100000;
        System.out.println("girdiginiz cm degeri " + value +"cm :"+  meter + " metre, " + kMeter + " kilometredir.");
    }
}
