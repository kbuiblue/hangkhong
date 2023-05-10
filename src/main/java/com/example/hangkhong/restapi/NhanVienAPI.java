package com.example.hangkhong.restapi;

import com.example.hangkhong.dto.NhanVienDTO;
import com.example.hangkhong.entities.NhanVien;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/api/nhanvien")
public interface NhanVienAPI {
    @PostMapping("create")
    ResponseEntity<NhanVien> createNhanVien(@RequestBody NhanVienDTO nhanVienDTO);

    @PostMapping("/createAll")
    ResponseEntity<List<NhanVienDTO>> createAllNhanVien(@RequestBody List<NhanVienDTO> nhanVienDTOs);

    @GetMapping("/allNguyen")
    ResponseEntity<List<NhanVienDTO>> getAllNhanVienNamedNguyen();

    @GetMapping
    ResponseEntity<NhanVienDTO> getNhanVienByMaNv(String manv);

    @GetMapping("/luongHigherThan")
    ResponseEntity<List<NhanVienDTO>> getAllNhanVienWithLuongHigherThan(@RequestParam int luong);

    @GetMapping("/luongAboveAverage")
    ResponseEntity<List<NhanVienDTO>> getAllNhanVienWithLuongAboveAverage();

    @GetMapping("/totalLuong")
    ResponseEntity<Integer> getTotalLuong();
}
