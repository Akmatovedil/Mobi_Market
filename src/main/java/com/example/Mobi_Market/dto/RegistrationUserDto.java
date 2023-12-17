package com.example.Mobi_Market.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RegistrationUserDto {
     String username;
     String password;
     String email;
     String surname;
     String name;
     LocalDate birthdayDay;
     String phoneNumber;
}
