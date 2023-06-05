package com.example.shop.service;

import com.example.shop.dto.ProductDto;
import com.example.shop.enums.ProductType;
import com.example.shop.model.Product;

import java.util.List;

public interface ProductService {


    List<Product> getProductsByProductType(ProductType type);

    ProductDto getProductById(Long id);

    void addProduct(ProductDto productDto);

    void updateProduct(Long id, ProductDto productDto);

}
