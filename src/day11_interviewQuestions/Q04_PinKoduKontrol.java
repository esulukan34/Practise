package day11_interviewQuestions;

import java.util.Scanner;

public class Q04_PinKoduKontrol {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    // bunu kart sifre kontrol de de kullabilirinisiz
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sifre = "emre.1234";//bankadan gelen bilgi
        int girisSayisi = 3;

        System.out.println("Bir sifre giriniz ede");

        while (true) {
            System.out.println("sifre gir");
            String girilenSifre = scan.nextLine();

            if (sifre.equals(girilenSifre)) {
                System.out.println("sifren basarili dogru");
                break;
            } else {
                System.out.println("sifren yanlis");
                girisSayisi--;
                System.out.println("kalan giris hakkin " + girisSayisi);
            }
            if (girisSayisi == 0) {
                System.out.println("giris hakkin kalmadi kart bloke " + girisSayisi);
                break;
            }
        }

    }
}
