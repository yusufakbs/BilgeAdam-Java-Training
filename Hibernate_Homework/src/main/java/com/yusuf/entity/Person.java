package com.yusuf.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class Person {
    private String name;
    private String surname;
    @Column(unique = true)
    private String identityNumber;
    private Long birthDate;
}
