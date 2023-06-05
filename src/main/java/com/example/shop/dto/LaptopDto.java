package com.example.shop.dto;

import com.example.shop.enums.LaptopScreenSize;
import lombok.Data;

@Data
public class LaptopDto extends ProductDto{
    private LaptopScreenSize laptopScreenSize;
}
