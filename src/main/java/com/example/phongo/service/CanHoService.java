package com.example.phongo.service;

import com.example.phongo.model.CanHo;

import java.util.Optional;

public interface CanHoService {
    void insert(CanHo canHo);
    void delete(CanHo canHo);
    Iterable<CanHo>getAllCanHo();
    Optional<CanHo> getCanHoById(Long id);

}
