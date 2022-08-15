package day3_practice;

import java.util.Scanner;

public class Q06_StringManipulastion {

    // Kullanicidan alacaginiz bir stringde bosluk karakterinin
    // olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini
    // kontrol ediniz.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("birinci stringi giriniz: ");
        String str1=scan.nextLine();
        System.out.print("ikinci stringi giriniz: ");
        String str2=scan.nextLine();

        if(str1.contains(" ")){
            System.out.println("birinci string" + " : bosluk iceriyor");
        }else System.out.println("birinci string" +  " : bosluk icermiyor");

        if(str2.length()==0){
            System.out.println("ikinci string " + " : bos");
        }else
            System.out.println("ikinci string" + " : bos degil");




    }
}
