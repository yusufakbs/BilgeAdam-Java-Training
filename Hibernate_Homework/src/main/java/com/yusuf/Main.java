package com.yusuf;

import com.yusuf.entity.Grade;
import com.yusuf.entity.Person;
import com.yusuf.entity.Student;
import com.yusuf.entity.Teacher;
import com.yusuf.repository.GradeRepository;
import com.yusuf.repository.StudentRepository;
import com.yusuf.repository.TeacherRepository;
import com.yusuf.utility.enums.EBranch;
import com.yusuf.utility.enums.EGender;
import com.yusuf.utility.enums.EQuality;

import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;

import static com.yusuf.utility.DateUtils.convertStringToLong;


public class Main {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();
        TeacherRepository teacherRepository = new TeacherRepository();
        GradeRepository gradeRepository = new GradeRepository();

//        Person person = Person.builder().name("Buse").surname("Pek").identityNumber("56475869004").birthDate(convertStringToLong("1993-01-22")).build();
//        Teacher teacher = Teacher.builder()
//                .eBranch(EBranch.MATH)
//                .gender(EGender.FEMALE)
//                .person(person)
//                .build();
//        teacherRepository.save(teacher);
//        Grade teacherGrade = Grade.builder().gradeName("11-d").eQuality(EQuality.TEACHER).identityNumber(person.getIdentityNumber()).build();
//        gradeRepository.save(teacherGrade);
//        teacherRepository.update(teacher);
//
//
//        Person person2 = Person.builder().name("Simay").surname("Selin").identityNumber("64756463522").birthDate(convertStringToLong("2000-06-06")).build();
//        Student student = Student.builder()
//                .gender(EGender.MALE)
//                .studentNumber("33")
//                .person(person)
//                .build();
//        studentRepository.save(student);
//        Grade studentGrade = Grade.builder().gradeName("11-d").eQuality(EQuality.STUDENT).identityNumber(person.getIdentityNumber()).build();
//        gradeRepository.save(studentGrade);
//        studentRepository.update(student);


        System.out.println(studentRepository.getAllStudentNames());
        System.out.println(studentRepository.getStudentBirthDate());
        System.out.println(studentRepository.getStudentBirthDateAfterYear(2030));

    }






}