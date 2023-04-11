package youtubeDersleri2437.classesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop", "Asus laptop", 5000, 3,"Mavi","L1");
        Product product1 = new Product();




        product1.setName("Laptop");
        product1.setId(2);
        product1.setPrice(5000);
        product1.setDescription("Lenovo Laptop");
        product1.setStockAmount(3);
        product1.setRenk("Siyah");

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        productManager.Add(product1);

        System.out.println(product.getKod());
        System.out.println(product1.getKod());
    }
}
