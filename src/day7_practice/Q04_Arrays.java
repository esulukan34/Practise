package day7_practice;

public class Q04_Arrays {

    /*
     *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     */
    public static void main(String[] args) {
        //split yapabiliriz
        //replaceAll ile olabilir

        String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        str = str.replace(" ", ""); // boslugu hiclik ile degistir dedik
        System.out.println("str = " + str);

        // 1.yol:
        System.out.println("str'nin length'i : " + str.length());

        // 2.yol:
        String harf[]=str.split("");
        System.out.println(harf.length );

        // 3.yol:
        String str1 = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        String kelime[]= str1.split(" ");
        int boslukSayisi = kelime.length-1;
        System.out.println("boslukSayisi : " + boslukSayisi);

        // 4.yol:
        String charcter [] = str1.split("");
        System.out.println("charcter = " + (charcter.length-boslukSayisi));
    }
}
