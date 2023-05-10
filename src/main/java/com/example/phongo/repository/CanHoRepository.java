package com.example.phongo.repository;

import com.example.phongo.model.CanHo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CanHoRepository extends JpaRepository<CanHo, Long> {
}
