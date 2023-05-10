package com.example.phongo.repository;

import com.example.phongo.model.ChungCu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChungCuRepository extends JpaRepository<ChungCu, Long> {
}
