package recap2;

import java.util.Scanner;

public class Q01_SwitchCase {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {


        String gun = "PAZAR";
        gun=gun.toLowerCase();

        switch (gun) {
            case "Pazartesi":
            case "Sali":
                System.out.println("Java dersi gunleri");
                break;
            case "Carsamba":
            case "Cumartesi":
                System.out.println("SQL dersi gunleri");
                break;
            case "Persembe":
            case"Cuma":
                System.out.println("Selenyum dersi gunleri");
                break;
            default:
                System.out.println("izin gunu");


        }


    }
}
