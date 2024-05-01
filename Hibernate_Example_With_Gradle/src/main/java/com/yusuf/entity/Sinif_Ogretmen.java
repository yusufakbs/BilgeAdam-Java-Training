package com.yusuf.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Entity
@Table(name = "tbl_siniflar_ogrretmenler")
public class Sinif_Ogretmen extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "sinif_id")
    private Long sinif_id;
    @Column(name = "ogretmen_id")
    private Long ogretmen_id;
}
