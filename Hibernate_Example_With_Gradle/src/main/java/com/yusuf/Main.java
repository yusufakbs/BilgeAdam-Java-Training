package com.yusuf;

import com.yusuf.entity.*;
import com.yusuf.service.OgrenciService;
import com.yusuf.service.OgretmenService;
import com.yusuf.service.SinifOgretmenService;
import com.yusuf.service.SinifService;
import com.yusuf.utility.EBrans;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static SinifService sinifService = new SinifService();
    static OgretmenService ogretmenService = new OgretmenService();
    static OgrenciService ogrenciService = new OgrenciService();
    static SinifOgretmenService sinifOgretmenService = new SinifOgretmenService();

//    public Main() {
//        this.sinifService = new SinifService();
//        this.ogretmenService = new OgretmenService();
//        this.ogrenciService = new OgrenciService();
//        this.sinifOgretmenService = new SinifOgretmenService();
//    }

    public static void main(String[] args) {
        Sinif sinif = Sinif.builder()
                .sinifAdi("10-A")
                .build();
        sinifService.saveSinif(sinif);



        Ogretmen ogretmen = Ogretmen.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Alperen")
                        .soyisim("İkinci")
                        .tcKimlik("12345678912").build())
                .brans(EBrans.FIZIK)
                .build();

        Ogretmen ogretmen2 = Ogretmen.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Mert")
                        .soyisim("Murat")
                        .tcKimlik("12345678916").build())
                .brans(EBrans.FIZIK)
                .build();

        ogretmenService.saveOgretmen(ogretmen);
        ogretmenService.saveOgretmen(ogretmen2);
        Sinif_Ogretmen sinifOgretmen = Sinif_Ogretmen.builder()
                .sinif_id(sinif.getId())
                .ogretmen_id(ogretmen.getId())
                .build();

        Sinif_Ogretmen sinifOgretmen2 = Sinif_Ogretmen.builder()
                .sinif_id(sinif.getId())
                .ogretmen_id(ogretmen2.getId())
                .build();

        sinifOgretmenService.saveSinif_Ogretmen(sinifOgretmen);
        sinifOgretmenService.saveSinif_Ogretmen(sinifOgretmen2);


        Ogrenci ogrenci = Ogrenci.builder()
                .sinifId(sinif.getId())
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Yusuf")
                        .soyisim("Akbaş")
                        .tcKimlik("12345678910")
                        .build())
                .dogumTarihi(123123123L)
                .build();
        Ogrenci ogrenci2 = Ogrenci.builder()
                .sinifId(sinif.getId())
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Rüveyda")
                        .soyisim("Yılmaz")
                        .tcKimlik("12345678918")
                        .build())
                .dogumTarihi(123123123L)
                .build();

        ogrenciService.saveOgrenci(ogrenci);
        ogrenciService.saveOgrenci(ogrenci2);


    }
}