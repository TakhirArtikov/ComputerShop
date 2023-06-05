package com.example.shop.dto;

import com.example.shop.enums.ProductType;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import lombok.ToString;


@Data
@JsonTypeInfo(
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "productType",
        use = JsonTypeInfo.Id.NAME,
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = HddDto.class, name = "HARD_DISC"),
        @JsonSubTypes.Type(value = LaptopDto.class, name = "LAPTOP"),
        @JsonSubTypes.Type(value = MonitorDto.class, name = "MONITOR"),
        @JsonSubTypes.Type(value = PcDto.class, name = "PERSONAL_COMPUTER")
})
@ToString
public abstract class ProductDto {

    private ProductType productType;

    private String serialNumber;

    private String manufacturer;

    private long price;

    private int quantity;
}
