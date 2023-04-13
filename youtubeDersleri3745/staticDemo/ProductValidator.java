package staticDemo;

public class ProductValidator {
    static{
        System.out.println("Statik yapıcı blok calısır.");
    }

    public ProductValidator(){
        System.out.println("Yapıcı blok calısır.");
    }
    public boolean isValid(Product product){
        if(product.price > 0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public void bisey(){

    }
    //inner class
    public class BaskaBirClass {
        public void sil(){

        }
    }
}
