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
    private EBrans brans;
    private Long iseGirisTarihi;
    private List<Long> sinifIdList;
}
