package com.yusuf.service;

import com.yusuf.entity.Ogrenci;
import com.yusuf.repository.OgrenciRepository;

public class OgrenciService {
    OgrenciRepository ogrenciRepository;

    public  OgrenciService(){
        this.ogrenciRepository = new OgrenciRepository();
    }

    public Ogrenci saveOgrenci(Ogrenci ogrenci){
        return ogrenciRepository.save(ogrenci);
    }
}
