package day7_practice;

import java.util.Arrays;

public class Q02_MDArray {

    /*
     *  String 2D array olustur
     *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
     *  String de $ varsa 3.2 ile carp// if kullanacagiz
     *  String de € varsa 4.2 ile carp
     *  elemanlarin toplamini double olarak yazdir//casting yapmamizi istiyor
     */

    public static void main(String[] args) {
        String [][] arr = {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};

        double toplam=0;
        for (int i = 0; i < 3; i++) { // outer for
            for (int j = 0; j < 3; j++) { // inner for
                if(arr[i][j].contains("$")){ // String de $ varsa 3.2 ile carp
                    toplam +=Double.parseDouble(arr[i][j].replaceAll("\\$",""))*(3.2);//dataCasting yaptik
                    // replaceAll ile $ isaretlerinden kurtulduk parseDouble ile String olan("12") ifadeyi double'a cevirdik

                }else {
                    toplam +=Double.parseDouble(arr[i][j].replaceAll("€",""))*4.2;//dataCasting yaptik
                }

            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("toplam = " + toplam);

    }
}
