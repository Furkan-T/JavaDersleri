package business;

import core.logging.Logger;
import dataAccess.categoryDao.CategoryDao;
import entities.Category;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    private Category[] categories;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers){
        this.categoryDao = categoryDao;
        this.loggers = loggers;

    }

    public void add(Category category) throws Exception{
        for (Category category2 : categories){
            if(category.getName() == category2.getName()){
                throw new Exception("Kategori isimleri aynı olamaz.");
            }else{
                categoryDao.add(categories);
            }
        }
        for(Logger logger: loggers){
            logger.log("Loglandı");
        }
        
    }
    
}
