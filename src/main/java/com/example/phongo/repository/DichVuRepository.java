package com.example.phongo.repository;

import com.example.phongo.model.CuDan;
import com.example.phongo.model.DichVu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DichVuRepository extends JpaRepository<DichVu, Long> {
}
