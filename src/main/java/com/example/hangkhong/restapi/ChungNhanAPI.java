package com.example.hangkhong.restapi;

import com.example.hangkhong.dto.ChungNhanDTO;
import com.example.hangkhong.entities.ChungNhan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(value = "/api/chungnhan")
public interface ChungNhanAPI {

    @PostMapping("/create")
    ResponseEntity<ChungNhan> createChungNhan(@RequestBody ChungNhanDTO chungNhanDTO);

    @PostMapping("/createAll")
    ResponseEntity<List<ChungNhanDTO>> createAllChungNhan(@RequestBody List<ChungNhanDTO> chungNhanDTOs);
}
