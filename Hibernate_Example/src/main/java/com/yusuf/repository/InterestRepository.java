package com.yusuf.repository;

import com.yusuf.entity.Interest;

public class InterestRepository extends MyFactoryRepository<Interest,Long> {
    public InterestRepository() {
        super(new Interest());
    }
}