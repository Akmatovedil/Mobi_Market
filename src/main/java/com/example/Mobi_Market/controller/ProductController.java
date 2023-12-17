package com.example.Mobi_Market.controller;


import com.example.Mobi_Market.dto.ImageDto;
import com.example.Mobi_Market.dto.ProductDto;
import com.example.Mobi_Market.dto.ProductResponse;
import com.example.Mobi_Market.service.ImageService;
import com.example.Mobi_Market.service.ProductService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.Mobi_Market.configuration.SwaggerConfig.PRODUCT;


@Api(tags = PRODUCT)
@AllArgsConstructor
@RestController
@RequestMapping("/product")
public class
ProductController {
    private final ProductService productService;
    private final ImageService imageService;
    @PostMapping("/save")
    //,@RequestPart MultipartFile file
    public ProductDto saveProduct(@RequestBody ProductDto productDto){
        return productService.saveProduct(productDto);
    }

    @PostMapping("/upload")
    public Long uploadPhoto(@RequestBody ImageDto imageDto){
        return imageService.uploadPhoto(imageDto);
    }

    @PutMapping("/update/{id}")
    public ProductDto updateProduct(@RequestBody ProductDto productDto, @PathVariable long id){
        return productService.updateProduct(productDto, id);
    }
    @GetMapping("/findAll")
    public List<ProductResponse> findAll(){
        return productService.findAllProduct();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@RequestParam Long id){
        productService.deleteProduct(id);
    }
}
