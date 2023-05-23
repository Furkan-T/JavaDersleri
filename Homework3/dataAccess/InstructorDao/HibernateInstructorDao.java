package dataAccess.InstructorDao;

import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
    public void add(Instructor[] instructors){
        for(Instructor instructor:instructors){
            System.out.println(instructor.getFirstName() + ": Hibernate ile loglandı"); 
        }
    }
}
