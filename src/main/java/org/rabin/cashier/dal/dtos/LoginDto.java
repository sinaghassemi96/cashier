package org.rabin.cashier.dal.dtos;

public record LoginDto(
        String token,

        String refreshToken
) {
}
