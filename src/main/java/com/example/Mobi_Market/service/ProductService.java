package com.example.Mobi_Market.service;


import com.example.Mobi_Market.dto.ProductDto;
import com.example.Mobi_Market.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    ProductDto saveProduct(ProductDto productDto);

    ProductDto updateProduct(ProductDto productDto, long id);
    List<ProductResponse> findAllProduct();
    ProductDto getProductById(Long id);
    void deleteProduct(Long id);
}
