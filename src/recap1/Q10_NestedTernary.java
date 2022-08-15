package recap1;

public class Q10_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {
        char finalNotu= 'k';


        String sonuc = finalNotu == 'A' || finalNotu == 'a'? "Gayet basarili"
                     : finalNotu == 'B' || finalNotu == 'b'? "Basarili"
                     : finalNotu == 'C' || finalNotu == 'c'? "Ha gayret"
                     : "Digerleri ";
        System.out.println("sonuc = " + sonuc);




    }
}
