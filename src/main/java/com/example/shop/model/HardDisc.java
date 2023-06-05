package com.example.shop.model;

import com.example.shop.enums.LaptopScreenSize;
import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("HARD_DISC")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HardDisc extends Product {
    private long capacity;
}
