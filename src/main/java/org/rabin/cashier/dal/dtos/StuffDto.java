package org.rabin.cashier.dal.dtos;

public record StuffDto(
        long id,
        String name,

        String description,

        byte[] content
) {
}
