package com.yusuf.service;

import com.yusuf.entity.Ogrenci;
import com.yusuf.entity.Sinif_Ogretmen;
import com.yusuf.repository.OgrenciRepository;
import com.yusuf.repository.SinifOgretmenRepository;
import com.yusuf.repository.Sinif_Repository;

public class SinifOgretmenService {
    SinifOgretmenRepository sinifOgretmenRepository;

    public SinifOgretmenService(){
        this.sinifOgretmenRepository = new SinifOgretmenRepository();
    }

    public Sinif_Ogretmen saveSinif_Ogretmen(Sinif_Ogretmen sinifOgretmen){
        return sinifOgretmenRepository.save(sinifOgretmen);
    }
}
