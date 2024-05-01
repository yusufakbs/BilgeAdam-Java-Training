package com.yusuf;

import com.yusuf.entity.*;
import com.yusuf.service.OgrenciService;
import com.yusuf.service.OgretmenService;
import com.yusuf.service.SinifOgretmenService;
import com.yusuf.service.SinifService;
import com.yusuf.utility.EBrans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static SinifService sinifService = new SinifService();
    static OgretmenService ogretmenService = new OgretmenService();
    static OgrenciService ogrenciService = new OgrenciService();
    static SinifOgretmenService sinifOgretmenService = new SinifOgretmenService();
    Scanner scanner = new Scanner(System.in);


//    public Main() {
//        this.sinifService = new SinifService();
//        this.ogretmenService = new OgretmenService();
//        this.ogrenciService = new OgrenciService();
//        this.sinifOgretmenService = new SinifOgretmenService();
//    }

    public static void main(String[] args) {
        Main main = new Main();
        main.uygulama();


    }

    public void uygulama() {
        menu();
    }

    public void menuOptions() {
        System.out.println("1- Ogretmen Olustur");
        System.out.println("2- Ogrenci Olustur");
        System.out.println("3- Sinif Olustur");
        System.out.println("4- Sinifa Ogretmen Ata");
        System.out.println("0- Cikis yap");
    }

    public void menu() {
        int secim = 0;
        boolean exitStatus = true;
        while (exitStatus) {
            menuOptions();
            System.out.print("Lutfen seciminizi yapiniz : ");
            secim = Integer.parseInt(scanner.nextLine());
            switch (secim) {
                case 1: {
                    ogretmenOlustur();
                    break;
                }

                case 2: {
                    ogrenciOlustur();
                    break;
                }

                case 3: {
                    sinifOlustur();
                    break;
                }

                case 4: {
                    sinifaOgretmenAta();
                    break;
                }
                case 0: {
                    System.err.println("Gorusmek uzere!");
                    exitStatus = false;
                    break;
                }
                default: {
                    System.err.println("Lutfen gecerli bir değer giriniz!");
                    break;
                }
            }
        }
    }

    public void sinifOlustur() {
        Sinif sinif = Sinif.builder()
                .sinifAdi(getStringValue("Sınıf adınız giriniz : "))
                .build();
        sinifService.saveSinif(sinif);
    }

    public Long sinifSec(String message) {
        while (true) {
            try {
                List<Sinif> sinifList = sinifService.findAll();
                sinifList.forEach(sinif -> {
                    System.out.println("Sinif adi : " + sinif.getSinifAdi() + " ID -> " + sinif.getId());
                });
                System.out.print(message);
                Long sinifId = Long.parseLong(scanner.nextLine());
                try {
                    Optional<Sinif> sinifOptional = Optional.ofNullable(sinifList.stream().filter(x -> Objects.equals(x.getId(), sinifId)).collect(Collectors.toList()).get(0));
                    if (sinifOptional.isPresent()) {
                        return sinifOptional.get().getId();
                    }
                } catch (Exception e) {
                    System.out.println("Lutfen gecerli bir sinif id'si giriniz!");
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Lutfen sadece sayi giriniz.");
            }
        }
    }

    public void ogretmenOlustur() {
        Ogretmen ogretmen = Ogretmen.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim(getStringValue("Lutfen bir isim giriniz : "))
                        .soyisim(getStringValue("Lutfen bir soyisim giriniz : "))
                        .tcKimlik(getStringValue("Lutfen TcKimlik numarasını (max 11) giriniz : "))
                        .build())
                .brans(bransSec("Lutfen bir brans giriniz : "))
                .build();
        ogretmenService.saveOgretmen(ogretmen);
    }

    public EBrans bransSec(String message) {
        while (true) {
            System.out.println("\n Secilebilecek Branslar \n");
            for (int i = 0; i < EBrans.values().length; i++) {
                System.out.println(EBrans.values()[i]);
            }
            System.out.println(message);
            try {
                EBrans eBrans = EBrans.valueOf(scanner.nextLine());
                return eBrans;
            } catch (Exception e) {
                System.err.println("Lutfen gecerli bir brans giriniz!");
            }
        }
    }

    public void sinifaOgretmenAta() {
        List<Sinif> sinifList = new ArrayList<>();
        List<Ogretmen> ogretmenList = new ArrayList<>();
        try {
            sinifList = sinifService.findAll();
            ogretmenList = ogretmenService.findAll();
        } catch (Exception e) {
            System.out.println("Beklenmedik bir sorunlar karsilasildi! Oturum sonlandırılıyor.");
            System.exit(1);
        }
        if (!sinifList.isEmpty() && !ogretmenList.isEmpty()) {
            while (true) {
                try {
                    sinifList.forEach(sinif -> {
                        System.out.println("Sinif adi : " + sinif.getSinifAdi() + " ID -> " + sinif.getId());
                    });
                    System.out.print("Lutfen atama yapmak istediginiz sinifin id'sini giriniz : ");
                    Long sinidId = Long.parseLong(scanner.nextLine());
                    Optional<Sinif> sinifOptional = Optional.ofNullable(sinifList.stream().filter(x -> Objects.equals(x.getId(), sinidId)).collect(Collectors.toList()).get(0));
                    if (sinifOptional.isPresent()) {
                        while (true) {
                            try {
                                ogretmenList.forEach(ogretmen -> {
                                    System.out.println(
                                            "\nOgretmen adi : " + ogretmen.getKisiselBilgiler().getIsim() +
                                                    "\nOgretmen soyadi : " + ogretmen.getKisiselBilgiler().getSoyisim() +
                                                    "\nOgretmen brans : " + ogretmen.getBrans() +
                                                    "\nOgretmen ID :  " + ogretmen.getId() + "\n"
                                    );
                                });

                                System.out.println("Lutfen atama yapmak istediginiz ogretmenin id'sini giriniz : ");
                                Long ogretmenId = Long.parseLong(scanner.nextLine());
                                Optional<Ogretmen> ogretmenOptional = Optional.ofNullable(ogretmenList.stream().filter(x -> Objects.equals(x.getId(), ogretmenId)).collect(Collectors.toList()).get(0));
                                if (ogretmenOptional.isPresent()) {
                                    Sinif_Ogretmen sinifOgretmen = Sinif_Ogretmen.builder()
                                            .ogretmen_id(ogretmenOptional.get().getId())
                                            .sinif_id(sinifOptional.get().getId())
                                            .build();
                                    sinifOgretmenService.saveSinif_Ogretmen(sinifOgretmen);
                                    break;
                                }

                            } catch (Exception e) {
                                System.out.println("Lutfen gecerli bir ogretmen id'si giriniz!");
                            }
                        }
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Lutfen gecerli bir sinif id'si giriniz!");
                }
            }
        } else {
            System.out.println("Sinif yada ogretmen bilgisi bulunmuyor!");
        }
    }

    public void ogrenciOlustur() {
        Ogrenci ogrenci = Ogrenci.builder()
                .sinifId(sinifSec("Lutfen ogrenciyi kaydetmek istediginiz sinifin id'sini giriniz : "))
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim(getStringValue("Lutfen isim giriniz : "))
                        .soyisim(getStringValue("Lutfen soyisim giriniz :"))
                        .tcKimlik(getStringValue("Lutfen TcKimlok no giriniz :"))
                        .build())
                .dogumTarihi(getBirthDate("Lutfen uygun formatta (gun/ay/yil) dogum tarihi giriniz : "))
                .build();
        ogrenciService.saveOgrenci(ogrenci);
    }

    public String getStringValue(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public Long getBirthDate(String message) {
        while (true) {
            try {
                System.out.print(message);
                String tarihString = scanner.nextLine();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date tarih = dateFormat.parse(tarihString);
                long epochMillisaniye = tarih.getTime();
                return epochMillisaniye;
            } catch (ParseException e) {
                System.out.println("\nLutfen istenilen formatta giriniz!!!");
            }
        }
    }

}