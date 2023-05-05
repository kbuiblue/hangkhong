package com.example.hangkhong.restapi;

import com.example.hangkhong.dto.ChuyenBayDTO;
import com.example.hangkhong.entities.ChuyenBay;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(value = "/api/chuyenbay")
public interface ChuyenBayAPI {

    @PostMapping("/create")
    ResponseEntity<ChuyenBay> createChuyenBay(@RequestBody ChuyenBayDTO chuyenBayDTO);

    @PostMapping("/createAll")
    ResponseEntity<List<ChuyenBayDTO>> createAllChuyenBay(@RequestBody List<ChuyenBayDTO> chuyenBayDTOs);
}
