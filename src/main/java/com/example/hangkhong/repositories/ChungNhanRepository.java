package com.example.hangkhong.repositories;

import com.example.hangkhong.dto.CountChungNhanDTO;
import com.example.hangkhong.dto.CountPhiCongDTO;
import com.example.hangkhong.entities.ChungNhan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChungNhanRepository extends JpaRepository<ChungNhan, Long> {
    ChungNhan getChungNhanByMaChungNhan(@Param("machungnhan") int maChungNhan);

    List<ChungNhan> getAllChungNhanByMaMb(@Param("mamb") int maMb);

    List<ChungNhan> getAllChungNhanByMaNv(@Param("manv") String maNv);
    @Query(name = "countChungNhanPerNhanVien", nativeQuery = true)
    List<CountChungNhanDTO> countChungNhanPerNhanVien();
    @Query(name = "countChungNhanPerMaMb", nativeQuery = true)
    CountPhiCongDTO countChungNhanPerMaMb(@Param("mamb") int maMb);
}
