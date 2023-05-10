package com.example.hangkhong.restapi;

import com.example.hangkhong.dto.ChungNhanDTO;
import com.example.hangkhong.dto.CountChungNhanDTO;
import com.example.hangkhong.dto.CountPhiCongDTO;
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
    ResponseEntity<ChungNhanDTO> getChungNhanByMaChungNhan(@RequestParam int maChungNhan);

    @GetMapping("/maMb")
    ResponseEntity<List<ChungNhanDTO>> getAllChungNhanByMaMb(@RequestParam int maMb);

    @GetMapping("/maNv")
    ResponseEntity<List<ChungNhanDTO>> getAllChungNhanByMaNv(@RequestParam String maNv);

    @GetMapping("/chungNhanNumber")
    ResponseEntity<List<CountChungNhanDTO>> countChungNhanPerNhanVien();

    @GetMapping("/soPhiCong")
    ResponseEntity<CountPhiCongDTO> countChungNhanPerMaMb(@RequestParam int maMb);
}
