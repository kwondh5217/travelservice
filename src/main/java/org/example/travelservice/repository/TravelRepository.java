package org.example.travelservice.repository;

import org.example.travelservice.domain.Travel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TravelRepository extends JpaRepository<Travel, Integer> {
    Page<Travel> findBySidoCode(int sidoCode, Pageable pageable);
    Page<Travel> findByGugunCode(int gugunCode, Pageable pageable);

    Page<Travel> findAllByTitleContains(String region, Pageable pageable);

}
