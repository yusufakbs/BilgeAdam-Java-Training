package com.yusuf.repository;

import com.yusuf.entity.Deneme;

public class DenemeRepository extends RepositoryManager<Deneme,Long>{

    public DenemeRepository() {
        super(new Deneme());
    }
}
