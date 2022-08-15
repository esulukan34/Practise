package day3_practice;

import java.util.Scanner;

public class Q05_StringManipulastion {

    // Kullanicidan isim ve soyismini girmesini isteyin ve
    // hangisinin daha uzun oldugunu yazdirin.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("adinizi giriniz: ");
        String isim = scan.nextLine();
        System.out.print("soyadinizi giriniz: ");
        String soyisim = scan.nextLine();

        if (isim.length() < soyisim.length()) {
            System.out.println("soyisim daha uzun");
        } else if (isim.length() == soyisim.length()) {
            System.out.println("isminiz soyisminiz ile ayni uzunlukta");
        } else
            System.out.println("isim daha uzun");
    }
}




