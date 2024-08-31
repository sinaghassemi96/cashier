package org.rabin.cashier.services.impl;

import org.rabin.cashier.dal.dtos.LoginDto;
import org.rabin.cashier.dal.dtos.LoginRequestDto;
import org.rabin.cashier.dal.dtos.RegisterDto;
import org.rabin.cashier.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public LoginDto login(LoginRequestDto dto) {
        return null;
    }

    @Override
    public LoginDto register(RegisterDto dto) {
        return null;
    }
}
