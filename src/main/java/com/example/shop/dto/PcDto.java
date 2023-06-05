package com.example.shop.dto;

import com.example.shop.enums.FormFactor;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
public class PcDto extends ProductDto{
    @Enumerated(EnumType.STRING)
    private FormFactor formFactor;
}
