package org.rabin.cashier.controllers;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.rabin.cashier.dal.dtos.CreateStuffDto;
import org.rabin.cashier.dal.dtos.StuffDto;
import org.rabin.cashier.services.StuffService;
import org.springframework.data.web.PagedModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/stuffs")
@RequiredArgsConstructor
public class StuffController {

    private final StuffService service;

    @PostMapping
    public void create(@RequestBody CreateStuffDto dto,
                       HttpServletRequest request) {
        service.create(dto, request);
    }

    @PatchMapping("{id}")
    public void edit(@PathVariable Long id,
                     @RequestBody CreateStuffDto dto,
                     HttpServletRequest request) {
        service.edit(id, dto, request);
    }

    @GetMapping
    public ResponseEntity<PagedModel<StuffDto>>
    getAll(@RequestParam(name = "group", required = false) String group,
           @RequestParam(name = "page-size", required = false, defaultValue = "10") int pageSize,
           @RequestParam(name = "page-number", required = false, defaultValue = "1") int pageNumber,
           @RequestParam(name = "keyword", required = false, defaultValue = "") String keyword) {
        return ResponseEntity
                .ok()
                .body(service.getAll(group, pageSize, pageNumber, keyword));
    }

    @GetMapping("{id}")
    public ResponseEntity<StuffDto> get(@PathVariable(name = "id") Long id) {
        return ResponseEntity
                .ok()
                .body(service.get(id));
    }

}
