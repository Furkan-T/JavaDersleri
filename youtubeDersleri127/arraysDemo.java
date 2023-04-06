package youtubeDersleri127;

public class arraysDemo {
    public static void main(String[] args) {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Osman";
        String ogrenci3 = "Derin";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        //instead of this

        System.out.println("-----------------------");


        String[] ogrenciler = new String[4];

        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Osman";
        ogrenciler[2] = "Derin";
        ogrenciler[3] = "Furkan";

        for(int i=0; i<ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("------");
        
        //better usage
        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}
