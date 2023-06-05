package com.example.shop.service;

import com.example.shop.dto.ProductDto;
import com.example.shop.enums.ProductType;
import com.example.shop.mapper.ProductMapper;
import com.example.shop.model.Product;
import com.example.shop.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;


    @Override
    public List<Product> getProductsByProductType(ProductType type) {
        return productRepository.findProductsByProductType(type);
    }

    @Override
    public ProductDto getProductById(Long id) {
        return productMapper.mapToDto(productRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Product with id " + id + " not found.")));
    }

    @Override
    public void addProduct(ProductDto productDto) {
        Product product = productMapper.map(productDto);
        productRepository.save(product);
    }

    @Override
    public void updateProduct(Long id, ProductDto productDto) {

        productRepository.findById(id)
                .map(p -> productMapper.update(productDto, p))
                .ifPresentOrElse(productRepository::save,
                    () -> { throw new NotFoundException("Product with id " + id + " not found."); });

    }
}
