package day06_practise;

import java.util.Scanner;

public class Q01_WhileLoop {
    public static void main(String[] args) {

        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.


        Scanner sc= new Scanner(System.in);
        int sayi =sc.nextInt();

        basamakToplama(sayi);
    }

    public static int basamakToplama(int sayi) {
        int toplam = 0;
        while(sayi!=0){
            toplam += sayi%10;
            sayi/=10;
        }
        System.out.println("Girilen sayinin rakamlar toplami : " + toplam);
        return toplam;
    }
}
