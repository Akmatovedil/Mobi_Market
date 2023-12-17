package com.example.Mobi_Market.mapper;

import com.example.Mobi_Market.dto.ProductDto;
import com.example.Mobi_Market.dto.ProductResponse;
import com.example.Mobi_Market.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(target = "image",
            expression = "java(productDto.getImageId() == null ?" +
                    "null :" +
                    "new com.example.onlineshop.entity.Image(productDto.getImageId(),null,null,null))")
    Product toEntity(ProductDto productDto);

    @Mapping(target = "imageId", source = "image.id")
    ProductDto toDTO(Product product);

    List<ProductDto> toDTOList(List<Product> productList);

    ProductResponse toResponse(Product product);

    List<ProductResponse> toResponseList(List<Product> productList);

    @Mapping(target = "image",
            expression = "java(productDto.getImageId() == null ?" +
                    "product.getImage() :" +
                    "new com.example.onlineshop.entity.Image(productDto.getImageId(),null,null,null))")
    void update(@MappingTarget Product product, ProductDto productDto);

}
