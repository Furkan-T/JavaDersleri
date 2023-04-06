package oop1;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Delonghi kahve makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("bilmemne.jpg");

        Product product2 = new Product();
        product2.setName("Smeg kahve makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("bilmemne.jpg");


        Product product3 = new Product();
        product3.setName("Kitchen Aid kahve makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("bilmemne.jpg");


        Product[] products = {product1,product2,product3};

        for (Product product : products) {
            System.out.println(product.getName());
        }


        IndividualCustomer individualCustomer1 = new IndividualCustomer();

        individualCustomer1.setId(1);
        individualCustomer1.setPhone("0522222222");
        individualCustomer1.setCustomerNumber("12345");
        individualCustomer1.setFirstName("Engin");
        individualCustomer1.setLastName("Demiroğ");


        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("05333333333");
        corporateCustomer.setTaxNumber("1111111");
        corporateCustomer.setCustomerNumber("54321"); 


        Customer[] customers = {individualCustomer1,corporateCustomer};

        for (Customer customer : customers) {
            System.out.println(customer.getId());
        }
    }
}
