package com.example.hangkhong.services;

import com.example.hangkhong.dto.ChungNhanDTO;
import com.example.hangkhong.dto.CountChungNhanDTO;
import com.example.hangkhong.dto.CountPhiCongDTO;
import com.example.hangkhong.entities.ChungNhan;
import com.example.hangkhong.repositories.ChungNhanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ChungNhanService {
    private final ChungNhanRepository chungNhanRepository;

    public ChungNhan createChungNhan(ChungNhanDTO chungNhanDTO) {
        ChungNhan chungNhan = new ChungNhan();
        chungNhan.setMaNv(chungNhanDTO.getMaNv());
        chungNhan.setMaMb(chungNhanDTO.getMaMb());
        return chungNhanRepository.save(chungNhan);
    }

    public List<ChungNhan> createAllChungNhan(List<ChungNhanDTO> chungNhanDTOs) {
        List<ChungNhan> chungNhanList = new ArrayList<>();

        for (ChungNhanDTO chungNhanDTO : chungNhanDTOs) {
            ChungNhan chungNhan = new ChungNhan();
            chungNhan.setMaNv(chungNhanDTO.getMaNv());
            chungNhan.setMaMb(chungNhanDTO.getMaMb());
            chungNhanList.add(chungNhan);
        }
        return chungNhanRepository.saveAll(chungNhanList);
    }

    public ChungNhan getChungNhanByMaChungNhan(int maChungNhan) {
        return chungNhanRepository.getChungNhanByMaChungNhan(maChungNhan);
    }

    public List<ChungNhan> getAllChungNhanByMaMb(int maMb) {
        return chungNhanRepository.getAllChungNhanByMaMb(maMb);
    }

    public List<ChungNhan> getAllChungNhanByMaNv(String maNv) {
        return chungNhanRepository.getAllChungNhanByMaNv(maNv);
    }

    public List<CountChungNhanDTO> countChungNhanPerNhanVien() {
        return chungNhanRepository.countChungNhanPerNhanVien();
    }

    public CountPhiCongDTO countChungNhanPerMaMb(int maMb) {
        return chungNhanRepository.countChungNhanPerMaMb(maMb);
    }
}
