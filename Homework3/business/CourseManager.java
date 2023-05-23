package business;

import core.logging.Logger;
import dataAccess.CourseDao.CourseDao;
import dataAccess.categoryDao.CategoryDao;
import entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private Course[] courses;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Course[] courses){
        this.courseDao = courseDao;
        this.courses = courses;
    }


    public void add(Course course) throws Exception{
        for(Course course2 :courses){
            if(course.getName()== course2.getName()){
                throw new Exception("Birden fazla kurs ismi aynı olamaz");
            }
            else if(course.getPrice() < 0){
                throw new Exception("Kurs fiyatı sıfırdan düşük olamaz.");
            }
            else{
                courseDao.add(courses);
            }

            for(Logger logger : loggers){
                logger.log("Loglandı");
            }

        }
    }

}
