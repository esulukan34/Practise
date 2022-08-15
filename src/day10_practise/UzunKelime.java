package day10_practise;

import java.util.Scanner;

public class UzunKelime {
    /*
     * Kullanicidan gelen cumleyi  parametre olarak alan
     * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
     * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
     * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir cumle giriniz : ");

        String cumle = scan.nextLine();

        enUzunKelime(cumle);
        System.out.println("enUzunKelime(cumle) = " + enUzunKelime(cumle));
        // ben bugun javayi daha cok sevdim ama cok zorlandim

        enKisaKelime(cumle);
        System.out.println("enKisaKelime(cumle) = " + enKisaKelime(cumle));
    }

    public static String enKisaKelime(String cumle) {
        String []arr = cumle.split(" ");
        String min=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(min.length()>arr[i].length()){
                min = arr[i];
            }
        }


        return min;
    }

    public static String enUzunKelime(String cumle) {

        String arr[]= cumle.split(" ");
        String uzunKelime = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(uzunKelime.length()<arr[i].length()){
                uzunKelime = arr[i];
            }
        }

        return uzunKelime;
    }
}
