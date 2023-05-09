package com.example.hangkhong.restapi;

import com.example.hangkhong.dto.ChuyenBayDTO;
import com.example.hangkhong.entities.ChuyenBay;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.List;

@RequestMapping(value = "/api/chuyenbay")
public interface ChuyenBayAPI {

    @PostMapping("/create")
    ResponseEntity<ChuyenBay> createChuyenBay(@RequestBody ChuyenBayDTO chuyenBayDTO);

    @PostMapping("/createAll")
    ResponseEntity<List<ChuyenBayDTO>> createAllChuyenBay(@RequestBody List<ChuyenBayDTO> chuyenBayDTOs);

    @GetMapping("/gadi")
    ResponseEntity<List<ChuyenBayDTO>> getChuyenBayByGaDi(@RequestParam String gaDi);

    @GetMapping("/gaden")
    ResponseEntity<List<ChuyenBayDTO>> getChuyenBayByGaDen(@RequestParam String gaDen);

    @GetMapping("/beforegiodi")
    ResponseEntity<List<ChuyenBayDTO>> getChuyenBayBeforeGioDi
            (@RequestParam("gio") @DateTimeFormat(iso = DateTimeFormat.ISO.TIME) LocalTime gio);

    @GetMapping("/betweengiodi")
    ResponseEntity<List<ChuyenBayDTO>> getChuyenBayBetweenGioDi
            (@RequestParam("gio1") @DateTimeFormat(iso = DateTimeFormat.ISO.TIME) LocalTime gio1,
             @RequestParam("gio2") @DateTimeFormat(iso = DateTimeFormat.ISO.TIME) LocalTime gio2);

    @GetMapping("/longest")
    ResponseEntity<ChuyenBayDTO> getLongestChuyenBay();
}
