package softwaredesign.demo.ykdtest.class_assign;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Eris
 * @Date 2023/4/3 8:30
 */
public class Register {
    private static AtomicInteger count = new AtomicInteger(0);

    public Student regId(Student student){
        student.setId(count.incrementAndGet());
        return student;
    }
}
