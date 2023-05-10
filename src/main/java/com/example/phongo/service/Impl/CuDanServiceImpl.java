package com.example.phongo.service.Impl;

import com.example.phongo.model.CuDan;
import com.example.phongo.repository.CuDanRepository;
import com.example.phongo.service.CuDanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CuDanServiceImpl implements CuDanService {
    @Autowired
    private CuDanRepository cuDanRepository;

    @Override
    public void save(CuDan cuDan) {
        cuDanRepository.save(cuDan);
    }

    @Override
    public void delete(CuDan cuDan) {
        cuDanRepository.delete(cuDan);
    }

    @Override
    public Iterable<CuDan> findAllCuDan() {
        return cuDanRepository.findAll();
    }

    @Override
    public Optional<CuDan> findByIdCuDan(Long id) {
        return cuDanRepository.findById(id);
    }
}
