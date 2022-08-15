package day10_practise.okul_proje;

public class OgretmenBilgileri {

    String isim;
    String soyisim;
    int yas;
    String brans;
    String telNo;

    public OgretmenBilgileri(String isim, String soyisim, int yas, String brans, String telNo) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.brans = brans;
        this.telNo = telNo;
    }

    public OgretmenBilgileri() {
    }

    @Override
    public String toString() {
        return "OgretmenBilgileri" +
                "\n isim = " + isim +
                "\nsoyisim = " + soyisim +
                "\n yas = " + yas +
                "\n brans = " + brans +
                "\n telNo = " + telNo;



    }
}
