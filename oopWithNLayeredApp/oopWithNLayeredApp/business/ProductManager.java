package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
    private ProductDao productDao;
    private oopWithNLayeredApp.core.logging.Logger[] loggers;

    
    public ProductManager(ProductDao productDao, oopWithNLayeredApp.core.logging.Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception{
        //iş kuralları
        if(product.getUnitPrice() < 10){
            throw new Exception("Ürünün fiyatı 10'dan küçük olamaz");
        }

        productDao.add(product);
        for (oopWithNLayeredApp.core.logging.Logger logger : loggers) {
            logger.log(product.getName());
        }
    }
}
