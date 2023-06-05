package com.example.shop.model;

import com.example.shop.enums.FormFactor;
import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("PERSONAL_COMPUTER")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonalComputer extends Product {
    @Enumerated(EnumType.STRING)
    private FormFactor formFactor;
}