package org.rabin.cashier.services.impl;

import jakarta.servlet.http.HttpServletRequest;
import org.rabin.cashier.dal.dtos.CreateStuffDto;
import org.rabin.cashier.dal.dtos.StuffDto;
import org.rabin.cashier.services.StuffService;
import org.springframework.data.web.PagedModel;
import org.springframework.stereotype.Service;

@Service
public class StuffServiceImpl implements StuffService {
    @Override
    public void create(CreateStuffDto dto, HttpServletRequest request) {

    }

    @Override
    public void edit(Long id, CreateStuffDto dto, HttpServletRequest request) {

    }

    @Override
    public PagedModel<StuffDto> getAll(String group, int pageSize, int pageNumber, String keyword) {
        return null;
    }

    @Override
    public StuffDto get(Long id) {
        return null;
    }
}
