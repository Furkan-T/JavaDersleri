package youtubeDersleri2437.classes;

public class Main {
    public static void main(String[] args) {
        //referans type
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();

        customerManager = customerManager2;

        customerManager.add();
        customerManager.remove();
        customerManager.update();

        int[] sayilar = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};

        sayilar2 = sayilar;
        sayilar[0] = 10;
        System.out.println(sayilar2[0]);

        //value type

        int sayi1 = 5;
        int sayi2 = 10;
        sayi1=sayi2;
        sayi2=20;
        System.out.println(sayi1);
    }
}
