package com.yusuf.service;
import com.yusuf.entity.Ogrenci;
import com.yusuf.entity.Sinif;
import com.yusuf.repository.Sinif_Repository;

public class SinifService {
    Sinif_Repository sinifRepository;

    public SinifService(){
        this.sinifRepository = new Sinif_Repository();
    }

    public Sinif saveSinif(Sinif sinif){
        return sinifRepository.save(sinif);
    }
}
