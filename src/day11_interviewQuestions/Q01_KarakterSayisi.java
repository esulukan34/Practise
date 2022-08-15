package day11_interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_KarakterSayisi {
        /*
        Kullanicidan bir String aliniz.
        String'de var olan her character'in sayisini ekrana yazdiriniz.
        Ornek: yapacan ==> a = 3, y = 1, p = 1, n = 1, c = 1
        hallolur yaaa   ==> a=4  l=3 h=1 o=1 u=1 y=1

        oncelikle Scanner ile obj olustur
        split methodu
        sonra sort
        foor loop a alacaz
        if ile control yapicaz ve sout ile yazdiracaz
        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir string ifade giriniz ede : ");
        String str = scan.nextLine();

        String[] arr = str.split("");
        System.out.println("arr = " + Arrays.toString(arr));

        // sort
        Arrays.sort(arr);
        System.out.println("arr nin sortlanmis hali = " + Arrays.toString(arr));

        int sayac = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1].equals(arr[i])) {
                sayac ++;
            }else{
                System.out.println(arr[i-1] + " karakteri " +  (sayac+1));
                sayac = 0;
            }if(i==arr.length-1){ // yani for loop'ta en sona geldiginde
                System.out.println(arr[i] + " karakteri " +  (sayac+1));
            }
        }

        System.out.println("");
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i].equals(arr[i+1])) {
                sayac ++;
            }else{
                System.out.println(arr[i] + " karakteri " +  (sayac+1));
                sayac = 0;
            }if(i==arr.length-1){ // yani for loop'ta en sona geldiginde
                System.out.println(arr[i] + " karakteri " +  (sayac+1));
            }
        }

    }
}
