package overriding;

public class OgrenciKrediManager extends BaseKrediManager {
    //overriding, üzerine yazma
    public double hesapla(double tutar){
        return tutar * 1.10;
    }
}
