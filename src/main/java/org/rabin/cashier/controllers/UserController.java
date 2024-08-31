package org.rabin.cashier.controllers;

import lombok.RequiredArgsConstructor;
import org.rabin.cashier.dal.dtos.LoginDto;
import org.rabin.cashier.dal.dtos.LoginRequestDto;
import org.rabin.cashier.dal.dtos.RegisterDto;
import org.rabin.cashier.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("login")
    public ResponseEntity<LoginDto> login(@RequestBody LoginRequestDto dto) {
        return ResponseEntity
                .ok()
                .body(userService.login(dto));
    }

    @PostMapping
    public ResponseEntity<LoginDto> register(@RequestBody RegisterDto dto) {
        return ResponseEntity
                .ok()
                .body(userService.register(dto));
    }

}
