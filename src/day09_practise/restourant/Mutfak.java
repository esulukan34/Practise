package day09_practise.restourant;

public class Mutfak {

    public String yemekler = "adanakebap, urfaciger,kusbasi, kusleme";

    public String araSicak = "yaylacorba, mercimek, duguncorba, corba";

    public String tatlilar = "baklava, sutlac, gullac, kazandibi, kunefe ";

    public String icecekler = "ayran, salgam, kola ";

    public Mutfak(String yemekler, String araSicak, String tatlilar, String icecekler) {

        this.yemekler = yemekler;
        this.araSicak = araSicak;
        this.tatlilar = tatlilar;
        this.icecekler = icecekler;
    }

    Mutfak(){
    }

    @Override
    public String toString() {
        return "Mutfak" +
                "\n yemekler = " + yemekler +
                "\n araSicak = " + araSicak +
                "\n tatlilar = " + tatlilar +
                "\n icecekler = " + icecekler;

    }
}
