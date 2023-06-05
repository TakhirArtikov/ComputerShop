package com.example.shop.model;

import com.example.shop.enums.LaptopScreenSize;
import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("LAPTOP")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Laptop extends Product {
    @Enumerated(EnumType.STRING)
    private LaptopScreenSize laptopScreenSize;
}
