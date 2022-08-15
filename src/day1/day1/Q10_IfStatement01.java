package day1.day1;

import java.util.Scanner;

public class Q10_IfStatement01 {
    /*
     * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Y/N ikilisinden birini girin :");
        char harf = scan.next().charAt(0);
        if( harf == 'Y' || harf == 'y'){
            System.out.println("YES");
        } else if (harf == 'N' || harf == 'n') {
            System.out.println("NO");
        }else
            System.out.println("Yanlis giris yaptiniz lutfen sadece Y/N den birini giriniz :");



    }
}
