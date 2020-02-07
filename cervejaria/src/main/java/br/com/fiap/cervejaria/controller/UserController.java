package br.com.fiap.cervejaria.controller;

import br.com.fiap.cervejaria.dto.CreateUserDTO;
import br.com.fiap.cervejaria.dto.UserDTO;
import br.com.fiap.cervejaria.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("users")
public class UserController {

    public UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO create(@RequestBody CreateUserDTO createUserDTO) {
        return userService.create(createUserDTO);
    }
}
