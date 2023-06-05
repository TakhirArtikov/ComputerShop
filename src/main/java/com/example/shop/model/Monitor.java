package com.example.shop.model;

import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@Entity
@DiscriminatorValue("MONITOR")
public class Monitor extends Product {

    private Double diagonalSize;
}
