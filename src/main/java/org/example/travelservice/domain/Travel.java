package org.example.travelservice.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.example.travelservice.dto.TravelResponse;

import java.math.BigDecimal;

@ToString
@Getter @Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "attraction_info")
@Entity
public class Travel {

    @Id
    private Integer content_id;
    private Integer contentTypeId;
    private String title;
    private String addr1;
    private String addr2;
    private String zipcode;
    private String tel;
    private String firstImage;
    private String firstImage2;
    private Integer readcount;
    private Integer sidoCode;
    private Integer gugunCode;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String mlevel;


    @Builder
    public TravelResponse toDto() {
        return TravelResponse.builder()
                .title(title)
                .addr1(addr1)
                .latitude(latitude)
                .longitude(longitude)
                .build();
    }
}
