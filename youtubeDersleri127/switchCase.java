package youtubeDersleri127;

public class switchCase {
    public static void main(String[] args) {
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Çok iyi");
                break;
            case 'B':
                System.out.println("iyi");
                break;
            case 'C':
                System.out.println("fena degil");
                break;
            case 'D':
                System.out.println("kotu");
                break;
            case 'F':
                System.out.println("Cok kotu");
                break;
            default:
                System.out.println("Yanlıs karakter girdiniz.");
                break;
        }
    }
}
