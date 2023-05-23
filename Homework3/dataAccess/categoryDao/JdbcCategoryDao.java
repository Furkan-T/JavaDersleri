package dataAccess.categoryDao;

import entities.Category;

public class JdbcCategoryDao implements CategoryDao{

    @Override
    public void add(Category[] categories) {
        for(Category category:categories){
            System.out.println(category.getName() + ": Jdbc ile loglandı"); 
        }
    }
    
}
