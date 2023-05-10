package com.example.hangkhong.mappers;

import com.example.hangkhong.dto.MayBayDTO;
import com.example.hangkhong.entities.MayBay;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MayBayMapper {
    MayBayMapper INSTANCE = Mappers.getMapper(MayBayMapper.class);

    MayBayDTO toMayBayDTO(MayBay mayBay);

    List<MayBayDTO> toMayBayDTOs(List<MayBay> mayBayList);
}
