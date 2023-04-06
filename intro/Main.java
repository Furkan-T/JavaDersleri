package intro;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //string
        String ortaMetin = "İlginizi Çekebilir";
        String AltMetin = "Vade Süresi";

        System.out.println(ortaMetin + AltMetin);


        //integer
        int vade = 12;

        System.out.println(vade);

        double dolarDun = 18.35;
        double dolarBugun = 18.30;
        //bool
        boolean dolarDustuMu = true;

        System.out.println(dolarDustuMu);

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
