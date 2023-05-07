package com.example.hangkhong.restapi;

import com.example.hangkhong.dto.MayBayDTO;
import com.example.hangkhong.entities.MayBay;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping(value = "/api/maybay")
public interface MayBayAPI {
    @PostMapping("/create")
    ResponseEntity<MayBay> createMayBay(@RequestBody MayBayDTO mayBayDTO);

    @PostMapping("/createAll")
    ResponseEntity<List<MayBayDTO>> createAllMayBay(@RequestBody List<MayBayDTO> mayBayDTOs);

    @GetMapping
    ResponseEntity<List<MayBay>> getAllMayBay();
    @GetMapping("/boeing")
    ResponseEntity<List<MayBay>> getAllBoeing();

    @GetMapping("/airbus")
    ResponseEntity<List<MayBay>> getAllAirbus();

    @GetMapping("/other")
    ResponseEntity<List<MayBay>> getAllOther();

    @GetMapping("/id")
    ResponseEntity<Optional<MayBay>> getMayBayById(@RequestParam int maMb);

}
