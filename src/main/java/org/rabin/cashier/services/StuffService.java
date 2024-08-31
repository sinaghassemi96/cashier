package org.rabin.cashier.services;

import jakarta.servlet.http.HttpServletRequest;
import org.rabin.cashier.dal.dtos.CreateStuffDto;
import org.rabin.cashier.dal.dtos.StuffDto;
import org.springframework.data.web.PagedModel;

public interface StuffService {
    void create(CreateStuffDto dto, HttpServletRequest request);

    void edit(Long id, CreateStuffDto dto, HttpServletRequest request);

    PagedModel<StuffDto> getAll(String group, int pageSize, int pageNumber, String keyword);

    StuffDto get(Long id);
}
