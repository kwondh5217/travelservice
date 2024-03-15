package org.example.travelservice.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class TravelResponse {
    private String title;
    private String addr1;
    private BigDecimal latitude;
    private BigDecimal longitude;
}
