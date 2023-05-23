package business;

import core.logging.Logger;
import entities.Instructor;

public class InstructorManager {
    private Instructor instructor;
    private core.logging.Logger[] loggers;

    public InstructorManager(Instructor instructor, Logger[] loggers){
        this.instructor = instructor;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) throws Exception{
        instructor.add();

        for(core.logging.Logger logger: loggers){
            logger.log(instructor.getFirstName());
        }
    }

    
}
