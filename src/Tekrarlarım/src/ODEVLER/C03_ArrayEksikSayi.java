package Tekrarlarım.src.ODEVLER;

import java.util.Arrays;

public class C03_ArrayEksikSayi {
    /*     Merhaba arkadaşlar; aşağıdaki örnekte olduğu gibi
            1 den 10 a kadar sayılar oluşan dizide eksik olan
            sayıyı döndüren metodu oluşturunuz.
            Not: Çözümlerde tüm Class'ı paylaşırmısınız

            ([1, 2, 3, 5, 6, 7, 8, 10,9]) ➞ 4
            ([7, 2, 3, 10, 5, 9, 1, 4, 8]) ➞ 6
            ([7, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 10
     */
    public static void main(String[] args) {

        int [] arr1 = {1, 2, 3, 5, 6, 7, 8, 10,9};

    int olmayanSayi = eksikSayi(arr1);
        System.out.println(olmayanSayi);
    }
    public static int eksikSayi(int[] arr1) {
        int [] arr ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] sayilar = {1, 2, 3, 5, 6, 7, 8, 10,9};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        int olmayanSayi = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(Arrays.binarySearch(sayilar,arr[i])<0){
                olmayanSayi=arr[i];
            }
        }


        System.out.println("olmayanSayi = " + olmayanSayi);
        return olmayanSayi;
    }
}
