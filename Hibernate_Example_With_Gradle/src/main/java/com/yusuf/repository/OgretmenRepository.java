package com.yusuf.repository;

import com.yusuf.entity.Ogretmen;

public class OgretmenRepository extends RepositoryManager<Ogretmen,Long> {
    public OgretmenRepository() {
        super(new Ogretmen());
    }
}
