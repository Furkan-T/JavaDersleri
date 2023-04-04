package youtubeDersleri;

public class sayiBulma {
    public static void main(String[] args) {
        int[] sayilar = {1,2,4,5,7,8};

        int aranacak = 3;
        int sayac = 0;

        for(int sayi:sayilar){
            if(aranacak == sayi){
                System.out.println("Sayı dizide Bulunuyor. Sırası: " + sayac);
                return;
            }
            sayac += 1;
        }
        System.out.println("Sayı dizide bulunmuyor");
    }
}
