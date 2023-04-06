package youtubeDersleri127;

public class miniProjeAsalSayi {
    public static void main(String[] args) {
        int number = 4;
        boolean isPrime = true;

        if(number < 1){
            System.out.println("geçersiz sayı girdiniz");
            return;
        }

        if(number==1){
            System.out.println("sayı asal degildir");
            return;
        }

        for(int i=2; i<number; i++){
            if(number % i == 0){
                isPrime = false;
            }
        }

        if(isPrime){
            System.out.println("Sayı asaldır");
        }else{
            System.out.println("Sayi asal değildir");
        }
        

    }
}
