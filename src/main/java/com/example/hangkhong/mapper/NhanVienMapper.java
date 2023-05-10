package com.example.hangkhong.mapper;

import com.example.hangkhong.dto.NhanVienDTO;
import com.example.hangkhong.entities.NhanVien;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface NhanVienMapper {
    NhanVienMapper INSTANCE = Mappers.getMapper(NhanVienMapper.class);

    NhanVienDTO toNhanVienDTO(NhanVien nhanVien);

    List<NhanVienDTO> toNhanVienDTOs(List<NhanVien> nhanVienList);
}
