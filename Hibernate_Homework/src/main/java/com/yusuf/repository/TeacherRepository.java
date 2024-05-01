package com.yusuf.repository;

import com.yusuf.entity.Teacher;

public class TeacherRepository extends FactoryRepository<Teacher,Long> {
    public TeacherRepository() {
        super(new Teacher());
    }
}
