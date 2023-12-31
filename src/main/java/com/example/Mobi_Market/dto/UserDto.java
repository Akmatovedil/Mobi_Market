package com.example.Mobi_Market.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDto {
    String email;
    String surname;
    String name;
    LocalDate birthdayDay;
    String phoneNumber;
}
