package com.example.Mobi_Market.mapper;

import com.example.Mobi_Market.dto.UserDto;
import com.example.Mobi_Market.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    User toEntity(UserDto userDto);
    UserDto toDTO(User user);
    List<UserDto> toDTOList(List<User> userList);
}
