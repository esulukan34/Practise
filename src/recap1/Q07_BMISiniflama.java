package recap1;

import java.util.Scanner;

public class Q07_BMISiniflama {

		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.

		 */
        public static void main(String[] args) {

            Scanner sc= new Scanner(System.in);

            System.out.print("Boyunuz : ");
            double boy= sc.nextDouble()/100;

            System.out.print("Kilonuz : ");
            double kilo=sc.nextDouble();

            double BMI= kilo /(boy*boy);

            if(BMI<=20){
                System.out.println("Oldukca zayifsiniz");
            } else if (BMI <= 25) {
                System.out.println("Normal sinirlardasiniz");
            } else if (BMI <= 30) {
                System.out.println("Sisman kategorisindesiniz");
            }else System.out.println("Obez grubundasiniz");


        }
}
