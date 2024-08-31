package org.rabin.cashier.services;

import org.rabin.cashier.dal.dtos.LoginDto;
import org.rabin.cashier.dal.dtos.LoginRequestDto;
import org.rabin.cashier.dal.dtos.RegisterDto;

public interface UserService {
    LoginDto login(LoginRequestDto dto);

    LoginDto register(RegisterDto dto);
}
