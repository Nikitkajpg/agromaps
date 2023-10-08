package com.td.agromaps.controllers;

import com.td.agromaps.dto.UserDTO;
import com.td.agromaps.dto.UserResponse;
import com.td.agromaps.models.User;
import com.td.agromaps.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
@CrossOrigin("http://localhost:8081/")
public class UserController {
    private UserService userService;
    private ModelMapper modelMapper;

    @Autowired
    public UserController(UserService userService, ModelMapper modelMapper) {
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    private User convertToUser(UserDTO userDTO) {
        return modelMapper.map(userDTO, User.class);
    }

    private UserDTO convertToUserDTO(User user) {
        return modelMapper.map(user, UserDTO.class);
    }

    @GetMapping
    public UserResponse showUsers() {
        return new UserResponse(userService.findAll().stream()
                .map(this::convertToUserDTO).collect(Collectors.toList()));
    }
}
