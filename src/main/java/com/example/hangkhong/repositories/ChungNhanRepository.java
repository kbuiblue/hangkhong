package com.example.hangkhong.repositories;

import com.example.hangkhong.entities.ChungNhan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChungNhanRepository extends JpaRepository<ChungNhan, Long> {
}
