package org.rabin.cashier.dal.dtos;

public record RegisterDto(
        String nationalCode,

        String password,

        String confirmPassword
) {
}
