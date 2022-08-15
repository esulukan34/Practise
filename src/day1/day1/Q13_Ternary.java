package day1.day1;

public class Q13_Ternary {
    /*
     * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * olsun
     */

    public static void main(String[] args) {

        int fiyat= 1;

        if(fiyat<10){
            System.out.println("result : ucuz");
        } else if (fiyat<20) {
            System.out.println("normal");
        }else System.out.println("pahali");


        String result2 = fiyat<10 ? "ucuz" : fiyat<20 ? "normal" : "pahali";
        System.out.println("result2 = " + result2);

        System.out.println(fiyat<10 ? "ucuz" : fiyat<20 ? "normal" : "pahali");


    }

}
