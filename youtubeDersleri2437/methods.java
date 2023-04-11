package youtubeDersleri2437;

public class methods {
    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca(){
        int[] sayilar = {1,2,4,5,7,8};

        int aranacak = 5;
        int sayac = 0;

        for(int sayi:sayilar){
            if(aranacak == sayi){
                mesajVer("Sayı dizide Bulunuyor. Sırası: " + sayac);
                return;
            }
            sayac += 1;
        }
        mesajVer("Sayı dizide Bulunmuyor.");
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
