package com.example.hangkhong.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MayBayArrayDTO {
    private List<MayBayDTO> mayBayDTOList;
}
