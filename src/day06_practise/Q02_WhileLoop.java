package day06_practise;

import java.util.Scanner;

public class Q02_WhileLoop {
    public static void main(String[] args) {
        /*
   Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
   girilen sayı dahil
  */
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        int count = 0;


        while(sayi>0){
            if(sayi%2 == 1){
                System.out.print(sayi + " ");
                count++;
            }
            sayi--;
        }
        System.out.println("");
        System.out.println("count = " + count);



    }
}
