package com.example.hangkhong.restapi;

import com.example.hangkhong.dto.ChuyenBayDTO;
import com.example.hangkhong.entities.ChuyenBay;
import com.example.hangkhong.services.ChuyenBayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ChuyenBayResource implements ChuyenBayAPI {
    public final ChuyenBayService chuyenBayService;

    @Override
    public ResponseEntity<ChuyenBay> createChuyenBay(ChuyenBayDTO chuyenBayDTO) {
        ChuyenBay chuyenBay = chuyenBayService.createChuyenBay(chuyenBayDTO);
        return ResponseEntity.created(URI.create("/api/chuyenbay" + chuyenBay.getMaCb())).body(chuyenBay);
    }

    @Override
    public ResponseEntity<List<ChuyenBayDTO>> createAllChuyenBay(List<ChuyenBayDTO> chuyenBayDTOs) {
        return ResponseEntity.created(URI.create("/api/chuyenbay/all")).body(chuyenBayDTOs);
    }

    @Override
    public ResponseEntity<List<ChuyenBayDTO>> getChuyenBayByGaDi(String gaDi) {
        return ResponseEntity.ok(chuyenBayService.getChuyenBayByGaDi(gaDi));
    }

    @Override
    public ResponseEntity<List<ChuyenBayDTO>> getChuyenBayByGaDen(String gaDen) {
        return ResponseEntity.ok(chuyenBayService.getChuyenBayByGaDen(gaDen));
    }

    @Override
    public ResponseEntity<List<ChuyenBayDTO>> getChuyenBayBeforeGioDi(LocalTime gio) {
        return ResponseEntity.ok(chuyenBayService.getChuyenBayBeforeGioDi(gio));
    }

    @Override
    public ResponseEntity<List<ChuyenBayDTO>> getChuyenBayBetweenGioDi(LocalTime gio1, LocalTime gio2) {
        return ResponseEntity.ok(chuyenBayService.getChuyenBayBetweenGioDi(gio1, gio2));
    }

    @Override
    public ResponseEntity<ChuyenBayDTO> getLongestChuyenBay() {
        return ResponseEntity.ok(chuyenBayService.getLongestChuyenBay());
    }
}
