package intro;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        String ortaMetin = "İlginizi Çekebilir";
        String AltMetin = "Vade Süresi";

        System.out.println(ortaMetin);

        int vade = 12;

        double dolarDun = 18.35;
        double dolarBugun = 18.30;

        boolean dolarDustuMu = true;

        String okYonu = "";

        if (dolarBugun<dolarDun){
            okYonu = "down.svg";
            System.out.println(okYonu);
        }else if(dolarBugun > dolarDun){
            okYonu = "up.svg";
            System.out.println(okYonu);
        }
        else{
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }

        //array

        String[] krediler = {"Hızlı Kredi", "Mutlu Emekli", "Maasını halktan"};

        for(int i=0; i<krediler.length; i++){
            System.out.println(krediler[i]);
        }

    }
}
