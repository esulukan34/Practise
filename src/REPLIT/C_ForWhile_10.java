package REPLIT;

public class C_ForWhile_10 {
    /*
    1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.
    OutPut:
    Sayilarin Toplami : 5050
     */
    public static void main(String[] args) {
        int sayi=0;
        int toplam = sayi;
        for (int i = 1; i <=100 ; i++) {
            sayi = i;
            toplam +=sayi;
        }
        System.out.println("toplam = " + toplam);
    }
}
