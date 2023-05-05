package com.example.hangkhong.restapi;

import com.example.hangkhong.dto.MayBayDTO;
import com.example.hangkhong.dto.NhanVienDTO;
import com.example.hangkhong.entities.MayBay;
import com.example.hangkhong.entities.NhanVien;
import com.example.hangkhong.services.MayBayService;
import com.example.hangkhong.services.NhanVienService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class NhanVienResource implements NhanVienAPI{
    public final NhanVienService nhanVienService;

    @Override
    public ResponseEntity<NhanVien> createNhanVien(NhanVienDTO nhanVienDTO) {
        NhanVien nhanVien = nhanVienService.createNhanVien(nhanVienDTO);
        return ResponseEntity.created(URI.create("/api/chuyenbay" + nhanVien.getMaNv())).body(nhanVien);
    }

    @Override
    public ResponseEntity<List<NhanVienDTO>> createAllNhanVien(List<NhanVienDTO> nhanVienDTOs) {
        List<NhanVien> nhanVienList = nhanVienService.createAllNhanVien(nhanVienDTOs);
        return ResponseEntity.created(URI.create("/api/maybay/all")).body(nhanVienDTOs);
    }
}
