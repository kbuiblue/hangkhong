package com.example.hangkhong.restapi;

import com.example.hangkhong.dto.ChuyenBayDTO;
import com.example.hangkhong.entities.ChuyenBay;
import com.example.hangkhong.entities.MayBay;
import com.example.hangkhong.services.ChuyenBayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ChuyenBayResource implements ChuyenBayAPI{
    public final ChuyenBayService chuyenBayService;

    @Override
    public ResponseEntity<ChuyenBay> createChuyenBay(ChuyenBayDTO chuyenBayDTO) {
        ChuyenBay chuyenBay = chuyenBayService.createChuyenBay(chuyenBayDTO);
        return ResponseEntity.created(URI.create("/api/chuyenbay" + chuyenBay.getMaCb())).body(chuyenBay);
    }

    @Override
    public ResponseEntity<List<ChuyenBayDTO>> createAllChuyenBay(List<ChuyenBayDTO> chuyenBayDTOs) {
        List<ChuyenBay> chuyenBayList = chuyenBayService.createAllChuyenBay(chuyenBayDTOs);
        return ResponseEntity.created(URI.create("/api/maybay/all")).body(chuyenBayDTOs);
    }
}
