package com.example.hangkhong.services;

import com.example.hangkhong.dto.ChungNhanDTO;
import com.example.hangkhong.dto.CountChungNhanDTO;
import com.example.hangkhong.dto.CountPhiCongDTO;
import com.example.hangkhong.entities.ChungNhan;
import com.example.hangkhong.mapper.ChungNhanMapper;
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

    public ChungNhanDTO getChungNhanByMaChungNhan(int maChungNhan) {
        return ChungNhanMapper.INSTANCE.toChungNhanDTO(chungNhanRepository.getChungNhanByMaChungNhan(maChungNhan));
    }

    public List<ChungNhanDTO> getAllChungNhanByMaMb(int maMb) {
        return ChungNhanMapper.INSTANCE.toChungNhanDTOs(chungNhanRepository.getAllChungNhanByMaMb(maMb));
    }

    public List<ChungNhanDTO> getAllChungNhanByMaNv(String maNv) {
        return ChungNhanMapper.INSTANCE.toChungNhanDTOs(chungNhanRepository.getAllChungNhanByMaNv(maNv));
    }

    public List<CountChungNhanDTO> countChungNhanPerNhanVien() {
        return chungNhanRepository.countChungNhanPerNhanVien();
    }

    public CountPhiCongDTO countChungNhanPerMaMb(int maMb) {
        return chungNhanRepository.countChungNhanPerMaMb(maMb);
    }
}
