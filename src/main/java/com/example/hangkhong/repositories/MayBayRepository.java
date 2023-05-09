package com.example.hangkhong.repositories;

import com.example.hangkhong.entities.MayBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, Integer> {
    List<MayBay> getAllBoeing();
    List<MayBay> getAllAirbus();
    List<MayBay> getAllOther();
    MayBay getMayBayById(int maMb);
}
