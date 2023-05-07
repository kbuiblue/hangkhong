package com.example.hangkhong.repositories;

import com.example.hangkhong.entities.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalTime;
import java.util.List;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, Long> {
    @Query("FROM ChuyenBay WHERE gaDi LIKE :gaDi")
    List<ChuyenBay> getChuyenBayByGaDi(@Param("gaDi") String gaDi);

    @Query("FROM ChuyenBay WHERE gaDen LIKE :gaDen")
    List<ChuyenBay> getChuyenBayByGaDen(@Param("gaDen") String gaDen);

    @Query("FROM ChuyenBay WHERE gioDi < :gio")
    List<ChuyenBay> getChuyenBayBeforeGioDi(@Param("gio") LocalTime gio);

    @Query("FROM ChuyenBay WHERE gioDi BETWEEN :gio1 AND :gio2")
    List<ChuyenBay> getChuyenBayBetweenGioDi(@Param("gio1") LocalTime gio1,
                                             @Param("gio2") LocalTime gio2);

    @Query("FROM ChuyenBay WHERE dodai = (SELECT MAX(CAST (dodai AS int)) FROM ChuyenBay)")
    ChuyenBay getLongestChuyenBay();
}
