package youtubeDersleri127;

public class sesliHarfler {
    public static void main(String[] args) {
        String harf = "u";

        String kucukHarf = harf.toLowerCase();

        if(kucukHarf == "a" || kucukHarf=="ı" || kucukHarf == "o" || kucukHarf == "u"){
            System.out.println("Kalın sesli harf");
        }else{
            System.out.println("İnce sesli harf");
        }

        switch (kucukHarf) {
            case "a":
            case "ı":
            case "o":
            case "u":
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
                break;
        }
    }
}