package com.example.hangkhong.restapi;

import com.example.hangkhong.dto.ChungNhanDTO;
import com.example.hangkhong.dto.CountChungNhanDTO;
import com.example.hangkhong.dto.CountPhiCongDTO;
import com.example.hangkhong.entities.ChungNhan;
import com.example.hangkhong.services.ChungNhanService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ChungNhanResource implements ChungNhanAPI {
    public final ChungNhanService chungNhanService;

    @Override
    public ResponseEntity<ChungNhan> createChungNhan(ChungNhanDTO chungNhanDTO) {
        ChungNhan chungNhan = chungNhanService.createChungNhan(chungNhanDTO);
        return ResponseEntity.created(URI.create("/api/chungnhan" + chungNhan.getMaChungNhan())).body(chungNhan);
    }

    @Override
    public ResponseEntity<List<ChungNhanDTO>> createAllChungNhan(List<ChungNhanDTO> chungNhanDTOs) {
        List<ChungNhan> chungNhanList = chungNhanService.createAllChungNhan(chungNhanDTOs);
        return ResponseEntity.created(URI.create("/api/chungnhan/all")).body(chungNhanDTOs);
    }

    @Override
    public ResponseEntity<ChungNhanDTO> getChungNhanByMaChungNhan(int maChungNhan) {
        return ResponseEntity.ok(chungNhanService.getChungNhanByMaChungNhan(maChungNhan));
    }

    @Override
    public ResponseEntity<List<ChungNhanDTO>> getAllChungNhanByMaMb(int maMb) {
        return ResponseEntity.ok(chungNhanService.getAllChungNhanByMaMb(maMb));
    }

    @Override
    public ResponseEntity<List<ChungNhanDTO>> getAllChungNhanByMaNv(String maNv) {
        return ResponseEntity.ok(chungNhanService.getAllChungNhanByMaNv(maNv));
    }

    @Override
    public ResponseEntity<List<CountChungNhanDTO>> countChungNhanPerNhanVien() {
        return ResponseEntity.ok(chungNhanService.countChungNhanPerNhanVien());
    }

    @Override
    public ResponseEntity<CountPhiCongDTO> countChungNhanPerMaMb(int maMb) {
        return ResponseEntity.ok(chungNhanService.countChungNhanPerMaMb(maMb));
    }
}
