package org.example.travelservice.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.travelservice.domain.Travel;
import org.example.travelservice.dto.TravelResponse;
import org.example.travelservice.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/travels")
public class TravelController {

    private final TravelService travelService;

    @Autowired
    ObjectMapper objectMapper;

    @GetMapping
    public ResponseEntity<List<TravelResponse>> getTravels(
            @RequestParam(required = false, defaultValue = "0", value = "page") int pageNo){

        log.info("============================================");
        return ResponseEntity.ok(travelService.findAll(pageNo));
    }

    @GetMapping("/sido")
    public ResponseEntity<List<TravelResponse>> findBysido(
            @RequestParam("sidoCode") int sidoCode,
            @RequestParam(required = false, defaultValue = "0", value = "page") int pageNo){

        return ResponseEntity.ok(travelService.findBysido(sidoCode, pageNo));
    }

    @GetMapping("/gugun")
    public ResponseEntity<List<TravelResponse>> findByGugun(
            @RequestParam("gugunCode") int gugunCode,
            @RequestParam(required = false, defaultValue = "0", value = "page") int pageNo){

        return ResponseEntity.ok(travelService.findByGugun(gugunCode, pageNo));
    }

    @GetMapping("/keyword")
    public ResponseEntity<List<TravelResponse>> findByKeyword(
            @RequestParam("keyword") String keyword,
            @RequestParam(required = false, defaultValue = "0", value = "page") int pageNo){

        return ResponseEntity.ok(travelService.findByKeyword(keyword, pageNo));
    }

}
