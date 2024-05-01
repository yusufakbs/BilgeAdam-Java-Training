package stream.question;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<Student> studentList = createStudents(100);
        studentList.forEach(System.out::println);
        double studentGradeAverage = studentList.stream().mapToDouble(Student::getGrade).average().orElse(0);
        System.out.println(studentGradeAverage);

        List<Student> studentBellowBound = studentList.stream()
                .filter(x -> x.getGrade() < 50).toList();

        List<Student> studentList1 = studentList;
        studentList1.forEach(student -> System.out.println("Name:" + student.getName() + ", Surname:" + student.getSurname()));


        Map<String, Integer> newList = new HashMap<>();
        newList = studentList.stream().collect(Collectors.toMap(k -> k.getSurname(), Student::getGrade));
        System.out.println(newList.values());







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
