package softwaredesign.demo.ykdtest.class_assign;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * @author Eris
 * @Date 2023/4/3 8:30
 */
public class StudentIDTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i <= 10; i++){
            Student student = new Student();
            student.setName("student" + i);
            students.add(student);
        }

        Register register = new Register();

        students.forEach(s -> {
            CompletableFuture.supplyAsync(
                    () -> register.regId(s)
            )
                    .thenAccept(student1 -> {
                        System.out.println("Hello! " + student1.getName() + ", Welcome to our family!");
                    });
        });

        System.out.println("mission complate");
    }
}
