package sorular;

import java.util.Scanner;

public class soru23 {
    /*
    Kullanıcının gireceği iki binary sayıyı toplayan  Java kodunu yazınız.

    Test Data:
    birinci binary number: 100010
    ikinci  binary number: 110010

    Beklenen Çıktı:
    1010100
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen  birinci binary number'i giriniz : ");
        String num1=scan.next();
        System.out.print("Lutfen  ikinci binary number'i giriniz : ");
        String num2=scan.next();

        int n1=Integer.parseInt(num1,2);//2 tabaninda sayi olarak alindi
        int n2=Integer.parseInt(num2,2);//2 tabaninda sayi olarak alindi
        int toplam=n1+n2;

        System.out.println(Integer.toBinaryString(toplam));


    }
}
