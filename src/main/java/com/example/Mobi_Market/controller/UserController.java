package com.example.Mobi_Market.controller;

import com.example.Mobi_Market.dto.UserDto;
import com.example.Mobi_Market.service.seviceImpl.UserServiceImpl;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.Mobi_Market.configuration.SwaggerConfig.USER;


@AllArgsConstructor
@Api(tags = USER)
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserServiceImpl userServiceImpl;

    @PostMapping("/save")
    public UserDto saveUser(@RequestBody UserDto userDto) {

        return userServiceImpl.saveUser(userDto);
    }

    @PutMapping("/update")
    public UserDto updateUser(@RequestBody UserDto userDto, @PathVariable long id) {
        return userServiceImpl.updateUser(userDto, id);
    }

    @GetMapping("/findAll")
    public List<UserDto> findAll() {
        return userServiceImpl.findAllUser();
    }

    @DeleteMapping("/delete")
    public void deleteUser(@RequestParam Long id) {
        userServiceImpl.deleteUser(id);

    }
}
