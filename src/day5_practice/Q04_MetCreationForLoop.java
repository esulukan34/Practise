package day5_practice;

import java.util.Scanner;

public class Q04_MetCreationForLoop {


		/* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString
		  Bir dizeyi tersine çevirmek için bir Java programı yazın.
		  For döngüsü kullanın ve reverseString adlı bir yöntem oluşturun*/
        public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            System.out.print("Bir string giriniz : ");
            String str = scan.nextLine();
            reverseString(str);
            System.out.println("stringin tersi : " + reverseString(str));
        }




    public static String reverseString(String str) {

            String reversed = "";
        for (int i = str.length()-1; i >= 0 ; i--) { // --:depleament(azaltma)
            reversed += str.charAt(i);

        }


        return reversed;
    }
}
