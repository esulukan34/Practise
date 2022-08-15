package day7_practice;

public class Q03_MDArray {

    /*
     * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
     * yaziniz
     * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
     *
     * OUTPUT : Arraydeki cift sayilarin toplami : 30
     */
    public static void main(String[] args) {
        int[][] sayilar = {{1,3,6},{2,8},{5,7,9,14}};
        ciftleriTopla(sayilar);
        toplaCift(sayilar);

        System.out.println("Cift sayilar toplami : " + ciftleriTopla(sayilar));
    }

    private static void toplaCift(int[][] sayilar) {
        int toplam=0;

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                if(sayilar[i][j]%2==0){
                    toplam += sayilar[i][j];
                }

            }
        }
        System.out.println("toplam = " + toplam);
    }

    public static int ciftleriTopla(int[][] sayilar) {
        int toplam=0;
        for (int [] each1 : sayilar
             ) { // outer for each
            for (int each2: each1
                 ) { // inner for each

                if(each2%2==0){
                    toplam += each2;
                }

            }

        }

        return toplam;

    }
}
