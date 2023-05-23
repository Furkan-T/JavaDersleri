package dataAccess.InstructorDao;

import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
    public void add(Instructor[] instructors){
        for(Instructor instructor:instructors){
            System.out.println(instructor.getFirstName() + ": Jdbc ile loglandı"); 
        }
    }
}
