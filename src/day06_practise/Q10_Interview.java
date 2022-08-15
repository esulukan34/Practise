package day06_practise;

import java.util.Scanner;

public class Q10_Interview {
    public static void main(String[] args) {
        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("lutfen bir string giriniz : ");
        String input = sc.nextLine();
        System.out.println("bir sayi giriniz : ");
        int sayi = sc.nextInt();

        System.out.println("ilkSonHarf(input,sayi) = " + ilkSonHarf(input, sayi));

    }

    public static String ilkSonHarf(String str, int n) { //str=input , sayi = n aslinda

        String s = str.substring(0,1) + str.substring(str.length()-1);
        String sonuc = "";

        for (int i = 1; i <= n ; i++) {
            sonuc += s ; //( sonuc = sonuc + s ) seklinde de yazabilirdik



        }


        return sonuc;


    }
}
