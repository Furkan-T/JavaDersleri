package youtubeDersleri127;

public class mukemmelSayi {
    public static void main(String[] args) {
        int number = 27;
        int toplam = 0;

        if(number < 0 ){
            System.out.println("Geçersiz sayı girdiniz");
            return;
        }

        for(int i = 1;i < number; i++){
            if(number%i == 0){
                toplam += i;
            }
        }
        if (toplam== number){
            System.out.println("mükemmel Sayı");
        }else{
            System.out.println("Mükemmel sayı degil");
        }
    }
}
