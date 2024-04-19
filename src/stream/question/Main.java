package stream.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        List<Student> studentList = createStudents(1000000);
        studentList.forEach(System.out::println);
        double studentGradeAverage = studentList.stream().mapToDouble(Student::getGrade).average().orElse(0);
        System.out.println(studentGradeAverage);

    }

    public static List<Student> createStudents(int num){
        List<Student> studentList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < num; i++){
            int grade = random.nextInt(100);
            Student student = new Student("Suleyman","Çakır "+(i+1),grade);
            studentList.add(student);
        }
        return studentList;
    }
}
