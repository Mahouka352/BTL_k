package com.example.phongo.service.Impl;

import com.example.phongo.model.CanHo;
import com.example.phongo.repository.CanHoRepository;
import com.example.phongo.service.CanHoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CanHoServiceImpl implements CanHoService {

    @Autowired
    private CanHoRepository canHoRepository;

    @Override
    public void insert(CanHo canHo) {
        canHoRepository.save(canHo);
    }

    @Override
    public void delete(CanHo canHo) {
        canHoRepository.delete(canHo);
    }

    @Override
    public Iterable<CanHo> getAllCanHo() {
        return canHoRepository.findAll();
    }

    @Override
    public Optional<CanHo> getCanHoById(Long id) {
        return canHoRepository.findById(id);
    }
}
