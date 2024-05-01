package com.yusuf.repository;

import com.yusuf.entity.Ogrenci;

public class OgrenciRepository extends RepositoryManager<Ogrenci,Long> {
    public OgrenciRepository() {
        super(new Ogrenci());
    }

}
