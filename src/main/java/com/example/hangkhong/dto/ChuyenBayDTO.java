package com.example.hangkhong.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChuyenBayDTO {

    private String gaDi;
    private String gaDen;
    private int doDai;
    private LocalTime gioDi;
    private LocalTime gioDen;
    private int chiPhi;
}
