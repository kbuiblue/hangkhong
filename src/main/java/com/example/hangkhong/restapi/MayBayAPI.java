package com.example.hangkhong.restapi;

import com.example.hangkhong.dto.MayBayDTO;
import com.example.hangkhong.entities.MayBay;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/api/maybay")
public interface MayBayAPI {
    @PostMapping("/create")
    ResponseEntity<MayBay> createMayBay(@RequestBody MayBayDTO mayBayDTO);

    @PostMapping("/createAll")
    ResponseEntity<List<MayBayDTO>> createAllMayBay(@RequestBody List<MayBayDTO> mayBayDTOs);

    @GetMapping
    ResponseEntity<List<MayBayDTO>> getAllMayBay();

    @GetMapping("/boeing")
    ResponseEntity<List<MayBayDTO>> getAllBoeing();

    @GetMapping("/airbus")
    ResponseEntity<List<MayBayDTO>> getAllAirbus();

    @GetMapping("/other")
    ResponseEntity<List<MayBayDTO>> getAllOther();

    @GetMapping("/id")
    ResponseEntity<MayBayDTO> getMayBayById(@RequestParam int maMb);

}
