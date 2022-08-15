package recap1;

import java.util.Scanner;

public class Q08_KanBagisiYasAraligi {


		/*
		Problem tanimi :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.print("Yasiniz: ");
            double yas=sc.nextDouble();

            System.out.print("Kilonuz: ");
            double kilo=sc.nextDouble();
            
            if(yas > 0 && yas < 18){
                System.out.println("kan bagisi yapamaz");
            }else if(yas>=18){
                if(kilo> 0 && kilo<50){
                    System.out.println("Kan bağisi yapamazsiniz");
                }else if(kilo>=50){
                    System.out.println("Kan bağisi yapabilirsiniz");
                }
            }else System.out.println("Yanlis deger girdiniz");
        }

}