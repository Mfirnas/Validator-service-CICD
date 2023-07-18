package det.ey.validationService.controller;

import det.ey.validationService.producer.ValidationProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/validate")
public class ValidatorController {


    private ValidationProducer validationProducer;

    public ValidatorController(ValidationProducer validationProducer) {
        this.validationProducer = validationProducer;
    }

    @PostMapping("/booking")
    public ResponseEntity<String> publish(@RequestParam("message") String message){
        validationProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to the topic");
    }
}
