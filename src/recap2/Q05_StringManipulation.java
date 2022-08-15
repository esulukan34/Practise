package recap2;

import java.util.Scanner;

public class Q05_StringManipulation {
    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadizi giriniz : ");
        String firstName= sc.nextLine(),
                lastName= sc.nextLine(); // multiple decleration

        String fullName= firstName.concat(" "+ lastName).toUpperCase();
        System.out.println("fullName = " + fullName);


    }
}
