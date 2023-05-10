package com.example.phongo.service;

import com.example.phongo.model.DichVu;

import java.util.Optional;

public interface DichVuService {
    void save(DichVu dichVu);//thêm dịch vụ hoặc chỉnh sửa dịch vụ
    void delete(DichVu dichVu);
    Iterable<DichVu>findAllDichVu();
    Optional<DichVu> findDichVuById(Long id);
}
