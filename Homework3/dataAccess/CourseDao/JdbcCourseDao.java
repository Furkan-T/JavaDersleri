package dataAccess.CourseDao;

import entities.Course;

public class JdbcCourseDao implements CourseDao{

    @Override
    public void add(Course[] courses) {
        for(Course course:courses){
            System.out.println(course.getName() + ": Jdbc ile loglandı"); 
        }
    }
    
}
