package org.rabin.cashier.dal.dtos;

public record CreateStuffDto(
        String name,

        String stuffGroup,

        Long price,

        Long amount

) {
}
