package com.example.hangkhong.restapi;

import com.example.hangkhong.dto.NhanVienDTO;
import com.example.hangkhong.entities.NhanVien;
import com.example.hangkhong.services.NhanVienService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class NhanVienResource implements NhanVienAPI {
    public final NhanVienService nhanVienService;

    @Override
    public ResponseEntity<NhanVien> createNhanVien(NhanVienDTO nhanVienDTO) {
        NhanVien nhanVien = nhanVienService.createNhanVien(nhanVienDTO);
        return ResponseEntity.created(URI.create("/api/nhanvien" + nhanVien.getMaNv())).body(nhanVien);
    }

    @Override
    public ResponseEntity<List<NhanVienDTO>> createAllNhanVien(List<NhanVienDTO> nhanVienDTOs) {
        return ResponseEntity.created(URI.create("/api/nhanvien/all")).body(nhanVienDTOs);
    }

    @Override
    public ResponseEntity<List<NhanVienDTO>> getAllNhanVienNamedNguyen() {
        return ResponseEntity.ok(nhanVienService.getAllNhanVienNamedNguyen());
    }

    @Override
    public ResponseEntity<NhanVienDTO> getNhanVienByMaNv(String manv) {
        return ResponseEntity.ok(nhanVienService.getNhanVienByMaNv(manv));
    }

    @Override
    public ResponseEntity<List<NhanVienDTO>> getAllNhanVienWithLuongHigherThan(int luong) {
        return ResponseEntity.ok(nhanVienService.getAllNhanVienWithLuongHigherThan(luong));
    }

    @Override
    public ResponseEntity<List<NhanVienDTO>> getAllNhanVienWithLuongAboveAverage() {
        return ResponseEntity.ok(nhanVienService.getAllNhanVienWithLuongAboveAverage());
    }

    @Override
    public ResponseEntity<Integer> getTotalLuong() {
        return ResponseEntity.ok(nhanVienService.getTotalLuong());
    }
}
