package youtubeDersleri127;

public class arkadasSayilar {
    public static void main(String[] args) {
        //220-284 arkadas sayılardır
        int number1 = 230;
        int number2 = 284;

        int toplam1 = 0;
        int toplam2 = 0;

        for(int i = 1; i<number1; i++){
            if(number1%i == 0){
                toplam1 += i;
            }
        }
        for(int i = 1; i<number2; i++){
            if(number2%i == 0){
                toplam2 += i;
            }
        }

        if((toplam1 == number2) && (toplam2 == number1)){
            System.out.println("Arkadaş Sayılardır");
        }else{
            System.out.println("Arkadas sayılar değildir.");
        }
    }
}
