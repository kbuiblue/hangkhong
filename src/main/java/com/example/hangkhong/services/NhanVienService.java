package com.example.hangkhong.services;

import com.example.hangkhong.dto.NhanVienDTO;
import com.example.hangkhong.entities.NhanVien;
import com.example.hangkhong.repositories.NhanVienRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NhanVienService {
    private final NhanVienRepository nhanVienRepository;
    public NhanVien createNhanVien(NhanVienDTO nhanVienDTO) {
        NhanVien nhanVien = new NhanVien();
        nhanVien.setMaNv(nhanVienDTO.getMaNv());
        nhanVien.setTen(nhanVienDTO.getTen());
        nhanVien.setLuong(nhanVienDTO.getLuong());
        return nhanVienRepository.save(nhanVien);
    }

    public List<NhanVien> createAllNhanVien(List<NhanVienDTO> nhanVienDTOs) {
        List<NhanVien> nhanVienList = new ArrayList<>();

        for (NhanVienDTO nhanVienDTO: nhanVienDTOs) {
            NhanVien nhanVien = new NhanVien();
            nhanVien.setMaNv(nhanVienDTO.getMaNv());
            nhanVien.setTen(nhanVienDTO.getTen());
            nhanVien.setLuong(nhanVienDTO.getLuong());
            nhanVienList.add(nhanVien);
        }
        return nhanVienRepository.saveAll(nhanVienList);
    }

    public List<NhanVien> getAllNhanVienNamedNguyen() {
        return nhanVienRepository.getAllNhanVienNamedNguyen();
    }

    public NhanVien getNhanVienByMaNv(String manv) {
        return nhanVienRepository.getNhanVienByMaNv(manv);
    }

    public List<NhanVien> getAllNhanVienWithLuongHigherThan(int luong) {
        return nhanVienRepository.getAllNhanVienWithLuongHigherThan(luong);
    }

    public List<NhanVien> getAllNhanVienWithLuongAboveAverage() {
        return nhanVienRepository.getAllNhanVienWithLuongAboveAverage();
    }

    public Integer getTotalLuong() {
        return nhanVienRepository.getTotalLuong();
    }
}
