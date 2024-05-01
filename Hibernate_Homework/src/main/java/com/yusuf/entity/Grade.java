package com.yusuf.entity;

import com.yusuf.utility.enums.EQuality;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tbl_grade")
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String gradeName;
    @Enumerated(EnumType.STRING)
    private EQuality eQuality;
    @Column(unique = true)
    private String identityNumber;

}
