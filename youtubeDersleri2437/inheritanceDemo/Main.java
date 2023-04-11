package youtubeDersleri2437.inheritanceDemo;

public class Main {
    public static void main(String[] args) {
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        ogretmenKrediManager.Hesapla();

        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new AskerKrediManager());
    }
}
