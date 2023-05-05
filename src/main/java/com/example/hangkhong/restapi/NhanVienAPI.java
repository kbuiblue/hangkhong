package com.example.hangkhong.restapi;

import com.example.hangkhong.dto.NhanVienDTO;
import com.example.hangkhong.entities.NhanVien;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(value = "/api/nhanvien")
public interface NhanVienAPI {
    @PostMapping("create")
    ResponseEntity<NhanVien> createNhanVien(@RequestBody NhanVienDTO nhanVienDTO);

    @PostMapping("/createAll")
    ResponseEntity<List<NhanVienDTO>> createAllNhanVien(@RequestBody List<NhanVienDTO> nhanVienDTOs);
}
