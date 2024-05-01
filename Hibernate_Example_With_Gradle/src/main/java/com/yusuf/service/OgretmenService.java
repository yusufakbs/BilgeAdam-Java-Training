package com.yusuf.service;

import com.yusuf.entity.Ogrenci;
import com.yusuf.entity.Ogretmen;
import com.yusuf.repository.OgrenciRepository;
import com.yusuf.repository.OgretmenRepository;

import java.util.List;

public class OgretmenService {
    OgretmenRepository ogretmenRepository;

    public OgretmenService(){
        this.ogretmenRepository = new OgretmenRepository();
    }


    public Ogretmen saveOgretmen(Ogretmen ogretmen){
        ogretmen.setIseGirisTarihi(System.currentTimeMillis());
        return ogretmenRepository.save(ogretmen);
    }

    public List<Ogretmen> findAll(){
        return ogretmenRepository.findAll();
    }
}
