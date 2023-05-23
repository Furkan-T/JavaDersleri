package dataAccess.categoryDao;

import entities.Category;

public class HibernateCategoryDao implements CategoryDao{

    @Override
    public void add(Category[] categories) {
        for(Category category:categories){
            System.out.println(category.getName() + ": Hibernate ile loglandı"); 
        }
    }
    
}
