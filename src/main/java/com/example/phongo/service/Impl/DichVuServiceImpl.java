package com.example.phongo.service.Impl;

import com.example.phongo.model.DichVu;
import com.example.phongo.repository.DichVuRepository;
import com.example.phongo.service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DichVuServiceImpl implements DichVuService {

    @Autowired
    private DichVuRepository dichVuRepository;


    @Override
    public void save(DichVu dichVu) {
        dichVuRepository.save(dichVu);
    }

    @Override
    public void delete(DichVu dichVu) {
        dichVuRepository.delete(dichVu);
    }

    @Override
    public Iterable<DichVu> findAllDichVu() {
        return dichVuRepository.findAll();
    }

    @Override
    public Optional<DichVu> findDichVuById(Long id) {
        return dichVuRepository.findById(id);
    }
}
