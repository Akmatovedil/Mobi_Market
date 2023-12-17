package com.example.Mobi_Market.service.seviceImpl;

import com.example.Mobi_Market.dto.ImageDto;
import com.example.Mobi_Market.entity.Image;
import com.example.Mobi_Market.mapper.ImageMapper;
import com.example.Mobi_Market.repository.ImageRepo;
import com.example.Mobi_Market.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

//@NoArgsConstructor
@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService {
    private final ImageRepo imageRepo;
    private final ImageMapper imageMapper;

    @Override
    public Long uploadPhoto(ImageDto imageDto) {

        Image image = imageMapper.toEntity(imageDto);

        Long id = imageRepo.save(image).getId();

        return id;


    }
}