package com.example.hangkhong.repositories;

import com.example.hangkhong.entities.MayBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, Integer> {
}
