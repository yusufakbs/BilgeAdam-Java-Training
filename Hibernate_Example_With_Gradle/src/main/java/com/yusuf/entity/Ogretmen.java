package com.yusuf.entity;

import com.yusuf.utility.EBrans;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "tbl_ogretmen")
public class Ogretmen extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private KisiselBilgiler kisiselBilgiler;
    @Enumerated(EnumType.STRING)
    private EBrans brans;
    @Column(name = "ise_baslama_tarihi")
    private Long iseGirisTarihi;

}
