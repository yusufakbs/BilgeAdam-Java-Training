package com.yusuf.repository;

import com.yusuf.entity.Student;
import com.yusuf.utility.HibernateUtility;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.List;


public class StudentRepository extends FactoryRepository<Student,Long> {
    private EntityManager entityManager;

    public StudentRepository() {
        super(new Student());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
    }

    public List<String> getAllStudentNames() {
        String jpql = "SELECT s.person.name FROM Student s";
        TypedQuery<String> query = entityManager.createQuery(jpql, String.class);
        return query.getResultList();
    }

    public List<Long> getStudentBirthDate() {
        String jpql = "SELECT s.person.birthDate FROM Student s";
        TypedQuery<Long> query = entityManager.createQuery(jpql, Long.class);
        return query.getResultList();
    }

    public List<Long> getStudentBirthDateAfterYear(int year) {
        long startDate = LocalDate.of(year, 1, 1).atStartOfDay().toEpochSecond(ZoneOffset.UTC) * 1000;
        String jpql = "SELECT s.person.birthDate FROM Student s WHERE s.person.birthDate > :date";
        TypedQuery<Long> query = entityManager.createQuery(jpql, Long.class);
        query.setParameter("date", startDate);
        return query.getResultList();
    }

}





