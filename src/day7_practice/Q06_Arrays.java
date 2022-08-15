package day7_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_Arrays {

       /*
       kullanıcının girdigi bir array'in en buyuk elemani ile
       en kucuk elemanının  farkını bulan bir method create ediniz.
       */
       public static void main(String[] args) {
              farkiniBul();
              maxMinFarki();

       }

       private static void maxMinFarki() {
              int[] arr = {19,2,3,4,5,16,7,48,29,10,11,12,14,25,16,17,18};

              int enKucuk = arr[0];
              int enBuyuk = arr[1];

              for (int i = 0; i <arr.length ; i++) {
                     if(enKucuk>arr[i]){
                            enKucuk=arr[i];

                     }
                     if(enBuyuk<arr[i]){
                            enBuyuk=arr[i];

                     }
              }
              System.out.println("enKucuk = " + enKucuk);
              System.out.println("enBuyuk = " + enBuyuk);
              System.out.println("enBuyuk-enKucuk = " + (enBuyuk-enKucuk));

       }

       private static void farkiniBul() {
              Scanner scan = new Scanner(System.in);
              System.out.println("array'in uzunlugunu giriniz : ");
              int uzunluk = scan.nextInt();
              int arr[] = new int[uzunluk];

              for (int i = 0; i < uzunluk; i++) {
                     System.out.println("arrayin " + (i+1) + ". elemani giriniz : " ); // i -> oldugunda 0.eleman diyecek,biz index degil direkt eleman sorduk
                     arr[i] = scan.nextInt();// fori den gelen indexler,bu satirda kullanici tarafindan dongu bitene kadar girilen elemanlar okunur
              }
              Arrays.sort(arr);
              System.out.println("arraydeki en buyuk eleman ile en kucuk eleman arasindaki fark : " + (arr[uzunluk-1]-arr[0]));

      //odev: bu soruyu Math class'i kullanarak cozunuz
       }

}
