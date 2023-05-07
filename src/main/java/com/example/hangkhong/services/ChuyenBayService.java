package com.example.hangkhong.services;

import com.example.hangkhong.dto.ChuyenBayDTO;
import com.example.hangkhong.entities.ChuyenBay;
import com.example.hangkhong.repositories.ChuyenBayRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ChuyenBayService {
    private final ChuyenBayRepository chuyenBayRepository;

    public ChuyenBay createChuyenBay(ChuyenBayDTO chuyenBayDTO) {
        ChuyenBay chuyenBay = new ChuyenBay();
        chuyenBay.setGaDi(chuyenBayDTO.getGaDi());
        chuyenBay.setGaDen(chuyenBayDTO.getGaDen());
        chuyenBay.setDoDai(chuyenBayDTO.getDoDai());
        chuyenBay.setGioDi(chuyenBayDTO.getGioDi());
        chuyenBay.setGioDen(chuyenBayDTO.getGioDen());
        chuyenBay.setChiPhi(chuyenBayDTO.getChiPhi());
        return chuyenBayRepository.save(chuyenBay);
    }

    public List<ChuyenBay> createAllChuyenBay(List<ChuyenBayDTO> chuyenBayDTOs) {
        List<ChuyenBay> chuyenBayList = new ArrayList<>();

        for (ChuyenBayDTO chuyenBayDTO: chuyenBayDTOs) {
            ChuyenBay chuyenBay = new ChuyenBay();
            chuyenBay.setGaDi(chuyenBayDTO.getGaDi());
            chuyenBay.setGaDen(chuyenBayDTO.getGaDen());
            chuyenBay.setDoDai(chuyenBayDTO.getDoDai());
            chuyenBay.setGioDi(chuyenBayDTO.getGioDi());
            chuyenBay.setGioDen(chuyenBayDTO.getGioDen());
            chuyenBay.setChiPhi(chuyenBayDTO.getChiPhi());
            chuyenBayRepository.save(chuyenBay);
        }
        return chuyenBayRepository.saveAll(chuyenBayList);
    }

    public List<ChuyenBay> getChuyenBayByGaDi(String gaDi) {
        return chuyenBayRepository.getChuyenBayByGaDi(gaDi);
    }

    public List<ChuyenBay> getChuyenBayByGaDen(String gaDen) {
        return chuyenBayRepository.getChuyenBayByGaDen(gaDen);
    }

    public List<ChuyenBay> getChuyenBayBeforeGioDi(LocalTime gio) {
        return chuyenBayRepository.getChuyenBayBeforeGioDi(gio);
    }

    public List<ChuyenBay> getChuyenBayBetweenGioDi(LocalTime gio1, LocalTime gio2) {
        return chuyenBayRepository.getChuyenBayBetweenGioDi(gio1, gio2);
    }

    public ChuyenBay getLongestChuyenBay() {
        return chuyenBayRepository.getLongestChuyenBay();
    }
}
