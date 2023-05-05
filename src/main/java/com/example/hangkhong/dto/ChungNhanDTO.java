package com.example.hangkhong.dto;

import com.example.hangkhong.entities.MayBay;
import com.example.hangkhong.entities.NhanVien;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChungNhanDTO {
    private NhanVien maNv;
    private MayBay maMb;
}
