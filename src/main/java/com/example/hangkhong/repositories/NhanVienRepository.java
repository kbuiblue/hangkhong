package com.example.hangkhong.repositories;

import com.example.hangkhong.entities.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NhanVienRepository extends JpaRepository<NhanVien, String> {
    @Query(value = "SELECT * FROM nhanvien WHERE ten LIKE 'Nguyen%'",
            nativeQuery = true)
    List<NhanVien> getAllNhanVienNamedNguyen();

    @Query(value = "SELECT * FROM nhanvien WHERE manv LIKE :manv", nativeQuery = true)
    NhanVien getNhanVienByMaNv(@Param("manv") String manv);

    @Query(value = "SELECT * FROM nhanvien WHERE luong > :luong", nativeQuery = true)
    List<NhanVien> getAllNhanVienWithLuongHigherThan(@Param("luong") int luong);

    @Query(value = "SELECT * FROM nhanvien WHERE luong > (SELECT AVG(luong) FROM nhanvien)", nativeQuery = true)
    List<NhanVien> getAllNhanVienWithLuongAboveAverage();

    @Query(value = "SELECT SUM(luong) FROM nhanvien", nativeQuery = true)
    Integer getTotalLuong();
}
