package com.example.hangkhong.restapi;

import com.example.hangkhong.dto.MayBayArrayDTO;
import com.example.hangkhong.dto.MayBayDTO;
import com.example.hangkhong.entities.MayBay;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(value = "/api/maybay")
public interface MayBayAPI {
    @PostMapping("/create")
    ResponseEntity<MayBay> createMayBay(@RequestBody MayBayDTO mayBayDTO);

    @PostMapping("/createAll")
    ResponseEntity<List<MayBayDTO>> createAllMayBay(@RequestBody List<MayBayDTO> mayBayDTOs);

}
