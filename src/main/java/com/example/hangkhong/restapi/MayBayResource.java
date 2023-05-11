package com.example.hangkhong.restapi;

import com.example.hangkhong.dto.MayBayDTO;
import com.example.hangkhong.entities.MayBay;
import com.example.hangkhong.services.MayBayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class MayBayResource implements MayBayAPI{
    public final MayBayService mayBayService;
    @Override
    public ResponseEntity<MayBay> createMayBay(MayBayDTO mayBayDTO) {
        MayBay mayBay = mayBayService.createMayBay(mayBayDTO);
        return ResponseEntity.created(URI.create("/api/maybay" + mayBay.getMaMb())).body(mayBay);
    }

    @Override
    public ResponseEntity<List<MayBayDTO>> createAllMayBay(List<MayBayDTO> mayBayDTOs) {
        List<MayBay> mayBayList = mayBayService.createAllMayBay(mayBayDTOs);
        return ResponseEntity.created(URI.create("/api/maybay/all")).body(mayBayDTOs);
    }

    @Override
    public ResponseEntity<List<MayBayDTO>> getAllMayBay() {
        return ResponseEntity.ok(mayBayService.getAllMayBay());
    }

    @Override
    public ResponseEntity<List<MayBayDTO>> getAllBoeing() {
        return ResponseEntity.ok(mayBayService.getAllBoeing());
    }

    @Override
    public ResponseEntity<List<MayBayDTO>> getAllAirbus() {
        return ResponseEntity.ok(mayBayService.getAllAirbus());
    }

    @Override
    public ResponseEntity<List<MayBayDTO>> getAllOther() {
        return ResponseEntity.ok(mayBayService.getAllOther());
    }

    @Override
    public ResponseEntity<MayBayDTO> getMayBayById(Integer maMb) {
        return ResponseEntity.ok(mayBayService.getMayBayById(maMb));
    }
}
