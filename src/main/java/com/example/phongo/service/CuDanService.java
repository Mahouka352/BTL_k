package com.example.phongo.service;

import com.example.phongo.model.CuDan;

import java.util.Optional;

public interface CuDanService {
    void save(CuDan cuDan);//cả insert vs update
    void delete(CuDan cuDan);//xóa dữ liệu cư dân
    Iterable<CuDan>findAllCuDan();//lấy ra tất cả cư cân
    Optional<CuDan>findByIdCuDan(Long id);//lấy cư dân theo id;
}
