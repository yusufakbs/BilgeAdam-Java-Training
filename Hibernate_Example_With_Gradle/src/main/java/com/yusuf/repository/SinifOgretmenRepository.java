package com.yusuf.repository;

import com.yusuf.entity.Sinif_Ogretmen;

public class SinifOgretmenRepository extends RepositoryManager<Sinif_Ogretmen,Long> {

    public SinifOgretmenRepository() {
        super(new Sinif_Ogretmen());
    }
}
