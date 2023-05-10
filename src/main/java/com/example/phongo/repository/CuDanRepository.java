package com.example.phongo.repository;

import com.example.phongo.model.ChungCu;
import com.example.phongo.model.CuDan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuDanRepository extends JpaRepository<CuDan, Long> {
}
