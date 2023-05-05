package com.example.hangkhong.repositories;

import com.example.hangkhong.entities.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, Long> {
}
