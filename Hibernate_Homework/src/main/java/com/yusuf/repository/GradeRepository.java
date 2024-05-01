package com.yusuf.repository;

import com.yusuf.entity.Grade;

public class GradeRepository extends FactoryRepository<Grade,Long> {
    public GradeRepository(){super(new Grade());}
}
