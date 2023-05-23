package dataAccess.CourseDao;

import entities.Course;

public class HibernateCourseDao implements CourseDao{

    @Override
    public void add(Course[] courses) {
        for(Course course:courses){
            System.out.println(course.getName() + ": Hibernate ile loglandı"); 
        }
    }
    
}
