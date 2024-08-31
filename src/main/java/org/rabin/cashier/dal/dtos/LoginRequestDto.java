package org.rabin.cashier.dal.dtos;

import lombok.Builder;

@Builder(toBuilder = true)
public record LoginRequestDto(
        String username,
        String password


) {
}
