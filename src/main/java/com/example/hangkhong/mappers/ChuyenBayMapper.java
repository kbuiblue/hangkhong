package com.example.hangkhong.mappers;

import com.example.hangkhong.dto.ChuyenBayDTO;
import com.example.hangkhong.entities.ChuyenBay;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ChuyenBayMapper {
    ChuyenBayMapper INSTANCE = Mappers.getMapper(ChuyenBayMapper.class);

    ChuyenBayDTO toChuyenBayDTO (ChuyenBay chuyenBay);

    List<ChuyenBayDTO> toChuyenBayDTOs(List<ChuyenBay> chuyenBayList);
}
