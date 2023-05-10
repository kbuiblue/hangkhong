package com.example.hangkhong.mappers;

import com.example.hangkhong.dto.ChungNhanDTO;
import com.example.hangkhong.entities.ChungNhan;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ChungNhanMapper {
    ChungNhanMapper INSTANCE = Mappers.getMapper(ChungNhanMapper.class);

    ChungNhanDTO toChungNhanDTO(ChungNhan chungNhan);

    List<ChungNhanDTO> toChungNhanDTOs(List<ChungNhan> chungNhanList);
}
