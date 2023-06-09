package com.example.hangkhong.services;

import com.example.hangkhong.dto.MayBayDTO;
import com.example.hangkhong.entities.MayBay;
import com.example.hangkhong.mapper.MayBayMapper;
import com.example.hangkhong.repositories.MayBayRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public List<MayBayDTO> getAllMayBay() {
        return MayBayMapper.INSTANCE.toMayBayDTOs(mayBayRepository.findAll());
    }

    public List<MayBayDTO> getAllBoeing() {
        return MayBayMapper.INSTANCE.toMayBayDTOs(mayBayRepository.getAllBoeing());
    }

    public List<MayBayDTO> getAllAirbus() {
        return MayBayMapper.INSTANCE.toMayBayDTOs(mayBayRepository.getAllAirbus());
    }

    public List<MayBayDTO> getAllOther() {
        return MayBayMapper.INSTANCE.toMayBayDTOs(mayBayRepository.getAllOther());
    }

    public MayBayDTO getMayBayById(int maMb) {
        return MayBayMapper.INSTANCE.toMayBayDTO(mayBayRepository.getMayBayById(maMb));
    }
}
