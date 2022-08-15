package day8_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q03_ArrayList {

    /*
     * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
     * not kisa metodlar kullamayiniz
     * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
     */
    public static void main(String[] args) {
        int[] input = {2,5,-9,45,43,11,8,102,102,47,0};
        int n =4;
        // bir liste olusturalim
        List<Integer> liste = new ArrayList<>();

        //Listeye elemanlari ekleyelim
        for (int i = 0; i < input.length; i++) {
            liste.add(input[i]);
        }
        System.out.println(liste);
        /*
        for (int each : input
             ) {
            liste.add(each);
        }
        */

        List<Integer> maxList = new ArrayList<>();
        int count = 1;
        while(count<=n){
            int max = liste.get(0); // list'in ilk elemani max olsun
            for (int i = 0; i < liste.size(); i++) {
                if(liste.get(i)>max && !(maxList.contains(liste.get(i)))){ // listenin herhangi bir elemani max'dan buyukse
                    max = liste.get(i); // max artık o eleman olur
                }
            }
            maxList.add(max);// 102 eklendi
            liste.remove(liste.indexOf(max));// max liste ekledigim sayiyi artik listeden kaldiriyorum
            count++;
        }
        System.out.println("Array'in max " + n + " elemani : " + maxList );


    }
}
