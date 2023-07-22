package det.ey.validationService.controller;

import det.ey.validationService.dto.BookingInfoDto;
import det.ey.validationService.producer.TicketBookingValidationProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/testservice")
public class ValidationBookingController {

    private TicketBookingValidationProducer validationProducer;

    public ValidationBookingController(TicketBookingValidationProducer validationProducer) {
        this.validationProducer = validationProducer;
    }

    @GetMapping("/test")
    public String testService(){

        return "Service is work successfully";
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody BookingInfoDto infoDto){
        validationProducer.publishPayload(infoDto);
        return ResponseEntity.ok("Json message sent to kafka topic");
    }


}
