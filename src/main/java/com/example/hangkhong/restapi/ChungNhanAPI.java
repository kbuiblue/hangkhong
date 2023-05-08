package com.example.hangkhong.restapi;

import com.example.hangkhong.dto.ChungNhanDTO;
import com.example.hangkhong.dto.CountChungNhanDTO;
import com.example.hangkhong.entities.ChungNhan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/api/chungnhan")
public interface ChungNhanAPI {

    @PostMapping("/create")
    ResponseEntity<ChungNhan> createChungNhan(@RequestBody ChungNhanDTO chungNhanDTO);

    @PostMapping("/createAll")
    ResponseEntity<List<ChungNhanDTO>> createAllChungNhan(@RequestBody List<ChungNhanDTO> chungNhanDTOs);

    @GetMapping("/maChungNhan")
    ResponseEntity<ChungNhan> getChungNhanByMaChungNhan(@RequestParam int maChungNhan);

    @GetMapping("/maMb")
    ResponseEntity<List<ChungNhan>> getAllChungNhanByMaMb(@RequestParam int maMb);

    @GetMapping("/maNv")
    ResponseEntity<List<ChungNhan>> getAllChungNhanByMaNv(@RequestParam String maNv);

    @GetMapping("/chungNhanNumber")
    ResponseEntity<List<CountChungNhanDTO>> countChungNhanPerNhanVien();
}
