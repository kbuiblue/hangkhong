package com.example.hangkhong.services;

import com.example.hangkhong.dto.MayBayDTO;
import com.example.hangkhong.entities.MayBay;
import com.example.hangkhong.repositories.MayBayRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MayBayService {
    private final MayBayRepository mayBayRepository;

    public MayBay createMayBay(MayBayDTO mayBayDTO) {
        MayBay mayBay = new MayBay();
        mayBay.setMaMb(mayBayDTO.getMaMb());
        mayBay.setLoai(mayBayDTO.getLoai());
        mayBay.setTamBay(mayBayDTO.getTamBay());
        return mayBayRepository.save(mayBay);
    }

    public List<MayBay> createAllMayBay(List<MayBayDTO> mayBayDTOs) {
        List<MayBay> mayBayList = new ArrayList<>();

        for (MayBayDTO mayBayDTO: mayBayDTOs) {
            MayBay mayBay = new MayBay();
            mayBay.setMaMb(mayBayDTO.getMaMb());
            mayBay.setLoai(mayBayDTO.getLoai());
            mayBay.setTamBay(mayBayDTO.getTamBay());
            mayBayList.add(mayBay);
        }
        return mayBayRepository.saveAll(mayBayList);
    }

}
