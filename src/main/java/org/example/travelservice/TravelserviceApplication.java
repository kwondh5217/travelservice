package org.example.travelservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://127.0.1.1:5500")
@SpringBootApplication
public class TravelserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelserviceApplication.class, args);
    }

}
