package org.example.travelservice.service;

import lombok.RequiredArgsConstructor;
import org.example.travelservice.domain.Travel;
import org.example.travelservice.dto.TravelResponse;
import org.example.travelservice.repository.TravelRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class TravelService {

    private final TravelRepository travelRepository;
    private final int PAGE_SIZE = 10;


    public List<TravelResponse> findAll(int pageNum){
        PageRequest pageRequest = PageRequest.of(pageNum, PAGE_SIZE);
        return travelRepository.findAll(pageRequest).stream().map(Travel::toDto)
                .collect(Collectors.toList());
    }
    public List<TravelResponse> findBysido(int sidoCode, int pageNum){
        PageRequest pageRequest = PageRequest.of(pageNum, PAGE_SIZE);
        return travelRepository.findBySidoCode(sidoCode, pageRequest).stream().map(Travel::toDto)
                .collect(Collectors.toList());
    }

    public List<TravelResponse> findByGugun(int gugunCode, int pageNum){
        PageRequest pageRequest = PageRequest.of(pageNum, PAGE_SIZE);
        return travelRepository.findByGugunCode(gugunCode, pageRequest).stream().map(Travel::toDto)
                .collect(Collectors.toList());
    }

    public List<TravelResponse> findByKeyword(String keyword, int pageNum){
        PageRequest pageRequest = PageRequest.of(pageNum, PAGE_SIZE);
        return travelRepository.findAllByTitleContains(keyword, pageRequest).stream().map(Travel::toDto)
                .collect(Collectors.toList());
    }



}
