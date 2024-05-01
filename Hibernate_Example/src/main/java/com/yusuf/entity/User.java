package com.yusuf.entity;

import com.yusuf.utility.enums.EGender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tbl_user") //Zorunlu olmamakla birlikte, best practice her tabloya tbl_ şablonunu kullanarak isim vermekte fayda var.
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Name name;
    /*
    unique = true -> özgün değer, Tabloda bu değerden sadece 1 tane olabilir.
    nullable = false -> Bu alan boş bırakılamaz. Oluşturulma ve
    DB'e gönderilmeden önce mutl6"789aka ama mutlaka içerisine bir değer yerleştirilmeli.
     */
    @Column(unique = true,nullable = false)
    private String username;

    @Column(nullable = false,length = 32)
    private String password;

    /*
    @Enumerated anotasyonu enum'ların DB tablosunda nasıl görüntüleneceğini belirlemek için kullanılır.
    2 farklı parametre alabilir;
        1- EnumType.ORDINAL -> Enum'ın ordinal değerini(indexini) baz alarak kayıt işlemi gerçekleştirir. (0,1,2,3,4,5...)
        2- EnumType.String -> Enum'ın String değerini baz alarak kayıt işlemi gerçekleştirir. (MALE, FEMALE)
     Eğer @Enumerated anotasyonu ile işaretleme yapmazsak, default değer olarak ORDINAL'i alır.
     */
    @Enumerated(EnumType.STRING)
    private EGender gender;

    /*
    * OneToMany, ManyToOne ilişkilendirmelerinde Liste tutan tarafa ihtiyacımız yok.( @OneToMany kısmına )
    * Çünkü; Liste tutmak çapraz tablo oluşmasına sebep olacaktır. Bu oluşacak olan çapraz tablo bizi sadece user entity'si tarafında rahatlatır.
    * Bu rahatlama user.getInterest() method'u aracılığıyla "DOĞRUDAN" bir user ile ilişkilendirilmiş interest'leri getirme imkanı sağlar
    *
    * ANCAK!!!
    * Bu kolaylığa erişmek için User ve Interest oluştururkenki oluşturma hiyerarşimizde dikkatli olmamız gerekir.
    * Doğru sıralamayla query oluşturmazsak patlarız.Bununla birlikte çapraz tablo oluşturmamız neticesinde DB'ye ekstra yük bindiririz.
    * Verileri oluştururken hata yapma olasılığımız yükselir, transient-persistent state durumlarını çok iyi yönetmemiz gerekir.
    *
    * BUNUN YERINE
    * Interest ve User arasındaki ilişkilendirmede tekli ID tutacak entity'de(Interest) ilişkilendirileceği entity(User) ID'sini tutarız.
    * Spesifik bir user'ın ilgi alanlarına ihtiyaç haline getirmek içinde basit bir join query'si yazarız.
    *
    * BU SAYEDE
    * DB'de ekstra yükten kurtuluruz. Bir User'ın Interest'lerine sadece ihtiyaç duyduğumuzda erişebileceğmiz bir yapı oluştururuz.
    * DB'ye veri eklerken persistent ve transient durumlarını yönetmesi daha kolay bir hal alır. Önce cascade hiyerarşisinde üstte kalan (User) entity
    * oluşturulur. Sonra altta kalan(Interest) entity içerisine üstte kalan(User) entity'i yerleştiririz. Bunun bir sonucu olarak User özgün hali ile
    * varolduktan sonra Interest oluşturulduğu için içeriye User'ı verince Interest'te user_id tanımlanmış olur.
    * Bu şekilde de bu iki tablo arasında Dolaylı çift yönlü bağlantı (Indirect bydirectional relationship) tek bir entity üzerinden kurulur.
    * */
////    @ElementCollection //İçerisinde Wrapper class saklayalan collection yapılarını DB'de ayrı bir tablo olarak tutmak için kullanılır.
//    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @Builder.Default
//    private List<Interest> interests = new ArrayList<>();


}